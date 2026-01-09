import java.util.Scanner;
public class question6
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int passWord; 


       while (true) {
        System.out.println("Whats the password??? Numbers only");
        passWord = input.nextInt();
        
        if (passWord != 334092){
            System.out.println("Access denied! You intruder. You bum. Hint: 6 numbers");
        } 

        else {
           System.out.println("You got it!");
            break;
        } 
        input.close();
        }
   /*else {
        System.out.println("Invalid input. Please enter numbers only.");
        input.nextLine(); // Consume the invalid line of input */
       }

}