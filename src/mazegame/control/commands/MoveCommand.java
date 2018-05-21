package mazegame.control.commands;

import mazegame.control.CommandResponse;
import mazegame.control.ParsedInput;
import mazegame.control.commands.Command;
import mazegame.entity.Exit;
import mazegame.entity.NonPlayerCharacter;
import mazegame.entity.Player;

public class MoveCommand implements Command {

    public CommandResponse execute (ParsedInput userInput, Player thePlayer) {
        if (userInput.getArguments().size() == 0) {
            return new CommandResponse ("If you want to move you need to tell me where.");
        }
        String exitLabel = (String) userInput.getArguments().get(0);
        Exit desiredExit = thePlayer.getCurrentLocation().getExit(exitLabel);
        if (desiredExit == null) {
            return new CommandResponse("There is no exit there . . . try moving somewhere else!");
        }
        if (desiredExit.isLocked()){
            return new CommandResponse("This exit is locked please...acquire the ITECH 3215 banner to proceed");
        }
        thePlayer.setCurrentLocation(desiredExit.getDestination());
        
       for(NonPlayerCharacter npc: thePlayer.getCurrentLocation().getNonPlayerCharacters().values()){
            if(npc.getHostile() == true){
                /*Attack */
               System.out.println("**** Hostile Characters in location****\n****Attack Command activated****\n");
            }
        }
        return new CommandResponse("You successfully moved " + exitLabel+ " and find   yourself somewhere else\n\n" + thePlayer.getCurrentLocation().toString());
    }
}

