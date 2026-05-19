import java.util.Scanner;

public class TaskTen{

    public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter first number ");
        int firstNum = inputCollector.nextInt();
        
        System.out.println("Enter second number ");
        int secondNum = inputCollector.nextInt();

        System.out.println("Enter second number ");
        int thirdNum = inputCollector.nextInt();

        int sum = firstNum + secondNum + thirdNum;
    
        System.out.println("Average "+ sum/3);
        }
}
