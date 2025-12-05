import java.util.Scanner;
public class vowels
{
     public static int numVowels(String wordOrPhrase) //output numVowels, input word
    {
        int vowelCount = 0;
        for (int i = 0; i < wordOrPhrase.length(); i++) {
            char currentChar = wordOrPhrase.charAt(i);

            // makes sure its one of the vowels and then increments
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
                vowelCount++; 
            }
        }
        return(vowelCount);
    }
   
    public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your word: ");
      String word = input.nextLine();
       int count = numVowels(word); //calling the method with word input
      //asks for word 
      System.out.println("The number of lowercase vowels " + count);

      numVowels(word);
      input.close();

   
}

}