import java.util.Scanner;

public class TaskTwo{

    public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter ya age, chairman!");
        int age = inputCollector.nextInt();
        int newAge = age + 5;

        System.out.println("Your age in 5 years is " + newAge);    
    
    }

}
