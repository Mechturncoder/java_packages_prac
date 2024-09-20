package day09;

import java.util.TreeSet;

public class Articles {
	private int srno;
	private String subject;
	private int yearOfPublish;
	private int views;
	TreeSet<String> categories;
	
	public int getSrno() {
		return srno;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public int getViews() {
		return views;
	}
	
	public TreeSet<String> getCategories() {
		return categories;
	}

	public Articles(int srno, String subject, int yearOfPublish, int views, TreeSet<String> categories) {
		super();
		this.srno = srno;
		this.subject = subject;
		this.yearOfPublish = yearOfPublish;
		this.views = views;
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Articles [srno=" + srno + ", subject=" + subject + ", yearOfPublish=" + yearOfPublish + ", views="
				+ views + ", categories=" + categories + "]";
	}
	

}
