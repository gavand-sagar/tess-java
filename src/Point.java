import java.util.ArrayList;
import java.util.List;
public class Point {
    private int value;
    private Point left;
    private Point right;

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = 0;
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
