public interface ITree {
    void display();
    void insertValue(int value);

    boolean find(int value);

    int min();
    int max();

    int size();
    boolean isEmpty();
}
