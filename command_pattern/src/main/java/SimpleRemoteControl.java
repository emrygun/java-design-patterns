import Material.Command.Command;

import java.util.ArrayList;
import java.util.List;

public class SimpleRemoteControl {
    private List<Command> materialList = new ArrayList<Command>();
    public SimpleRemoteControl() { }

    public void setCommand(Command command) {
        materialList.add(command);
    }
    public void buttonWasPressed() {
        materialList.forEach(Command::execute);
    }
}
