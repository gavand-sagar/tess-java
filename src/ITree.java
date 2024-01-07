import java.util.List;

public interface ITree {
    void display();
    List<Integer> asCollection();
    void insertValue(int value);

    void delete(int value);
    boolean find(int value);

    int size();
    boolean isEmpty();
}
