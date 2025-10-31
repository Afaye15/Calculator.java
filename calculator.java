import java.util.Scanner;
public class Calculator 
{
   public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter an operator (+, -, *, /, %): ");
   //operator = scan.nextchar();
   char operator = scan.next().charAt(0);
   if (operator == '+') {
    System.out.println("What is the first number you want to add? ");
    int num1 = scan.nextInt();
    System.out.println("What is the second number you want to add? ");
    int num2 = scan.nextInt();
    System.out.println("Here is the sum: "+ (num1 + num2)); 
} else if (operator == '-') {
    System.out.println("What is the first number you want? ");
    int num1 = scan.nextInt();
    System.out.println("What is the second number you want? ");
    int num2 = scan.nextInt();
    System.out.println("Here is the difference: "+ (num1 - num2));
} else if (operator == '*') {
    System.out.println("What is the first number you want? ");
    int num1 = scan.nextInt();
    System.out.println("What is the second number you want? ");
    int num2 = scan.nextInt();
    System.out.println("Here is the product: "+ (num1 * num2));
} else if (operator == '/') {
    System.out.println("What is the first number you want? ");
    int num1 = scan.nextInt();
    System.out.println("What is the second number you want? ");
    int num2 = scan.nextInt();
    System.out.println("Here is the dividend: "+ ((double) num1 / num2));
} else if (operator == '%') {
    System.out.println("What is the first number you want? ");
    int num1 = scan.nextInt();
    System.out.println("What is the second number you want? ");
    int num2 = scan.nextInt();
    System.out.println("Here is the modulo: "+ (num1 % num2));
} else {
   System.out.println("Invalid/ error. Dont divide by 0 silly.");
}
 scan.close();
   }
}