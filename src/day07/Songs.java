package day07;

import java.util.TreeSet;

public class Songs {
	private int serialNo ;
	private String title;
	private int year;
	TreeSet<String> artist;
	
	
	public int getSerialNo() {
		return serialNo;
	}

	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}

	public TreeSet<String> getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return "Songs [serialNo=" + serialNo + ", title=" + title + ", year=" + year + ", artist=" + artist + "]";
	}

	public Songs(int serialNo, String title, int year, TreeSet<String> artist) {
		super();
		this.serialNo = serialNo;
		this.title = title;
		this.year = year;
		this.artist = artist;
	}
}
