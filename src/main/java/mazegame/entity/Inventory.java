package mazegame.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Data;

@Data
public class Inventory {
  private Map<String, Item> itemList;

  public Inventory() {
    this.itemList = new HashMap<>();
  }
  public Item addItem(Item item){
    itemList.put(item.getLabel(),item);
    return itemList.get(item.getLabel());
  }
  public void removeItem(Item item){
    itemList.remove(item.getLabel());
  }
  public Item getItem(String itemLabel){
    return itemList.getOrDefault(itemLabel,null);
  }
  public String printInventoryList(){
    if(itemList.isEmpty()) return "No items in Inventory";
    StringBuilder builder = new StringBuilder();
    builder.append("Inventory contains :: ");
    AtomicInteger count = new AtomicInteger();
    itemList.values().forEach(item -> {
      builder.append("\n").append(count.incrementAndGet()).append(". ").append(item.getLabel());
    });
    return builder.toString();
  }
}
