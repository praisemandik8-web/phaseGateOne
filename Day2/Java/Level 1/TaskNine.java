import java.util.Scanner;

public class TaskNine{

    public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter price ");
        int price = inputCollector.nextInt();
        
        double tax = 0.1*price;
        double taxPrice = price - tax;        

        System.out.println("Tax amount is "+ tax);
         System.out.println("Price after tax deductions is  "+ taxPrice);
        }
}
