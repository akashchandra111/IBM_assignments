import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] a) {
        //GenericClassTest gC[] = new GenericClassTest[5];

		//GenericClassTest<String> ref = new GenericClassTest<>(12);

        //gC[0] = new GenericClassTest("Hi");
        //gC[1] = new GenericClassTest(new GenericClassTest(56));
        //gC[2] = (GenericClassTest <String>)new GenericClassTest(12);
        //gC[3] = (GenericClassTest <Integer>)new GenericClassTest(12);
    }

}

//void func(List<? extends Object> l)

public class GenericClassTest<Integer>   {
    private Integer e;
    public GenericClassTest(Integer e)    {
        this.e = e;
    }
}
