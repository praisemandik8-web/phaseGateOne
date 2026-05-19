import java.util.Scanner;

public class TaskEight{

    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
            
            int number = inputCollector.nextInt();
            int total = 0;
            while(number != 0){
                System.out.println("Enter number");
                number = inputCollector.nextInt();
                    if(number == 0){
                        break;
                     }
                total+=number;
                number++;
                
            }
         System.out.println(total );
      }
}
