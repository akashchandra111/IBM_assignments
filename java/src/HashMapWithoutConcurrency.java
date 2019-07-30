// Java program to illustrate
// HashMap drawbacks
import java.util.HashMap;

class HashMapWithoutConcurrency extends Thread
{
    static HashMap<Integer,String> l=new HashMap<Integer,String>();

    public void run()
    {
        // Child thread trying to add
        // new element in the object
        for (int var = 567; var <=  570;var++ ) {
            l.put(var,String.valueOf(var));
            try
        {

            Thread.sleep(1000);
        }
            catch(InterruptedException e)
        {
            System.out.println("Someone interrupted me :(");
        }
        }




    }

    public static void main(String[] args) throws InterruptedException
    {
        HashMapWithoutConcurrency.l.put(107,"Avinash");
        HashMapWithoutConcurrency.l.put(101,"Bhavna");
        HashMapWithoutConcurrency.l.put(102,"Naina");
        HashMapWithoutConcurrency t=new HashMapWithoutConcurrency();
        t.start();

        for (Object o : l.entrySet())
        {
            System.out.println(o);
        Thread.sleep(1000);
        }
        System.out.println(l);
    }
}
