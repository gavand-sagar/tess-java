import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
        public static void main(String[] args) {


                List<Item> items = new ArrayList<>();
                items.add(new Item("Mobile",1,50));
                items.add(new Item("Laptop",5,100));
                items.add(new Item("Vase",10,200));
                items.add(new Item("Wallet",1,100));
                items.add(new Item("Lamp",1,150));
                items.add(new Item("Chair",6,300));
                int maxWeight = 10;


                double MaxCost = 0;
                String Combination = "";
                for (int i = 0; i <= getLimitNumber(items.size()); i++) {
                        String input = getAdjustedBinaryString(Integer.toBinaryString(i),items.size());
                        double weight = 0;
                        double cost = 0;
                        StringBuilder row = new StringBuilder();
                        row.append("[ ");
                        for (int j = 0; j < input.length(); j++) {
                                if(input.charAt(j) == '1'){
                                        row.append(items.get(j).name).append("(").append(items.get(j).weight).append(")").append("\t");
                                        weight += items.get(j).weight;
                                        cost += items.get(j).cost;
                                }
                        }
                        row.append("]     ");
                        row.append("weight: ").append(weight).append("\tcost: ").append(cost);

                        if( weight <= maxWeight && MaxCost < cost){
                                MaxCost = cost;
                                Combination = row.toString();
                        }
                }

                System.out.println(Combination);


        }

        private static int getLimitNumber(int length) {
                return (int)(Math.pow(2,length) - 1);
        }

        private static String getAdjustedBinaryString(String binaryString,int length) {
               int missingNumbers = length - binaryString.length();
               return "0".repeat(missingNumbers) + binaryString;
        }


}