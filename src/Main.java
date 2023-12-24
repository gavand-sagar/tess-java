import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

            System.out.println("Calculated -" + getSquareButSmartly(3));
            System.out.println("Calculated -" + getSquareButSmartly(4));
            System.out.println("Calculated -" + getSquareButSmartly(5));
            System.out.println("Calculated -" + getSquareButSmartly(3));
            System.out.println("Calculated -" + getSquareButSmartly(3));

        }

        public  static Map<Integer,Integer> results = new HashMap<Integer,Integer>();
        public static int getSquareButSmartly(int number){
            if(results.containsKey(number)){
                return results.get(number);
            }else{
                int answer = getSquare(number);
                results.put(number,answer);
                return  answer;
            }
        }


        public static int getSquare(int number){
            System.out.println("Now Calculating for "+ number);
            try{
                Thread.sleep(1500);
            }catch (Exception e){

            }
            return number * number;
        }

}