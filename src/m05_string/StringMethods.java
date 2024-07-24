package m05_string;

public class StringMethods {

    public static void main(String[] args)
    {
        String s1 = "";
        String st2 = "       ";
        System.out.println(s1.isEmpty());  //true
        System.out.println(st2.isEmpty()); //false because it contains empty space
        System.out.println(st2.isBlank()); // true because all white spaces
        System.out.println(s1.isBlank());


        System.out.println(s1.length());
        System.out.println(st2.length());

        String s3 = "hello cydeo";
        System.out.println(s3.charAt(0)); //first character which is H
        System.out.println(s3.charAt(6)); // 6th character which is C

        System.out.println(s3.charAt(s3.length()-1)); // get last character
        System.out.println(s3.substring(0, 5));// get character from index 0 to 5
        System.out.println(s3.substring(6)); // get character from index 6 until the length (end)

        System.out.println(s3.indexOf('y')); // 7 is index of y character
        System.out.println(s3.indexOf("cyd")); // 7 is the starting point of cyd
        System.out.println(s3.indexOf("java"));// -1 if not found
        System.out.println(s3.lastIndexOf('e'));


        System.out.println(s3.toLowerCase() + " - " + s3.toUpperCase());
        System.out.println(s3.replace("cydeo", "world")); // replaces cydeo with world

        System.out.println(s3.replace('e', 'E'));

        System.out.println(s3.replaceAll("cydeo", "Stephane"));


        String s4 = "ABC12345";
        System.out.println(s4.replaceAll("\\d+", "")); // remove all number from string
        System.out.println(s4.replaceAll("[A-Z]+" , "" )); // remove all upper case characters




    }
}
