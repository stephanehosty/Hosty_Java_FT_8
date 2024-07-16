package m01_first_program;

public class EscapeSequences {
    /*
    \" -> "
    \n -> new line
    \t -> tab
    \' -> single quote
    \\ -> prints \
     */

    public static void main(String[] args)
    {
        //add quotation to print statement
        System.out.println("he said \"hello world\"");

        // add two backslash to include one when printing
        System.out.println("he said \\hello world\\ ");

        //new line escape sequence - 17 should be on new line
        System.out.println("java\n17");
    }
}

