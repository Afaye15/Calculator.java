/*
 public class bankAccount
{
    String firstName; // Changed to match capitalization in constructor
    String lastName;  // Changed to match capitalization in constructor
    double balance;   // Changed to double to allow decimals
    int pin;          // Changed name from pin1 to pin for simplicity

    public bankAccount(String a, String bankAccount, double bal, int pinNum) 
    {
      this.firstName = a; 
      this.lastName = bankAccount;
      this.balance = bal;
      this.pin = pinNum;
    }

   
    public static void main(String[] args)
    {
     
       bankAccount brianBank = new bankAccount("Brian", "Tejada", 578955455, 6767);
       bankAccount aichaBank = new bankAccount("Aicha", "Faye", 1000.1, 545784); // 1000.1 works now with double

    
       String briansFirstname = brianBank.firstName;
       double briansBalance = brianBank.balance;
       String briansLastName = brianBank.lastName;
       int briansPin = brianBank.pin;

       String aichasFirstname = aichaBank.firstName;
       double aichasBalance = aichaBank.balance;
       String aichasLastName = aichaBank.lastName;
       int aichasPin = aichaBank.pin;

       
       System.out.println("Name? " + brianBank.firstName + " " + brianBank.lastName + " Pin?: " + brianBank.pin + " Your balance is: " + brianBank.balance);
       System.out.println("Name? " + aichaBank.firstName + " " + aichaBank.lastName + " Pin?: " + aichaBank.pin + " Your balance is: " + aichaBank.balance);
    }
}
*/
public class bankAccount { // File name must match this
    public String firstName; // 
    public String lastName;
    public double balance;
    public int pin;

    // Constructor
    public bankAccount(String firstName, String lastName, double balance, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.pin = pin;
    }

    public static void main(String[] args) {
        // 
        bankAccount brianBank = new bankAccount("Brian", "Tejada", 578955455.0, 6767);
        bankAccount aichaBank = new bankAccount("Aicha", "Faye", 1000.1, 545784);

        // Printing directly from the object
        System.out.println("Name: " + brianBank.firstName + " " + brianBank.lastName +" | Pin: " + brianBank.pin +  " | Balance: $" + brianBank.balance);

        System.out.println("Name: " + aichaBank.firstName + " " + aichaBank.lastName + " | Pin: " + aichaBank.pin +  " | Balance: $" + aichaBank.balance);
    }
}

