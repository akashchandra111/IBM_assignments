//package src;

//MediaItem imports
import src.item.MediaItem.CD;
import src.item.MediaItem.Video;

//WrittenItem imports
import src.item.WrittenItem.Book;
import src.item.WrittenItem.JournalPaper;

public class Library	{
	public static void main(String... args)	{
		CD musicCD = new CD((long)212345, "Good Years", 10, 40, "Zayn Malik", "Club");

		Video musicVideo = new Video();
		musicVideo.setUID((long)212423);
		musicVideo.setTitle("Nine Track Mind!");
		musicVideo.setCopies(20);
		musicVideo.setDirector("Charlie Puth");
		musicVideo.setGenre("English Pop");
		musicVideo.setYearReleased(2015);

		Book harryPotter_1 = new Book((long)212688, "Harry Potter: 1", 61, "J.K. Rowling");
		Book harryPotter_2 = new Book((long)212618, "Harry Potter: 2", 68, "J.K. Rowling");

		JournalPaper theJournal = new JournalPaper();
		theJournal.setUID((long)212890);
		theJournal.setTitle("The breakthrough in computing!");
		theJournal.setCopies(200);
		theJournal.setAuthor("Akash Chandra");
		theJournal.setYearPublished(2050);

		//Checking the implementation [addItem]
		musicCD.addItem();
		System.out.println();
		musicVideo.addItem();
		System.out.println();
		harryPotter_1.addItem();
		System.out.println();
		theJournal.addItem();
		System.out.println();

		//[checkIn]
		musicCD.checkIn(20);
		musicVideo.checkIn(30);
		harryPotter_1.checkIn(90);
		theJournal.checkIn(200);

		//[checkOut]
		musicCD.checkOut(15);
		musicVideo.checkOut(21);
		harryPotter_1.checkOut(88);
		theJournal.checkOut(150);

		//[print];
		musicCD.print();
		System.out.println();
		musicVideo.print();
		System.out.println();
		harryPotter_1.print();
		System.out.println();
		theJournal.print();
		System.out.println();

		//Checking for books
		System.out.println("Comparing harryPotter_1 with harryPotter_2");
		if(harryPotter_1.equals(harryPotter_2))	System.out.println("Both books are same!");
		else	System.out.println("Both books are different");

		System.out.println("Comparing harryPotter_1 with harryPotter_1");
		if(harryPotter_1.equals(harryPotter_1))	System.out.println("Both books are same!");
		else	System.out.println("Both books are different");
	}
}
