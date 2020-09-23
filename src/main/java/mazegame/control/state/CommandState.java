package mazegame.control.state;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import mazegame.control.commands.Command;
import mazegame.entity.Player;
@Data
public abstract class CommandState {

  private Map<String, Command> availableCommands;

  public abstract CommandState update(Player player);

  public CommandState (){
    availableCommands = new HashMap<>();
  }
  public Command getCommand(String commandLabel){
    return availableCommands.get(commandLabel);
  }
   public List<String> getCommandsList(){
    return new ArrayList<>(availableCommands.keySet());
   }




}
