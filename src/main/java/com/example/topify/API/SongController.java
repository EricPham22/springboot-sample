package com.example.topify.API;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.topify.Model.Song;
import com.example.topify.Repo.SongRepository;
import Randomizer.Randomizer;

@RestController
@CrossOrigin(origins = "*")
public class SongController {

	@Autowired
	private SongRepository songRepo;

	@GetMapping("/Songs")
	public List<Song> getAll() {
		return songRepo.findAll();
	}	
	
	@GetMapping(value="Songs/filterByGenre")
	public List<Song> findByGenre(@RequestParam(value="genre") String genre) {
		return songRepo.findByGenre(genre);
	}
	
	@GetMapping(value="Songs/Genre")
	public Song findSongByGenre(@RequestParam(value="genre") String genre) {
		List<Song> allSongsInGenre = songRepo.findByGenre(genre);
		return Randomizer.randomSong(allSongsInGenre);
	}
	
	@PostMapping(value="/Songs")
	public Song addSong(@RequestBody Song song) {
		return this.songRepo.save(song);
	}
	
	
	
}
