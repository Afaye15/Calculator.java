public class Main {
    public static void main(String[] args) {
        // 1. Test the Constructor
        System.out.println("--- Testing Constructor ---");
        phone myPhone = new phone("iPhone", 15, "Pro Max", 17.2);
        
        // 2. Test Getters
        System.out.println("Make: " + myPhone.getMake());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Fit: " + myPhone.getFit());
        System.out.println("Version: " + myPhone.getVersionNumber());

        // 3. Test Setters
        System.out.println("\n--- Testing Setters (Updating Data) ---");
        myPhone.setMake("Android");
        myPhone.setModel(24);
        myPhone.setFit("Ultra");
        myPhone.setVersionNumber(1.0);

        // 4. Verify updates using Getters again
        System.out.println("Updated Make: " + myPhone.getMake());
        System.out.println("Updated Model: " + myPhone.getModel());
        System.out.println("Updated Fit: " + myPhone.getFit());
        System.out.println("Updated Version: " + myPhone.getVersionNumber());
        
        System.out.println("\nTest Complete: If the data above matches, your class is correct!");
    }
}
