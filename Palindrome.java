/*
 Aicha Faye
 Palindrome Project
 Identifies palindromes in user inputs
 break; means stop/skip out of the nearest loop
*/
/*
//Imports
import java.util.Scanner;

public class Palindrome
{
   public static void main(String[] args)
   {
     String og;
     String new = "";
     Scanner input = new Scanner(System.in);// i set word as var
    
// first ask for word, then reverse it and see if it matches the original, then check if it is or isnt pal

     //start of code:
     System.out.println("Enter your word: ");// ask for word
     og = input.nextLine();

     
      for (int i =  0; i <= og.length()-1; i++) // writes out the word vertically
      {
         System.out.println(og.charAt(i));
      }
      //String s = "Hello"; // Example string
      //t = input.nextLine(); this would cause it to ask you again

      for (int i = og.length() - 1; i >= 0; i--) { // reverse
         new = new + og.charAt(i);// I needed this
         System.out.println(s.charAt(i));
      }

      if (og.equals(new))
      {
        System.out.println("It is a palindrome");
      }
      else
      {
        System.out.println("It isn't a palindrome... or you spelled it wrong");
      }
    
    //s.equals(“Some Other String.”)  i'll need this

     input.close();
   }
}
*/
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
 
        String originalWord;
        String cleanedPhrase;

        Scanner input = new Scanner(System.in);
  
        System.out.println("Enter your word:");
        originalWord = input.nextLine();
        cleanedPhrase = originalWord.replaceAll("[^a-zA-Z]", "").toLowerCase();// Im ngl, i used google for that
        String reversedWord = new StringBuilder(cleanedPhrase).reverse().toString();

        if (cleanedPhrase.equals(reversedWord)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It isn't a palindrome.");
        }

        /*
        for (int i = 0; i <= originalWord.length() - 1; i++) { 
            System.out.println(originalWord.charAt(i));
        }
        */

        /* Reverse the original string and store it in the reversedWord variable.
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + originalWord.charAt(i);
        }

        // Compare the original and reversed words using .equals()
        if (originalWord.equals(reversedWord)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It isn't a palindrome... or you spelled it wrong");
        }
        */

        input.close();
    }
}
