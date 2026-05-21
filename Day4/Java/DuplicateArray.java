public class DuplicateArray{

    public static void dupliArray(int [] numbers){


    for(int count1= 0; count1< numbers.length; count1++){
        for(int count2=0; count2<numbers.length; count2++){
            if( numbers[count1] == numbers[count2] ) {
                
                 System.out.print(numbers[count1] + " ");
               }
                
            }
           
        }

    }

    public static void main(String[]args){
    int [] numbers = {9,5,1,9,4,5,1,7};
    dupliArray(numbers);

     
    
    
    

    }
}
