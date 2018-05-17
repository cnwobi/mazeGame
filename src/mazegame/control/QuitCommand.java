package mazegame.control;

import mazegame.entity.Player;

public class QuitCommand implements Command {
    @Override
    public CommandResponse execute(ParsedInput userInput, Player player) {
        return new CommandResponse("Thanks for playing --- Goodbyye", true);
    }
}
