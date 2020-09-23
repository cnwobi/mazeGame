package mazegame.control.commands;

import mazegame.control.ParsedInput;
import mazegame.entity.Player;

public interface Command {
   CommandResponse execute(ParsedInput input , Player player);

}
