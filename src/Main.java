public class Main {
        public static void main(String[] args) {


            Point p5 = new Point(56,null);
            Point p4 = new Point(89,p5);
            Point p3 = new Point(45,p4);
            Point p2 = new Point(10,p3);
            Point p1 = new Point(50,p2);

            Display(p1);
    }

    public static void Display(Point p){
        if(p == null){
            return;
        }
        System.out.println(p.value);
        Display(p.next);
    }

    static int fact(int number){
        return number <= 1 ? 1 : number * fact(number-1);
    }

    static int factorial(int number){
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact* i;
        }
        return  fact;
    }

}