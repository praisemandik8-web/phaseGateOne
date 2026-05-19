import java.util.Scanner;
public class TaskEight{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    System.out.println("1. Sunday");
    System.out.println("2. Monday");
    System.out.println("3. Tuesday");
    System.out.println("4. Wednesday");
    System.out.println("5. Thursday");
    System.out.println("6. Friday");
    System.out.println("7. Saturday");

    int weekday = inputCollector.nextInt();
    
    switch(weekday){
    
        case 1:
            System.out.println("Sunday");
        break;
         case 2:
            System.out.println("Monday");
        break;
         case 3:
            System.out.println("Tuesday");
        break;
         case 4:
            System.out.println("Monday");
        break;
         case 6:
            System.out.println("Monday");
        break;
         case 7:
            System.out.println("Monday");
        break;
      }      
        
    }
}
