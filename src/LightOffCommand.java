public class LightOffCommand implements  Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public LightOffCommand() {
        this.light = null;
    }
    @Override
    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.LightOff;
    }

    @Override
    public void execute() {
        this.light.setState(false);
    }
}
