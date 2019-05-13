package src.item.MediaItem;

import src.item.Item;

public class MediaItem extends Item	{
	private long runTime;

	//Constructors
	public MediaItem()	{
		super();
		this.runTime = 0L;
	}

	public MediaItem(long uid, String title, int copies, long runTime)	{
		super(uid, title, copies);
		this.runTime = runTime;
	}

	//Getter
	public long getRunTime()	{
		return this.runTime;
	}

	//Setter
	public void setRunTime(long runTime)	{
		this.runTime = runTime;
	}

	//equals method (Overloaded)
	public boolean equals(MediaItem mi)	{
		if(super.equals(mi) && this.runTime == mi.getRunTime())	return true;
		else	return false;
	}

	//toString method
	@Override
	public String toString()	{
		return super.toString() + " and runtime is: " + this.runTime;
	}

	@Override
	public void print()	{
		System.out.println(this.toString());
	}

	@Override
	public void checkIn(int copies)	{
		this.setCopies(this.getCopies() + copies);
	}

	@Override
	public void checkOut(int copies)	{
		this.setCopies(this.getCopies() - copies);
	}

	//addItem (overloaded)
	public void addItem()	{
		System.out.print("[Stub] addItem: " + this.toString());
	}
}
