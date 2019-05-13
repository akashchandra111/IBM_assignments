package src.item.MediaItem;
import src.item.MediaItem.MediaItem;

public class CD extends MediaItem	{
	private String artist;
	private String genre;

	//Constructors
	public CD()	{
		super();
		this.artist = "";
		this.genre = "";
	}

	public CD(long uid, String title, int copies, long runTime, String artist, String genre)	{
		super(uid, title, copies, runTime);
		this.artist = artist;
		this.genre = genre;
	}

	//Getters
	public String getArtist()	{
		return this.artist;
	}

	public String getGenre()	{
		return this.genre;
	}

	//Setters
	public void setArtist(String artist)	{
		this.artist = artist;
	}

	public void setGenre(String genre)	{
		this.genre = genre;
	}

	//equals method (overloaded)
	public boolean equals(CD cd)	{
		if(super.equals(cd) && this.artist == cd.getArtist() && this.genre == cd.getGenre())	return true;
		else	return false;
	}

	@Override
	public String toString()	{
		return super.toString() + ". artist: " + this.artist + " genre: " + this.genre;
	}

	@Override
	public void print()	{
		System.out.println(this.toString());
	}
}
