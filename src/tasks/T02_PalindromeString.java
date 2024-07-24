package tasks;

public class T02_PalindromeString
{
    public static void main(String[] args)
    {
        String str = "Kenscoff";

        //1 StringBuilder
        String reversedStr = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reversedStr))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }


        //2 reverse other string and compare.
        String reverse ="";
        for (int i =  str.length()-1; i>=0; i--)
        {
         reverse += str.charAt(i);
        }

        if (str.equals(reverse))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }




        //3 Using two pointers technique "Kenscoff"
        boolean isPalindrome = true;
        for (int i = 0, j = str.length()-1; i < j ;  i++, j--)
        {
          if(str.charAt(i) != str.charAt(j))
          {
              isPalindrome = false;
              break;
          }

            System.out.println(isPalindrome);
        }






    }


    public static boolean isPalidrome(String str)
    {

        for (int i = 0, j = str.length()-1 ; i< j;  i++, j--)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}
