package m05_string;

public class Comparison
{

    public static void main(String[] args)

    {

        String a = "Hello World";  //string pool
        String a2 = new String("Hello World");  // heap memory

        System.out.println(a == a2); //false, checking if both point to the same memory location

        System.out.println(a.equals(a2)); // true because equals() compares value

        System.out.println(a == "Hello World"); // true because both value are in the pool and are equal
        System.out.println(a2 == "Hello World"); // false

        System.out.println(a.hashCode());
       // System.out.println(a2.hashCode());
        System.out.println("hello world".hashCode());


    }
}
