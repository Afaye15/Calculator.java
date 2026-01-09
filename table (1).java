public class table 
{
 public static void main (String[] args)
 {
   for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {// I need a 12 x 12 table
                // I had to search this up because before printf it was just numbers
                System.out.printf("%4d", i * j);// what is %4d?
            }
            // Move to the next line after each row is complete
            System.out.println();
        }
 }

}
