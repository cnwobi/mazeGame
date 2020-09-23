package mazegame.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parser {
  private final List<String> dropWords;
  private final List<String> validCommands;

  public Parser( List<String> validCommands) {
    this.dropWords = new ArrayList<>(Arrays.asList("an", "and", "the", "this", "to"));
    this.validCommands = validCommands;
  }

  public ParsedInput parse(String input){
    ParsedInput parsedInput = new ParsedInput();
    String lowerCaseInput = input.toLowerCase();
    List<String> stringTokens = new ArrayList<>(Arrays.asList(lowerCaseInput.split(" ")));

    stringTokens.forEach(token ->{
      if(validCommands.contains(token)){
        parsedInput.setCommand(token);
      }
      else if ( !dropWords.contains(token)){
        parsedInput.getArguments().add(token);
      }
    });
     return parsedInput;
  }
}
