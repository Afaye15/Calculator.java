import java.util.Scanner;

public class method {

    //I declared all of the vairables here so that I can manipulate them with the new method later
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int n1 = input.nextInt();

        System.out.println("Enter your second number:");
        int n2 = input.nextInt();

        System.out.println("Enter your third number:");
        int n3 = input.nextInt();

        // Call the numInformation method, passing the input variables as arguments
        numInformation(n1, n2, n3);

        input.close();
    }

    public static void numInformation(int num1, int num2, int num3) {
        // The parameters num1, num2, and num3 already hold the values passed from main().
    
        // System.out.println(num1 + " " + num2 + " " + num3);
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("Largest number: " + largest);

        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        System.out.println("Smallest number: " + smallest);
        
        if (num1 == num2 && num2 == num3){
            System.out.println("They are all the same");
        }
        else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Exactly two numbers are the same.");
        } else {
            System.out.println("All three numbers are different.");
        }

    
    }
}
