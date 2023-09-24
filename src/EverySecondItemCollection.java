public class EverySecondItemCollection implements MyIterator{
    private Object[] items;
    private int currentPosition = -1;
    public EverySecondItemCollection(Object[] items) {
        this.items = items;
    }
    @Override
    public Object next() {
        try{
            int nextLocation = currentPosition + 2;
            currentPosition += 2;
            return items[nextLocation];
        }catch (Exception e){
            currentPosition= -1;
            return null;
        }

    }

    @Override
    public boolean hasNext() {
        try{
            Object o = items[currentPosition+2];
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
