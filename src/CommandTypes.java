import java.util.HashMap;
import java.util.Map;

public class CommandTypes {

    static Map<CommandType,Command> getCommandTypes() {

        Map<CommandType, Command> commandMap = new HashMap<CommandType, Command>();
        commandMap.put(CommandType.LightOff,new LightOnCommand());
        commandMap.put(CommandType.LightOn,new LightOffCommand());
        return commandMap;
    }
}
