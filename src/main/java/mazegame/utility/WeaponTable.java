package mazegame.utility;

import java.util.HashMap;
import java.util.Map;
import mazegame.entity.Item;
import mazegame.entity.Weapon;

public class WeaponTable {
  private static WeaponTable instance;
  private Map<String, Item> lookup;
  private WeaponTable (Map<String, Item> lookup) {
    this.lookup = lookup;

  }
  public WeaponTable getInstance(){
    if(instance == null) {
      instance = new WeaponTable(new HashMap<>());
    }
    return instance;
  }
  public void setWeapon(Item weapon){
    if(weapon != null) {
      lookup.put(weapon.getLabel(), weapon);
    }
  }
  public Weapon getWeapon(String label){
    return (Weapon) lookup.getOrDefault(label, null);
  }
}
