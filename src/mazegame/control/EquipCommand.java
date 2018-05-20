package mazegame.control;

import mazegame.entity.Player;
import mazegame.entity.Weapon;

public class EquipCommand implements Command {
    @Override
    public CommandResponse execute(ParsedInput userInput, Player player) {
        if (userInput.getArguments().size() == 0) {
            return new CommandResponse ("If you want to equip a weapon you need to tell me which.");
        }
        String itemLabel = (String) userInput.getArguments().get(0);
        Weapon desiredWeapon = (Weapon) player.getPlayerInventory().getItem(itemLabel);
        if (desiredWeapon == null){
            return new CommandResponse("The weapon [" + itemLabel+"] was not found in the player's inventory");
        }
         return  new CommandResponse(player.equipWeapon(desiredWeapon));

    }
}
