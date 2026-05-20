public class SimpleParkingLot{

    public static void main(String[]args){
    int [] parkingLot = {1,0,0,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
        System.out.println(checkSlot());
        System.out.println(checkCar());
        System.out.println(carExit());

            }


    

    function  checkSlot(){
        int [] parkingLot = {1,0,0,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
        for(int index = 0; index<parkingLot.length; index++){
            if(parkingLot[index]==0){
                return "Parking slot is empty";
                }
            else if(parkingLot[index]==1){
                String slotOccupied = "Prking slot is available";
                return "Parking slot is empty";
               } 
            }
    
    }

    public static String checkCar(){
    int [] parkingLot = {1,0,0,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
        for(int index = 0; index<parkingLot.length; index++){
            if(parkingLot[index]==0){ 
                return "car can enter";
                }
            else if(parkingLot[index]==1){ 
                return "car cannot enter";
                }
            else{
                return "invalid";
                }
            }    


    }

    public static String carExit(){
    int [] parkingLot = {1,0,0,1,1,0,1,1,1,1,0,0,0,1,0,0,0,0};
        for(int index = 0; index<parkingLot.length; index++){
            if(parkingLot[index]==1){
                return "car can exit";
            }
            else{
                return "car cannot exit";
                }
        }
    }
}
