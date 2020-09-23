package mazegame.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeightLimit {
   private static WeightLimit instance;
   private final Map<Integer,Integer> lookUp;
   private WeightLimit (Map<Integer, Integer> lookUp){
     this.lookUp = lookUp;
   }
   public static WeightLimit getInstance(){
     if(instance == null) {
     instance = new WeightLimit(new HashMap<>());
     }
     return instance;
   }
   public int getModifier(int strength){

     int maxStrength = Collections.max(lookUp.keySet());
     if(strength > maxStrength){
       return lookUp.get(maxStrength);
     }
     return  lookUp.getOrDefault(strength, -1);
   }

   public void setModifier(int strength, int modifier){
     lookUp.put(strength, modifier);
   }
}
