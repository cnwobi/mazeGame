package mazegame.control.commands;

import mazegame.control.ParsedInput;
import mazegame.entity.Exit;
import mazegame.entity.Player;

public class MoveCommand implements Command{

  @Override
  public CommandResponse execute(ParsedInput input, Player player) {
    if(input.getArguments().size() == 0){
      return new CommandResponse("Move command requires a direction argument. "
          + "\nUse the look command to see available directions to exit");
    }
    String exitLabel = input.getArguments().get(0);
    Exit  desiredExit = player.getCurrentLocation().getExit(exitLabel);
    if(desiredExit == null) {
      return new CommandResponse("There is no exit there . . . try moving somewhere else");
    }
    player.setCurrentLocation(desiredExit.getDestination());
    return new CommandResponse("You successfully moved to "+ exitLabel + " and find yourself "
        + "somewhere else \n"+ player.getCurrentLocation().toString());
  }
}
