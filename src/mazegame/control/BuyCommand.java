package mazegame.control;

import mazegame.entity.Player;

public class BuyCommand implements Command {
    public CommandResponse execute (ParsedInput input, Player thePlayer) {
        if (input.getArguments().size() == 0) {
            return new CommandResponse ("If you want to buy an item you need to tell me what");
        }
        return new CommandResponse ("You entered the buy command");
    }
}
