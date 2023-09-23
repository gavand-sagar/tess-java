public class Sing implements Handler {
    private Handler handler;
    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    public Sing() {
        this.handler = null;
    }

    public Sing(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle() {
        System.out.println("Singing.......");

        if(this.handler != null){
            this.handler.handle();
        }
    }
}
