package com.example.topify.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.topify.Model.Genre;
import com.example.topify.Repo.GenreRepository;

@RestController
@CrossOrigin(origins = "*")
public class GenreController {

	@Autowired
	private GenreRepository genreRepo;
	
	@GetMapping("Genre")
	public List<Genre> getAll() {
		return genreRepo.findAll();
	}
	
}
