package mazegame.control.state;

import mazegame.control.commands.AttackCommand;
import mazegame.control.commands.LookCommand;
import mazegame.control.commands.MoveCommand;
import mazegame.control.commands.QuitCommand;
import mazegame.control.commands.UnlockCommand;
import mazegame.entity.Blacksmith;
import mazegame.entity.Player;

public class MovementState extends CommandState{

  public MovementState() {
    this.getAvailableCommands().put("go", new MoveCommand());
    this.getAvailableCommands().put("quit", new QuitCommand());
    this.getAvailableCommands().put("move", new MoveCommand());
    this.getAvailableCommands().put("look", new LookCommand());
    this.getAvailableCommands().put("unlock", new UnlockCommand());
    this.getAvailableCommands().put("attack", new AttackCommand());
  }

  @Override
  public CommandState update(Player player) {
    if(player.getCurrentLocation() instanceof Blacksmith){
      return new CommerceState();
    }
    return this;
  }

}
