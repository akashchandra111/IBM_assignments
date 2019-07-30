// Demonstrating the drawbacks of
// HashMap
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class HashMapWithConcurrency extends Thread
{
    static ConcurrentHashMap<Integer,String> l =
                    new ConcurrentHashMap<Integer,String>();

    public void run()
    {
    for (int v = 1; v < 10; v++) {


        // Child add new element in the object
        l.put(v,"Bhavana");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread going to add element");
        }
    }


    }

    public static void main(String[] args) throws InterruptedException
    {
        l.put(56,"Poorna");
        l.put(590,"Shubham");
        l.put(593,"Henna");
        HashMapWithConcurrency t=new HashMapWithConcurrency();
        t.start();

        for (Object ref : l.entrySet())
        {
            System.out.println(ref);
            Thread.sleep(1000);
        }
        //System.out.println("Before Join : " + l);

        // t.join();

        //System.out.println("After Join : " + l);
    }
}
