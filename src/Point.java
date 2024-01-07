import java.util.ArrayList;
import java.util.List;
public class Point {
    private int value;
    private Point left;
    private Point right;

    public boolean isLeaf(){
        return this.getLeft() == null && this.getRight() == null;
    }
    public boolean hasOnlyRightChild(){
        return this.getLeft() == null && this.getRight() !=null;
    }
    public boolean hasOnlyLeftChild(){
        return this.getLeft() != null && this.getRight() == null;
    }

    public  boolean hasSingleChild(){
        return hasOnlyRightChild() || hasOnlyLeftChild();
    }

    public Point getSingleChild(){
        return hasOnlyRightChild()? this.getRight() : this.getLeft();
    }


    public boolean hasBothChild(){
        return this.getLeft() != null && this.getRight() != null;
    }





    public Point(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public Point(int value, Point left, Point right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Point getLeft() {
        return left;
    }

    public void setLeft(Point left) {
        this.left = left;
    }

    public Point getRight() {
        return right;
    }

    public void setRight(Point right) {
        this.right = right;
    }
}
