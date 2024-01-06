public class Point {
    private String value;
    private Point left;
    private Point right;

    public Point(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public Point(String value, Point left, Point right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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
