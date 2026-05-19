import java.util.Scanner;

public class TaskSeven{

    public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter radius ");
        int radius = inputCollector.nextInt();
        double pi = 3.142;

        double circumference = (2*pi)*radius;
    
        System.out.println("circumference "+ circumference);
        }
}
