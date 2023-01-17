package com.example.topify.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Genre")
public class Genre {
	
	@Id
	@Column(name="Genre")
	private String genre;
	public Genre() {
		
	}
	
	public Genre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
}
