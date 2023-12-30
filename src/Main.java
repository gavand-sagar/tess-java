
public class Main {
        public static void main(String[] args) {


                Point Level3_1 = new Point(60);
                Point Level3_2 = new Point(45);

                Point Level2_1 = new Point(70);
                Level2_1.setLeft(Level3_1);
                Level2_1.setRight(Level3_2);


                Point Level3_3 = new Point(67);
                Point Level2_2 = new Point(80);
                Level2_2.setLeft(Level3_3);


                Point Level3_4 = new Point(56);
                Point Level3_5 = new Point(78);
                Point Level2_3 = new Point(90);
                Level2_3.setLeft(Level3_5);
                Level2_3.setRight(Level3_4);

                Level3_3.setRight(Level2_3);


                Point Level1 = new Point(50);
                Level1.setLeft(Level2_1);
                Level1.setRight(Level2_2);

                display(Level1,"");



        }


        public  static  void display(Point p,String indentetion){
                if(p != null){
                        System.out.println(indentetion + "-" + p.getValue());
                        display(p.getLeft(),indentetion + "  ");
                        display(p.getRight(),indentetion + "  ");
                }
        }


}