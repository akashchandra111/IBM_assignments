import java.util.Queue;
import java.util.LinkedList;

class QueueDemo	{
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		//Adding 100 members;
		for(int i=0; i<100; ++i)	queue.add(i);

		System.out.println("Elements: " + queue);

		//Removing 50 members;
		for(int i=0; i<50; ++i)	{
			int removedElement = queue.remove();
			System.out.print("rem element:" + removedElement + ", ");
		}

		//go for the head
		System.out.println("Current Head: " + queue.peek());
		System.out.println("Current Size: " + queue.size());


	}
}
