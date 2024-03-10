import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int [] a1 = new int[]{ 1,7,9,20};

                int[] a2 = new int[] { 3,4,5,10,60,80};

                int[] a3 = new int[a2.length + a1.length];

                int t1 =0, t2 = 0;
                for (int i = 0; i < a3.length; i++) {
                        if(t1 < a1.length && t2 < a2.length){
                                if(a1[t1] < a2[t2]){
                                        a3[i] = a1[t1++];
                                }else{
                                        a3[i] = (a2[t2++]);
                                }

                        }else if(t1 < a1.length){
                                a3[i] = (a1[t1++]);
                        }else if(t2 < a2.length){
                                a3[i] = (a2[t2++]);
                        }
                }

                for (int n: a3
                     ) {
                        System.out.println(n);
                }



        }


}