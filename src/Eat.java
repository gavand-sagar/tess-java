public class Eat implements Handler {
    private Handler handler;
    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    public Eat() {
        this.handler = null;
    }

    public Eat(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle() {
        System.out.println("Eating.......");

        if(this.handler != null){
            this.handler.handle();
        }
    }
}