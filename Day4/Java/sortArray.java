public class SortArray{

    public static void sortArray(int [] countArray){


    for(int count1= 0; count1< countArray.length; count1++){
        for(int count2=0; count2<countArray.length; count2++){
            if( countArray[count1] > countArray[count2] ) {
                int temp = countArray[count1];
                countArray[count1] = countArray[count2];
                countArray[count2]= temp;
                System.out.println(countArray());

                
             
               }
           
            }
            
        }

    }
    public static void main(String[]args){
    int [] countArray = {14,9,6,5,8,10};
    
    sortArray(countArray);
    

    }
}
