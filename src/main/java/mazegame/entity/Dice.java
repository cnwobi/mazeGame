package mazegame.entity;

import java.util.Random;
import lombok.Data;

@Data
public class Dice {
  private int faces;
  private static Random random = new Random();
  public Dice(int faces){
    this.faces = faces;
  }
  public int roll(){
    return random.nextInt(this.faces ) + 1;
  }


}
