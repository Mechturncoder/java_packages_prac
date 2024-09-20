package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class SongsPortal {
	public static void main(String[] args) {
		SongCollections s = new SongCollections();
		List<Songs> songlist = s.initializeSongsData();
		
//		1. Display list of song
		s.printSongData(songlist);
		
//		2. Sort song by title
		System.out.println("==========================");
		System.out.println("Sorting Song by Title");
		Collections.sort(songlist, new SongNameComparator());
		s.printSongData(songlist);
		
		
//		3. Sort songs for release year
		System.out.println("==========================");
		System.out.println("Sorting Song by Release Year");
		Collections.sort(songlist, new SongYearComparator());
		s.printSongData(songlist);
		
		
//		4. Search song by title
		System.out.println("==========================");
		System.out.println("Searching Song by Title");
		int index = Collections.binarySearch(songlist, new Songs(0, "abc", 0, null), new SongNameComparator());
		System.out.println("Found at index : " + index);
		
//		5. Create list of songs released in current year
		System.out.println("==========================");
		System.out.println("Creating list of songs released in current year");
		int currentYear = 2024;
		List<Songs> songreleased = s.filterListByYear(songlist, currentYear);
		s.printSongData(songreleased);
		
//		6. Create a list of songs by specific artist
		System.out.println("==========================");
		System.out.println("Creating a list of songs by specific artist");
		ArrayList<Songs> filtered = s.filterList(songlist, "Arijit Singh");
		s.printSongData(filtered);
		
//		7. create a listing to show song title and release year
		System.out.println("==========================");
		System.out.println("Creating list to show title and release year");
		HashMap<String, Integer> list = s.getSongbyListing(songlist);
		s.printSongDataMap(list);
	}
}
