public class ArrayBasedCollection implements MyIterator {

    private Object[] items;
    private int currentPosition = -1;
    public ArrayBasedCollection(Object[] items) {
        this.items = items;
    }
    @Override
    public Object next() {
        try{
            return items[++currentPosition];
        }catch (Exception e){
            currentPosition= -1;
           return null;
        }

    }

    @Override
    public boolean hasNext() {
        try{
            Object o = items[currentPosition+1];
            return true;
        }catch (Exception e){
            currentPosition= -1;
            return false;
        }

    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object current() {
        return null;
    }
}
