import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

        int index = -1;
        List<Command> commands = new ArrayList<Command>();

        Light light = new Light();
        light.showState();

        Command c = new LightOnCommand(light);
        c.execute();
        commands.add(c);
        index++;
        light.showState();


        Command c2 = new LightOffCommand(light);
        c2.execute();
        commands.add(c2);
        index++;
        light.showState();




        /// undo
        Command oppsiteCommand = CommandTypes.getCommandTypes().get(commands.get(index).getCommandType()) ;
        oppsiteCommand.setLight((light));
        oppsiteCommand.execute();
        index--;
        light.showState();



        // undo
        Command oppsiteCommand1 = CommandTypes.getCommandTypes().get(commands.get(index).getCommandType()) ;
        oppsiteCommand1.setLight((light));
        oppsiteCommand1.execute();
        index--;
        light.showState();



    }
}

