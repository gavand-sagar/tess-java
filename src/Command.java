public interface Command {

    void setLight(Light light);
    CommandType getCommandType();
    void execute();
}
