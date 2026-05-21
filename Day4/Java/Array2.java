public class Array2{

    public static void getArray(int [] countArray, int number){


    for(int count1= 0; count1< countArray.length; count1++){
        for(int count2=0; count2<countArray.length; count2++){
            if( countArray[count1] + countArray[count2]== number ) {
            System.out.println(countArray[count1] + " , "+ countArray[count2]);
             
               }
            
            }
            
        }

    }
    public static void main(String[]args){
    int [] countArray = {1,2,5,7,6,8,9};
    int number = 12;
    getArray(countArray, number);
    

    }
}
