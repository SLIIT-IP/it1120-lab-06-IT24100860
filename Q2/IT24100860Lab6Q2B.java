import java.util.Scanner;

public class IT24100860Lab6Q2B
{

    public static void main(String[] args)
    {

       Scanner scanner = new Scanner(System.in);
       int[] numbers = new int[10];

       System.out.println("Please enter 10 numbers:");
       for(int i=0;i<10;i++){
          numbers[i] = scanner.nextInt();
       }

       System.out.println("The numbers you entered:");
       for(int i =0;i<10;i++){
          System.out.print(numbers[i] + " ");
   
       }
     }
}

