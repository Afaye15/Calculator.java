import java.util.Scanner;
public class Main {

    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    System.out.println("How many students in the class?");
    int x = input.nextInt(); 
    input.nextLine();//buffer

    String[] students = new String[x];//should make the in the array num (cant name it class wth)

    for (int i = 0; i < students.length; i++)//iterating through the length
    {
        System.out.println("Enter student name: ");//each time, ask name
        String a = input.nextLine();//save it ig
        students[i] = a;//make that section a
    
    }

    for (String xy : students)
    {
        System.out.println(xy + " ");
    }

    }

}

