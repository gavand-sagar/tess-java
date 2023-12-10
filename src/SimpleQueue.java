public class SimpleQueue implements  IQueue{
    private  int[] array = new int[20];
    int frontLocation = -1;
    int rearLocation = -1;

    int size = 0;
    @Override
    public int size(){
        return size;
    }


    private int increment(int index){
        if(index == array.length - 1){
            return 0;
        }else{
            return (index + 1);
        }
    }


    @Override
    public void enqueue(int item) throws Exception {
        if(this.size == array.length){
            throw new Exception("Queue overflow.");
        }
        if(frontLocation == -1){
            frontLocation = 0;
        }
        rearLocation = increment(rearLocation);
        array[rearLocation] = item;
        size++;
    }

    @Override
    public int dequeue() throws Exception {
        if(size == 0){
            throw new Exception("Queue underflow.");
        }
        int value = array[frontLocation];
        frontLocation = increment(frontLocation);
        size--;

        if(size == 0){
            frontLocation = -1;
            rearLocation = -1;
        }

        return value;
    }
}
