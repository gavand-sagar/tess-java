import java.util.*;

public class Main {
        public static void main(String[] args) {


                Queue<Integer> a1 = new LinkedList<>();
                a1.add(10);
                a1.add(20);
                a1.add(30);


                Queue<Integer> a2 = new LinkedList<>();
                a2.add(4);
                a2.add(15);
                a2.add(30);

                Queue<Integer> a3 =  new LinkedList<>();

                while (a1.size() > 0 || a2.size() > 0){
                        if(a1.size() > 0 && a2.size() > 0){
                                if(a1.peek() < a2.peek()){
                                        a3.add(a1.poll());
                                }else{
                                        a3.add(a2.poll());
                                }
                        }else if(a1.size() > 0){
                                a3.addAll(a1);
                                a1.clear();
                        }
                        else if(a2.size() > 0){
                                a3.addAll((a2));
                                a2.clear();
                        }
                }



//                for (int i = 0; i < a3.length; i++) {
//                        if(t1 < a1.length && t2 < a2.length){
//                                if(a1[t1] < a2[t2]){
//                                        a3[i] = a1[t1++];
//                                }else{
//                                        a3[i] = (a2[t2++]);
//                                }
//
//                        }else if(t1 < a1.length){
//                                a3[i] = (a1[t1++]);
//                        }else if(t2 < a2.length){
//                                a3[i] = (a2[t2++]);
//                        }
//                }

                for (int n: a3
                     ) {
                        System.out.println(n);
                }



        }


}