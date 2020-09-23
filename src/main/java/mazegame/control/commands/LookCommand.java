package mazegame.control.commands;

import mazegame.control.ParsedInput;
import mazegame.entity.Exit;
import mazegame.entity.Player;

public class LookCommand implements Command{

  @Override
  public CommandResponse execute(ParsedInput input, Player player) {
    CommandResponse response = new CommandResponse("Can't find that to look at here!");
    // when look has no arguments look in the current location
    if(input.getArguments().size() == 0){
      response.setMessage(player.getCurrentLocation().toString());
       return  response;
    }
    input.getArguments().forEach(arg -> {
     if(player.getCurrentLocation().containsExit(arg)){
       Exit exit = player.getCurrentLocation().getExit(arg);
       response.setMessage(exit.getDescription());
     }
    });
    return response;
  }
}
