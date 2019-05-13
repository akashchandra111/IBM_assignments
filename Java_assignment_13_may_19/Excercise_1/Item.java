package src.item;

public abstract class Item	{
	private long uid;
	private String title;
	private int copies;

	//Constructors
	public Item()	{
		this.uid = 0L;
		this.title = "";
		this.copies = 0;
	}

	public Item(long uid, String title, int copies)	{
		this.uid = uid;
		this.title = title;
		this.copies = copies;
	}

	//Getters
	public long getUID()	{
		return this.uid;
	}

	public String getTitle()	{
		return this.title;
	}

	public int getCopies()	{
		return this.copies;
	}

	//Setters
	public void setUID(long uid)	{
		this.uid = uid;
	}

	public void setTitle(String title)	{
		this.title = title;
	}

	public void setCopies(int copies)	{
		this.copies = copies;
	}

	//Abstract method
	//equals method
	public boolean equals(Item i)	{
		if (this.uid == i.uid && this.title.equals(i.title) && this.copies == i.copies)	return true;
		else return false;
	}

	//toString method
	@Override
	public String toString()	{
		return this.title + " has uid: " + this.uid + "with " + this.copies + " sold";
	}

	//print method
	public void print()	{
		System.out.println(this.toString());
	}

	//checkIn method
	public abstract void checkIn(int copies);

	//checkOut method
	public abstract void checkOut(int copies);

	//addItem method
	public abstract void addItem();
}
