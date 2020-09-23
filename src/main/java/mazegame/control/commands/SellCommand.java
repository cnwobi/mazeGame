package mazegame.control.commands;

import mazegame.control.ParsedInput;
import mazegame.entity.Player;

public class SellCommand implements Command{

  @Override
  public CommandResponse execute(ParsedInput input, Player player) {
    return new CommandResponse("You've entered the sell command");
  }
}
