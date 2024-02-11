import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                String word1 = "satbcuzeh";
                List<String> output1 =  getSequences(word1);
                System.out.println(output1);
                String word2 = "stuzabc";
                List<String> output2 =  getSequences(word2);
                System.out.println(output2);

                for (String item : output1) {
                        if(output2.contains(item)){
                                System.out.println(item);
                        }
                }



        }
        public static List<String> getSequences(String word){

                List<String> allSequences = new ArrayList<>();

                for (int i = 0  ; i < word.length() ; i++) {
                        char prev = 'z';
                        StringBuilder temp = new StringBuilder();
                        for (int j = i; j < word.length() - 1; j++) {
                                char current = word.charAt(j);
                                if(prev < current || j == i)
                                {
                                        prev = current;
                                        temp.append(current);
                                };
                        }

                        allSequences.add(temp.toString());
                }

                return allSequences;
        }


}