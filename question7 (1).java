//import java.util.Scanner;
// Aicha faye, and I did have some help from google. Loops will be the death of me
public class question7
{
    public static void main (String[] args)
    {
        int x = 0;
        int y = 1;

        /*while(x <= 1000)
        {  
            System.out.println(x);
            x+= 4;
        }
        
        for(int i = 0; i <= 1000; i+=3){
        System.out.println(i);
        }
        */
          for (int i = 2; i < 20; i++) {
            int w = x + y;
            System.out.print(", " + w);
            
            x = y;
            y = w;
        }
        
        System.out.println(); 

    }
}