package LinkedLists;

public class Song {

	private String title;
	private int duration;
	
	
	
	public Song(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	public int getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + "]";
	}
	
	
}
