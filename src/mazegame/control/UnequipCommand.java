package mazegame.control;

import mazegame.entity.Player;

public class UnequipCommand implements Command {
    @Override
    public CommandResponse execute(ParsedInput userInput, Player player) {

            if (player.getEquipped().size()==0) {
                return new CommandResponse ("You have no equipped weapon to unequip");
            }
            player.getEquipped().remove(0);
            return new CommandResponse ("You successfully unequipped your weapon");

    }
}
