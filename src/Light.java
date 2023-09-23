public class Light {
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    private boolean state;

    public  void showState(){
        System.out.println("Light is " + (this.state? "ON" : "OFF"));
    }

}
