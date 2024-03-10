public class Point {
    public int value;
    public Point next;

    public Point(int value, Point next) {
        this.value = value;
        this.next = next;
    }

    public  void display(){
        System.out.println(value);
        if(next !=null){
            next.display();
        }
    }

}
