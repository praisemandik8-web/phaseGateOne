import java.util.Scanner;
public class TaskFive{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter first number ");
    int numOne = inputCollector.nextInt();

    System.out.println("Enter second number ");
    int numTwo = inputCollector.nextInt();

    System.out.println("Enter third number ");
    int numThree = inputCollector.nextInt();

    int largest = numOne;
        if(numTwo > numOne && numOne > numThree){
            largest = numTwo;
        }  
        if(numThree > numOne && numOne > numTwo){
            largest = numThree;
        } 
        else{
            System.out.println("Invalid");
        }  

    System.out.println("largest is "+ largest);
    
    }


}
