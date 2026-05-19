import java.util.Scanner;

public class TaskFive{

    public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter Temperature in degree celcius ");
        int c = inputCollector.nextInt();

        double f = (c * 1.8) + 32;
    
        System.out.println("When converted, temperature in Farenheits is "+ f);
        }
}
