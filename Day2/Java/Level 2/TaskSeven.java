import java.util.Scanner;
public class TaskSeven{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    String validPassword = "admin123";
    
    System.out.println("Enter valid password ");
    String password = inputCollector.nextLine();

        if(password == validPassword){
            System.out.println("valid password");
        }
    
        else{
            System.out.println("invalid");
        }
    }
}
