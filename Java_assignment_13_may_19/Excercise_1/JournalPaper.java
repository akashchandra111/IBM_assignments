package src.item.WrittenItem;
import src.item.WrittenItem.WrittenItem;

public class JournalPaper extends WrittenItem	{
	private int yearPublished;

	//Constructors
	public JournalPaper()	{
		super();
		this.yearPublished = 2000;
	}

	public JournalPaper(long uid, String title, int copies, String author, int yearPublished)	{
		super(uid, title, copies, author);
		this.yearPublished = yearPublished;
	}

	//Getter
	public int getYearPublished()	{
		return this.yearPublished;
	}

	//Setter
	public void setYearPublished(int yearPublished)	{
		this.yearPublished = yearPublished;
	}

	//equals method (overloaded)
	public boolean equals(JournalPaper jp)	{
		if(super.equals(jp) && this.yearPublished == jp.getYearPublished()) return true;
		else return false;
	}

	@Override
	public String toString()	{
		return "[JournalPaper] " + super.toString();
	}

	@Override
	public void print()	{
		System.out.println(this.toString());
	}
}
