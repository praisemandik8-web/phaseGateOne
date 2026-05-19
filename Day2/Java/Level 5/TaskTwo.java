import java.util.Arrays;
public class TaskTwo{

    public static void main(String[]args){

    int [] numbers = {5,-9,3,-6,2,-11};
        for(int i = 0; i<=numbers.length; i++){
            if(numbers[i])< 0){
                System.out.println("The negative numbers are " + Arrays.toString(numbers));
            }

        }
    }
}
