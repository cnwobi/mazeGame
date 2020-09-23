package mazegame.control.commands;
import mazegame.control.ParsedInput;
import mazegame.entity.Player;

public class QuitCommand implements Command {

  @Override
  public CommandResponse execute(ParsedInput input, Player player) {
    return new CommandResponse("Thanks for playing --- Goodbye",true);
  }
}
