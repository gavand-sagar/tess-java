public class Main {
        public static void main(String[] args) {

                Object[] items = new Object[5];
                items[0] = "A";
                items[1] = "B";
                items[2] = "C";
                items[3] = "D";
                items[4] = "E";




                MyIterator iterator = new EverySecondItemCollection(items);
                while (iterator.hasNext()){
                        Object o = iterator.next();
                        System.out.println(o);
                }





    }
}