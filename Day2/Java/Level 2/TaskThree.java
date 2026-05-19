import java.util.Scanner;
public class TaskThree{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter student score ");
    int score = inputCollector.nextInt();

        if(score >= 50){
            System.out.println(" pass ");
        }
        else if(score < 50){
            System.out.println(" fail");
        }
        else{
            System.out.println("invalid");
        }

    }


}
