public class Calculator {
    private static String LAST_OPERATION;

    // We do not need a constructor.
    public static double add(double num1, double num2){
        double sum;
        sum = num1 + num2;

        LAST_OPERATION = num1 + "+" + num2;
        return sum; 
        /*int x = Calculator.add(num1, num2);
        String lastOp = Calculator.getLastOperation();
        System.out.println(lastOp); */

    }

     public static double subtract(double num1, double num2){
        double sum2;
        sum2 = num1 - num2;

        LAST_OPERATION = num1 + "-" + num2;
        return sum2;
        /*int x = Calculator.subtract(num1, num2);
        String lastOp = Calculator.getLastOperation();
        System.out.println(lastOp);*/
    }

     public static double multiply(double num1, double num2){
        double sum3;
        sum3 = num1 * num2;

        LAST_OPERATION = num1 + "*" + num2;
        return sum3;
    }

     public static double divide(double num1, double num2){
        double sum4;
        sum4 = num1 / num2;

        LAST_OPERATION = num1 + "/" + num2;
        return sum4;
    }

     public static double factorial(double num1){
        double sum5 = 1.0;
       // double sum = 1.0;
         for (double i = 1; i <= num1; i++){ 
        sum5 *= i;
      
         }

        LAST_OPERATION =  "!" + num1;
        return sum5;
     }
  

    
    public static String getLastOperation(){
        return LAST_OPERATION;
    }
}