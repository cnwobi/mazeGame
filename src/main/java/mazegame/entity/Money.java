package mazegame.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Money {
    private double total;
    public double add(double money){
      total += money;
      return total;
    }

    public double subtract(double money){
      if(money > total){
        throw new ArithmeticException();
      }
      total -= money;
      return total;
    }

}
