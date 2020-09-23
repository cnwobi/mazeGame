package mazegame.control;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;


@Data
public class ParsedInput {
   private  String command;
   private List<String> arguments;

  public ParsedInput() {
    command = "";
    arguments = new ArrayList<>();

  }

  public ParsedInput(String command, List<String> arguments) {
    this.command = command;
    this.arguments = arguments;
  }
}
