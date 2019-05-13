package src.item.WrittenItem;
import src.item.WrittenItem.WrittenItem;

public class Book extends WrittenItem	{

	//Constructors
	public Book()	{
		super();
	}

	public Book(long uid, String title, int copies, String author)	{
		super(uid, title, copies, author);
	}

	//overridden methods
	@Override
	public String toString()	{
		return "[Book] " + super.toString();
	}

/*
	@Override
	public void print()	{
		System.out.println(this.toString());
	}
*/

}
