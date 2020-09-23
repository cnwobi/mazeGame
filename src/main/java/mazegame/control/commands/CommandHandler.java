package mazegame.control.commands;

import java.util.List;
import mazegame.control.ParsedInput;
import mazegame.control.Parser;
import mazegame.control.state.CommandState;
import mazegame.control.state.MovementState;
import mazegame.entity.Player;

public class CommandHandler {
  private CommandState commandState;
  private static CommandHandler instance;

  private   CommandHandler(){
    commandState = new MovementState();
  }
  public static CommandHandler getInstance(){
    if(instance == null ){
      instance = new CommandHandler();
    }
    return instance;
  }

  public CommandResponse processTurn(String input, Player player){
    commandState = commandState.update(player);
    ParsedInput validInput = parse(input);

    Command stateCommand = commandState.getCommand(validInput.getCommand());
    if(stateCommand == null){
      String commandList = String.join(",\n", commandState.getCommandsList());
      String command =
          input.isEmpty() && validInput.getCommand().isEmpty()? "An empty command " : input.split(" ")[0];
      String response = command+ " is not a valid command.\n\nHere are the available commands\n"
          + commandList;
      return new CommandResponse(response);
    }
    return stateCommand.execute(validInput, player);
  }

  private ParsedInput parse(String input){
    Parser parser = new Parser(commandState.getCommandsList());
    return parser.parse(input);
  }
}
