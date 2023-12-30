public interface ITree {
    void display();
    void insertValue(int value);

    boolean find(int value);

    int size();
    boolean isEmpty();
}
