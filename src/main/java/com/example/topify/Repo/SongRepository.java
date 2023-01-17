package com.example.topify.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.topify.Model.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
	
	List<Song> findByGenre(String genre);
}
