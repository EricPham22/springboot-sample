package Randomizer;

import java.util.Collections;
import java.util.List;

import com.example.topify.Model.Song;

public class Randomizer {
	
	public Randomizer() {
		
	}
	
	public static Song randomSong(List<Song> songs) {
		Collections.shuffle(songs);
		return songs.get(0);
	}
}
