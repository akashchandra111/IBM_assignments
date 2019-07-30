import java.lang.Thread;
import java.lang.Runnable;
import java.lang.Math;

public class SynchronizedThread	{
  public static void main(String... args)	{
    T1 t1 = new T1();
    T1 t2 = new T1();

    Runnable runner = ()->	{
	  int x= (int)(Math.random()*4);
      switch(x)	{
          	case 1:
            	t1.func("t1");
            	break;
            case 2:
            	t1.method("t1");
            	break;
            case 3:
        	    t2.func("t2");
            	break;
            case 4:
            	t2.method("t2");
        	    break;
            default:
				System.out.println(x);
        }
    };

    Thread thread1 = new Thread(runner);
    Thread thread2 = new Thread(runner);

    thread1.start();
    thread2.start();
  }
}

class T1	{
  public static synchronized void func(String thread)	{
  	System.out.println(thread + " func(): called!");
  }

  public synchronized void method(String thread)	{
  	System.out.println(thread + " method(): called!");
  }
}
