import java.util.Scanner;

public class TaskFive{

    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter number");
        int number = inputCollector.nextInt();
        int result = 1;
            for(int num = 1; num<=number; num++){
                result *= num;
            
            }
        System.out.println(result);
     }
}
