import java.lang.Runnable;
import java.lang.Thread;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

class Lambda	{
	private Integer id;
	private static int counter=0;

	public Lambda()	{
		id = Lambda.counter++;
	}

	public static void main(String[] args) {

		//Trying out lambda thing
		//Can only be used with functional interfaces[interface which has only one method]


		//implementing runnable run interface in one line to print the text
		Runnable runner = ()->	{
			System.out.println("This syntax works post Java8");
		};

		//implementing the Implement interface defined below this class interface
		Implement im = ()->	{
			System.out.println("Returns 100");
			return 100;
		};

		//implementing one line adder interface
		Adder add = (num1, num2)->	num1 + num2;

		//ArrayList to test the Comparator interface for comparing according to ID.
		ArrayList<Lambda> alist = new ArrayList();

		alist.add(new Lambda());
		alist.add(new Lambda());
		alist.add(new Lambda());
		alist.add(new Lambda());

		//Comparator can be implemented but Comparable cannot because we can't refer to first object as this [in anyway]
		Comparator compare = (Object obj1, Object obj2)->	-((Lambda)obj1).id.compareTo(((Lambda)obj2).id);

		//Sorting is done here.
		Collections.sort(alist, compare);

		//Printing data
		System.out.println("im.implementPrint(): " + im.implementPrint());
		System.out.println("add.add(10, 20): " + add.add(10, 20));

		Iterator iter = alist.iterator();
		while(iter.hasNext())	System.out.println("list: " + iter.next());

		//Running thread
		new Thread(runner).start();

	}

	@Override
	public String toString()	{
		return super.toString() + " , id: " + this.id;

	}
}

interface Implement	{
	public abstract int implementPrint();
}

interface Adder	{
	public abstract int add(int num1, int num2);
}

interface Comparable	{
	public abstract int compareTo(Object obj);
}
