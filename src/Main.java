import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] fuelStations = new int[]{50,200,250,300,350,400,500,550,600,750};
                int capacity = 100;
                int destination = 400;


                int distance = 0;
                int totalStops = 0;


               while (true){
                       if(distance + capacity >= destination){
                               System.out.println(totalStops);
                               break;
                       }else{
                               int nextStopIndex = getNextStop(fuelStations,capacity,distance);
                               if(nextStopIndex == -1 || distance == fuelStations[nextStopIndex]){
                                       System.out.println("Unreachable");
                                       break;
                               }
                               distance = fuelStations[nextStopIndex];
                               totalStops++;
                       }
               }



        }

        private static int getNextStop(int[] fuelStations, int capacity, int distance) {
                for (int i = fuelStations.length - 1; i >= 0 ; i--) {
                        if(fuelStations[i] <= (distance + capacity) ){
                                return i;
                        }
                }
                return -1;
        }


}