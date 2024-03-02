import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] a = new int[]{900,915,930,945,1200};
                int[] d = new int[]{930,930,1000,1030,1230};

                int count = 0;
                int ans = 0;

                int i = 0, j = 0;

                while (i< a.length){
                       if(a[i] <= d[j]){
                               count++;
                               ans = Math.max(ans,count);
                               i++;
                       }else{
                               count--;
                               j++;
                       }

                }

                System.out.println(ans);




        }


}