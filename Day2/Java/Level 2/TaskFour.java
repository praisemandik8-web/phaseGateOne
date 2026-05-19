import java.util.Scanner;
public class TaskFour{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter first number ");
    int numOne = inputCollector.nextInt();

    System.out.println("Enter second number ");
    int numTwo = inputCollector.nextInt();

    int largest = numOne;
        if(numTwo > largest){
            largest = numTwo;
        }  
        else{
            System.out.println("Invalid");
        }  

    System.out.println("largest is "+ largest);
    
    }


}
