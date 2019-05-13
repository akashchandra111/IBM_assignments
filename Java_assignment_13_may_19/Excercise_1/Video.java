package src.item.MediaItem;
import src.item.MediaItem.MediaItem;

public class Video extends MediaItem	{
	private String director;
	private String genre;
	private int yearReleased;

	//Constructors
	public Video()	{
		super();
		this.director = "";
		this.genre = "";
		this.yearReleased = 2000;
	}

	public Video(long uid, String title, int copies, long runTime, String director, String genre, int yearReleased)	{
		super(uid, title, copies, runTime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}

	//Getters
	public String getDirector()	{
		return this.director;
	}

	public String getGenre()	{
		return this.genre;
	}

	public int getYearReleased()	{
		return this.yearReleased;
	}

	//Setters
	public void setDirector(String director)	{
		this.director = director;
	}

	public void setGenre(String genre)	{
		this.genre = genre;
	}

	public void setYearReleased(int yearReleased)	{
		this.yearReleased = yearReleased;
	}

	//equals method (overloaded)
	public boolean equals(Video v)	{
		if(super.equals(v) && this.director == v.getDirector() && this.genre == v.getGenre() && this.yearReleased == v.getYearReleased())	return true;
		else	return false;
	}

	@Override
	public String toString()	{
		return super.toString() + ". director: " + this.director + " genre: " + this.genre + " release year: " + this.yearReleased;
	}

	@Override
	public void print()	{
		System.out.println(this.toString());
	}
}
