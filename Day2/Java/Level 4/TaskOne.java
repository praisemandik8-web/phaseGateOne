public class TaskOne{

    public static int add(int a, int b){
    return a+b;
    
    }

    public static int square(int a){
    return a*a;
    
    }

    public static void even(int number){
        if(number%2 == 0){
        System.out.println("is an even number");
        }
        else{System.out.println("not even");}
       } 

    public static double convertTemp(int c){
        return(c*1.8)+32;
    }

    public static int largestofThree(int a, int b, int c){
        int largest = a;
        if(b>a && b> c){
        return b;
        }
        if(c>a && c> b){
        return c;
        }
        else{
        return 0;
        }
        
    }
    
    public static double simpleInterest(int principal, int rate, int time){
    return principal*rate*time;
    }

    public static double areaRectangle(int length, int width){
    return length*width;
    }

    public static void primeChecker(int a){
         boolean isPrime = true;
            if(a <=1){
            isPrime= false;
                for(int count = 2; count>=0; count++){
                    if(a%2==0){
                        isPrime= false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(a + " is even ");
                }
            }
        System.out.println(a + " is even ");
    }

    
    public static void main(String[]args){

    System.out.println(add(2,2));
    System.out.println(square(5));
    even(5);
    System.out.println(convertTemp(100)+ " degrees Fahrenheit");
    System.out.println(largestofThree(4,6,1));
    System.out.println(simpleInterest(100, 5, 4));
    System.out.println(areaRectangle(2, 6)+ " is the area of rectangle");
    primeChecker(3);
    

    }



}
