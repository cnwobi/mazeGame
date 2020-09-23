package mazegame.control.state;

import mazegame.control.commands.BuyCommand;
import mazegame.control.commands.LookCommand;
import mazegame.control.commands.MoveCommand;
import mazegame.control.commands.SellCommand;
import mazegame.entity.Blacksmith;
import mazegame.entity.Player;

public class CommerceState extends CommandState {

  public CommerceState() {
    this.getAvailableCommands().put("go", new MoveCommand());
    this.getAvailableCommands().put("buy", new BuyCommand());
    this.getAvailableCommands().put("move", new MoveCommand());
    this.getAvailableCommands().put("look", new LookCommand());
    this.getAvailableCommands().put("sell", new SellCommand());
  }



  @Override
  public CommandState update(Player player) {
    if(player.getCurrentLocation() instanceof Blacksmith){
      return this;
    }
    return new MovementState();
  }
}
