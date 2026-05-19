import java.util.Scanner;

public class TaskFour{

    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter number");
        int number = inputCollector.nextInt();
        int multiply = 1;
            for(int num = 1; num<=12; num++){
            multiply = number * num;
            System.out.println(number+ " X " + num + " = "+ multiply);
            }
      }
}
