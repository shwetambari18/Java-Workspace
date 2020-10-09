package LinkedLists;

import java.util.ArrayList;

public class Album {
	
	private String name;
	private ArrayList<Song> songs;
	
	public Album(String name) {
		super();
		this.name = name;
		this.songs = new ArrayList<Song>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}
	
	public void addSongs(String title,int duration)
	{
		this.songs.add(new Song(title, duration));
	}
	
	
	
}
