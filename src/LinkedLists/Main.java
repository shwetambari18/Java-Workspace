package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Song> playlist = new LinkedList<Song>();
		ArrayList<Album> albums = new ArrayList<Album>();
				
		Album album = new Album("Queen");
		album.addSongs("Harjaiya", 23);
		album.addSongs("Thumakda London", 45);
		album.addSongs("Tune pilayi hai", 32);
		albums.add(album);
		
		album = new Album("Dance Songs");
		album.addSongs("Tamma loge", 11);
		album.addSongs("Muqabla", 22);
		album.addSongs("Tenu suit suit jarda", 15);
		albums.add(album);
		
		playlist.add(albums.get(0).getSongs().get(0));
		playlist.add(albums.get(0).getSongs().get(1));
		playlist.add(albums.get(0).getSongs().get(2));
		playlist.add(albums.get(1).getSongs().get(0));
		playlist.add(albums.get(1).getSongs().get(1));
		playlist.add(albums.get(1).getSongs().get(2));
		
		traversePlayList(playlist);
	}
	
	public static void traversePlayList(LinkedList<Song> playlist)
	{
		boolean quit=false;
		printMenu();
		boolean goingForward =true;
		ListIterator<Song> songIterator = playlist.listIterator();
		
		if(playlist.isEmpty())
		{
			System.out.println("No songs in playlist!");
		}
		else
		{
			System.out.println("Playing songs in playlist..");
		
			while(!quit)
			{
				//System.out.println("Please enter your choice!");
				int choice = scanner.nextInt();
				scanner.nextLine();
				switch(choice)
				{
					case 0:
						quit = true;
						break;
					case 1:
							if(!goingForward)
							{
								if(songIterator.hasNext())
									songIterator.next();
								else
									goingForward = true;
							}
							if(songIterator.hasNext())
							{
								System.out.println(songIterator.next().toString());
							}
							else
							{
								System.out.println("We reached at end of list!");
								goingForward = false;
							}
						break;
					case 2:
						if(goingForward)
						{
							if(songIterator.hasPrevious())
								songIterator.previous();
							else
								goingForward = false;
						}
						if(songIterator.hasPrevious())
						{
							System.out.println(songIterator.previous());
						}
						else
						{
							System.out.println("We reached at start of playlist");
							goingForward = true;
						}
						break;
						
					case 3:
						
						break;
					case 4:
						System.out.println("Playlist contents:");
						for(Song song : playlist)
						{
							System.out.println("Title : " + song.getTitle() + "Album name: " );
						}
						break;
				}
			}
		}
			
	}
	
	public static  void printMenu()
	{
		System.out.println("0 Quit");
		System.out.println("1 Skip Forward");
		System.out.println("2 Skip Backward");
		System.out.println("3 Replay Current Song");
		System.out.println("4 Print Playlist");
	}

}
