package day07;

import java.util.Comparator;

public class SongYearComparator implements Comparator<Songs>{

	@Override
	public int compare(Songs o1, Songs o2) {
		// TODO Auto-generated method stub
		return o1.getYear() - o2.getYear(); 
	}


}
