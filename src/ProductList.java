import java.util.Iterator;
import java.util.function.Consumer;

public class ProductList implements Iterator<Product> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Product next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Product> action) {
        Iterator.super.forEachRemaining(action);
    }
}
