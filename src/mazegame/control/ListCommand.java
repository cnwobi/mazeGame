package mazegame.control;

import mazegame.entity.Player;

public class ListCommand implements Command{
    @Override
    public CommandResponse execute(ParsedInput userInput, Player player) {
        if (userInput.getArguments().size() == 0) {
            return new CommandResponse ("If you want to get item you need to tell me what.\n****Enter [list location] ... to view location items\n****Enter [list player]... to view items in player inventory");
        }
        if (userInput.getArguments() .contains("location"))
        {
            return new CommandResponse("Current Location("+player.getCurrentLocation().getLabel()+") Inventory ===> " +player.getCurrentLocation().availableItems());
        }
        if(userInput.getArguments() .contains("player"))
        {
            return new CommandResponse( "Player inventory ==> "+ player.getPlayerInventory().printItemList()+"\nAvailable Money ==> "+player.getPlayerInventory().getGold().toString());
        }

        return new CommandResponse( "Didn't find that to list");
    }
}
