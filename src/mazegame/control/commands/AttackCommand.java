package mazegame.control.commands;

import mazegame.control.CommandResponse;
import mazegame.control.ParsedInput;
import mazegame.entity.Player;
import mazegame.utility.DiceRoller;

public class AttackCommand implements Command {
    public CommandResponse execute (ParsedInput input, Player thePlayer) {
        DiceRoller diceRoller = DiceRoller.getInstance();
        System.out.println("Ability Score: "+diceRoller.generateAbilityScore());
        return new CommandResponse ("You entered the attack command");
    }
}
