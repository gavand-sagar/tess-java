public class LightOnCommand implements Command{

    private  Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    public LightOnCommand() {
        this.light = null;
    }

    @Override
    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.LightOn;
    }

    @Override
    public void execute() {
        light.setState(true);
    }
}
