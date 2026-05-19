import java.util.Scanner;

public class TaskSeven{

    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter first number");
        int numberOne = inputCollector.nextInt();

        System.out.println("Enter second number");
        int numberTwo = inputCollector.nextInt();

        System.out.println("Enter third number");
        int numberThree = inputCollector.nextInt();
    
        System.out.println("Enter fouth number");
        int numberFour = inputCollector.nextInt();

        System.out.println("Enter fifth number");
        int numberFive = inputCollector.nextInt();
        
        int sum = numberOne + numberTwo + numberThree + numberFour + numberFive;
        System.out.println("sum is "+ sum);
     }
}
