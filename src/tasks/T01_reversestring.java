package tasks;

public class T01_reversestring
{

    public static void main(String[] args) {


        String str = "Stephane";

        //1. Use StringBuilder
        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println(reverseStr);

        //2. Use for Loops

        //2.1 Reverse forward
        String rev = "";
        for (int i = 0; i < str.length(); i++)
        {
           rev = str.charAt(i) + rev;
        }
        System.out.println(rev);

        //2.2
        String reversedStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("reversedStr = " + reversedStr);

    }
}
