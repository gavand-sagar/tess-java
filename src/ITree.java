public interface ITree {
    void display();
    void insertValue(String value);

    boolean find(String value);

    int size();
    boolean isEmpty();

    void displayInAscOrder();

    int total();
}
