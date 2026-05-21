public class Array{

    public static void getArray(int [] countArray, int number){


    for(int count1= 0; count1< countArray.length; count1++){
        for(int count2=0; count2<countArray.length; count2++){
            if( countArray[count1] + countArray[count2]== number ) {
            System.out.println(countArray[count1] + " "+ countArray[count2]);
             
               }
           
            }
            
        }

    }
    public static void main(String[]args){
    int [] countArray = {8,6,12,4,-2};
    int number = 6;
    getArray(countArray, number);
    

    }
}
