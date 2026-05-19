import java.util.Scanner;

public class TaskThree{

    public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Enter second number");
        int secondNumber = inputCollector.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum is: " + sum);    
    
    }

}
