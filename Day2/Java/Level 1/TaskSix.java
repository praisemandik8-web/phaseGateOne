import java.util.Scanner;

public class TaskSix{

    public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter length ");
        int length = inputCollector.nextInt();

        System.out.println("Enter width ");
        int width = inputCollector.nextInt();

        double area = length * width;
    
        System.out.println("Area of rectangle "+ area);
        }
}
