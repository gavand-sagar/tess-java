import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
        public static void main(String[] args) {

                String word = "ball";
                String input = "bbbaaall";

                Map<Character,Integer> letterCount = new HashMap<>();
                var letters = input.toCharArray();
                for (Character letter: letters) {
                        if(word.contains(letter.toString())){
                                if(letterCount.containsKey(letter)){
                                        var oldCount = letterCount.get((letter));
                                        letterCount.put(letter,oldCount+1);
                                }else{
                                        letterCount.put(letter,1);
                                }
                        }
                }
                Map<Character,Integer> requirement = new HashMap<>();
                for (Character letter: word.toCharArray()) {
                        if(requirement.containsKey(letter)){
                                var oldCount = requirement.get((letter));
                                requirement.put(letter,oldCount+1);
                        }else{
                                requirement.put(letter,1);
                        }
                }

                int min = -1;
                for (var item : letterCount.entrySet()) {
                        int minAmount = (item.getValue() / requirement.get(item.getKey()));
                        if(min == -1){
                                min = minAmount;
                        }else if(minAmount< min){
                                min = minAmount;
                        }
                }
                // print the least available letter
                System.out.println("The maximum number of time '" + word + "' can be created : " + min);
        }


}