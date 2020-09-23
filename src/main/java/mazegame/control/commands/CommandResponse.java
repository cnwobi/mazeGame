package mazegame.control.commands;

import lombok.Data;

@Data
public class CommandResponse {
  private boolean finishedGame;
  private String message;

  public CommandResponse (String message){
    this.message = message;
    this.finishedGame = false;
  }

  public  CommandResponse (String message , boolean finishedGame ){
    this.message = message;
    this.finishedGame = finishedGame;
  }



}
