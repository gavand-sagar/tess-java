public class Dance implements Handler{

    private Handler handler;
    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    public Dance() {
        this.handler = null;
    }

    public Dance(Handler handler) {
        this.handler = handler;
    }


    @Override
    public void handle() {
        System.out.println("Dancing.......");

        if(this.handler != null){
            this.handler.handle();
        }
    }
}
