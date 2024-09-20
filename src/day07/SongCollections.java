package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class SongCollections {
	
	
	public List<Songs> initializeSongsData(){
		List<Songs> song = new ArrayList<Songs>();
		TreeSet<String> artist1 = new TreeSet<>();
		artist1.add("Ayush Mishra");
		
		Songs s1 = new Songs(101, "def", 2019, artist1);
		
		TreeSet<String> artist2 = new TreeSet<>();
		artist2.add("Arijit Singh");
		
		Songs s2 = new Songs(566, "abc" , 2018, artist2);
		
		TreeSet<String> artist3 = new TreeSet<>();
		artist3.add("Sonu Nigam");
		Songs s3 = new Songs(567, "jkl" , 2024, artist3);
		
		TreeSet<String> artist4 = new TreeSet<>();
		artist4.add("papon");
		Songs s4 = new Songs(568, "ghi" , 2024, artist4);
		
		song.add(s1);
		song.add(s2);
		song.add(s3);
		song.add(s4);
		
		return song;
		
	}
	
	public List<Songs> addSongs(List<Songs> son , Songs s)
	{
		son.add(s);
		return son;
	}
	public Songs getSongs(List<Songs> son, int serno)
	{
		for(Songs s : son)
		{
			if(s.getSerialNo()==serno)
			{
				return s;
			}
		}
		return null;
	}
	
	public Songs getSongsByYear(List<Songs> son, int year)
	{
		for(Songs s : son)
		{
			if(s.getYear()==year)
			{
				return s;
			}
		}
		return null;
	}
	
	public ArrayList<Songs> filterListByYear(List<Songs> son, int year) {
		// TODO Auto-generated method stub
		ArrayList<Songs> filtered = new ArrayList<>();
		for(Songs s: son)
		{
			if(s.getYear()==year)
			{
				filtered.add(s);
			}
		}
		return filtered;
	}
	public ArrayList<Songs> filterList(List<Songs> son, String predicate) {
		// TODO Auto-generated method stub
		ArrayList<Songs> filtered = new ArrayList<>();
		for(Songs s: son)
		{
			if(s.getArtist().contains(predicate))
			{
				filtered.add(s);
			}
		}
		return filtered;
	}
	
	public void printSongData(List<Songs> son)
	{
		for(Songs s : son)
		{
			System.out.println(s);
		}
	}
	
	public HashMap<String, Integer> getSongbyListing(List<Songs> son){
		HashMap<String, Integer> map = new HashMap<>();
		for(Songs s: son) {
			map.put(s.getTitle(), s.getYear());
		}
		
		return map;
	}
	
	public void printSongDataMap(HashMap<String, Integer> son)
	{
		for(String key : son.keySet())
		{
			System.out.println(key + ", " + son.get(key));
		}
	}

}
