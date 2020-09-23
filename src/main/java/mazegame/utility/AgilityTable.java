package mazegame.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class AgilityTable {
private static AgilityTable instance;
private Map<Integer, Integer> strengthModifierMap;

public static AgilityTable getInstance(){
  if(instance == null){
    instance = new AgilityTable(new HashMap<>());
  }
  return instance;
}

private  AgilityTable (){
}

  private AgilityTable(Map<Integer, Integer> strengthModifierMap) {
    this.strengthModifierMap = strengthModifierMap;
  }

  public void setModifier(int agility, int modifier){
      strengthModifierMap.put(agility,modifier);
  }
  public int getModifier(int agility){
    int maxAgility = Collections.max(strengthModifierMap.keySet());
    if(agility > maxAgility) {
      return strengthModifierMap.get(maxAgility);
    }
    if(strengthModifierMap.containsKey(agility)){
      return strengthModifierMap.get(agility);
    }
    return -1;
  }
}
