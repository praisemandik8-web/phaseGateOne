import java.util.Scanner;
public class TaskSix{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter valid year ");
    int year = inputCollector.nextInt();

        if(year%4 == 0){
            System.out.println(year + "is a leap year");
        }

        else if(year%100 == 0 && year%400 == 0){
            System.out.println(year + "is a leap year");
        }

        else{
            System.out.println(year + "is not a leap year");
        }
    }
}

