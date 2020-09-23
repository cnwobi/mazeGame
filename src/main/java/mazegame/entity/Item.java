package mazegame.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Item {
  private String label;
  private String description;
  private double value;
  private double weight;


}
