package m05_string;

public class reverseString
{

    public static void main(String[] args)
    {
        //easiest way to do it
        //reverse string
        String s = "java";
        StringBuilder st = new StringBuilder(s);
        s= st.reverse().toString();
        System.out.println("s = " + s);
    }
}
