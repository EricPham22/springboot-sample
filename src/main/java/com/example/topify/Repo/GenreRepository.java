package com.example.topify.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.topify.Model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
