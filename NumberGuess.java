import java.util.Random;
import java.util.Scanner;

public class NumberGuess{

    public static void main(String[]args){
    
    Scanner inputCollector= new Scanner(System.in);
    Random rand = new Random();
    


    int randomNumber = rand.nextInt(100);
    int userNumber = 0;
        
        for(int i =1; i<=5; i++){
        System.out.println("Enter Number");
        userNumber = inputCollector.nextInt();
            

            if(userNumber == randomNumber){
                System.out.println("Congrats chief ");

            }
            else if(userNumber < 0 || userNumber> 100 ){
                System.out.println("Warning! Enter number between 1-100");

            }
            else if(userNumber > randomNumber){
                System.out.println("The answer is lower than "+ userNumber);

            }
            else if(userNumber < randomNumber){
                System.out.println("The answer is higher than "+ userNumber);

            }



        }
        System.out.println("Coreect answer is " + randomNumber);

    }




}
