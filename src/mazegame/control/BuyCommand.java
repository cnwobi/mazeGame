package mazegame.control;

import mazegame.entity.Item;
import mazegame.entity.Player;

public class BuyCommand implements Command {
    public CommandResponse execute (ParsedInput input, Player thePlayer) {
        if (input.getArguments().size() == 0) {
            return new CommandResponse ("If you want to buy an item you need to tell me what");
        }
        String itemLabel = (String) input.getArguments().get(0);
        Item desiredItem = thePlayer.getCurrentLocation().getItem(itemLabel);
        if(desiredItem==null){
            return new CommandResponse("This item does not exist in this location....type in look to view available items");
        }
        if (thePlayer.getPlayerInventory().getGold().getTotal() < desiredItem.getPrice())
        {
            return new CommandResponse("Cannot purchase item, you are low on gold points");
        }
        double accountBalanceBeforeBuy= thePlayer.getPlayerInventory().getGold().getTotal();
        thePlayer.getPlayerInventory().getGold().Subtract(desiredItem.getPrice());
        thePlayer.getPlayerInventory().addItem(desiredItem);
        String stars ="****************************************************\n";
        return new CommandResponse (stars+"--Transaction Complete--\n"+stars +
                "You successfully bought ["+itemLabel+"] for "+ (desiredItem.getPrice()) +
                " gp\n"+stars+"Your account balance before the sale was "+accountBalanceBeforeBuy+" gp\n"+stars+"Your account balance after the sale is " +thePlayer.getPlayerInventory().getGold().getTotal()+" gp\n"+stars);
    }
}



