package mazegame.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StrengthTable {
  private static StrengthTable instance;
  private final Map<Integer, Integer> lookUp;

  public StrengthTable(Map<Integer, Integer> lookUp) {
    this.lookUp = lookUp;
  }

  public static StrengthTable getInstance(){
    if(instance == null){
      instance = new StrengthTable(new HashMap<>());
    }
    return instance;
  }

  public void setModifier(int key, int value){
    lookUp.put(key, value);
  }
  public int getModifier(int strength){

    int maxStrength = Collections.max(lookUp.keySet());
    if(strength > maxStrength){
      return lookUp.get(maxStrength);
    }
    return  lookUp.getOrDefault(strength, -1);
  }
}
