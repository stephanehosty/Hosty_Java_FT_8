package m05_string;

public class StringAndStringBuilder
{
    public static void main(String[] args) {
        String str = "Water";
        str += " Fountain"; // creates a new String with the new String concatenated at the end.
                            // That new String is then reassigned back to the original reference

        System.out.println(str);

        StringBuilder strB = new StringBuilder("Lemon"); // There is only one object
        System.out.println(strB);
        strB.append(" Juice");
        System.out.println(strB);
        strB.append(" is good");
        System.out.println(strB);
        strB.toString(); // Converts the StringBuilder object to a String type

        StringBuffer buff = new StringBuffer("Keyboard");
        buff.append(" & mouse");
        buff.append(". New computer");
        System.out.println(buff); // looks the same as StringBuilder, but is thread safe



        //reverse string
        String s = "java";
        StringBuilder st = new StringBuilder(s);
        s= st.reverse().toString();
        System.out.println("s = " + s);


    }

}
