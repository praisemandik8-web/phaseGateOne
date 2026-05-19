import java.util.Arrays;
public class TaskOne{

    public static void main(String[]args){

    int [] numbers = {5,9,3,6,2};
        for(int i = 0; i<=numbers.length; i++){
            boolean isPrime = true;
            if(numbers[i] <=1){
            isPrime= false;
                for(int count = 2; count>=0; count++){
                    if(numbers[i]%2==0){
                        isPrime= false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println("The numbers are " + Arrays.toString(numbers));
                }
            }
        System.out.println("The scores are " + Arrays.toString(numbers));
    }
         System.out.println("The scores are " + Arrays.toString(numbers));
    }

}
