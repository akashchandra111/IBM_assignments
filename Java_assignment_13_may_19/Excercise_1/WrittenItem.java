package src.item.WrittenItem;

import src.item.Item;

public class WrittenItem extends Item	{
	private String author;

	//Constructors
	public WrittenItem()	{
		super();
		this.author = "";
	}

	public WrittenItem(long uid, String title, int copies, String author)	{
		super(uid, title, copies);
		this.author = author;
	}

	//Getter
	public String getAuthor()	{
		return this.author;
	}

	//Setter
	public void setAuthor(String author)	{
		this.author = author;
	}

	//equals method (Overloaded)
	public boolean equals(WrittenItem wi)	{
		if(super.equals(wi) && this.getAuthor().equals(wi.getAuthor()))	return true;
		else return false;
	}

	//toString method
	@Override
	public String toString()	{
		return super.toString() + " and author is: " + this.author;
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
