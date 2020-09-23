package mazegame.entity;

import java.util.ArrayList;
import lombok.Data;
import mazegame.control.exception.WeightLimitException;
import mazegame.utility.WeightLimit;

@Data
public class Player extends Character {
		private Location currentLocation;
	  private static Player instance = null;
  	private double weightLimit;
    private WeightLimit weightModifier = WeightLimit.getInstance();
    private Weapon equipped;
    private double gold;

    private Player()  {
    }
	private Player(String name, int strength,int agility, int lifePoints)
	{

		super (name);
		super.setStrength(strength);
		super.setAgility(agility);
		super.setLifePoints(lifePoints);
		weightLimit = weightModifier.getModifier(super.getStrength()); //use weight modifier to get weight limit according to character strength

		try{
			setGold(150);
		}
		catch (WeightLimitException e){
			System.out.println(e.getMessage());
		}


	}
	public void setGold(double gold) throws WeightLimitException {
    	double weightOfGold = gold/100;
    	if(weightOfGold > weightLimit) throw new WeightLimitException("You cannot carry more gold, weight limit reached");
    	weightLimit -= weightOfGold;
	}
	public static Player getInstance(String name,int strength,int agility, int lifePoints){
		if(instance== null)
			instance = new Player(name,strength,agility,lifePoints);
		return instance;

	}
}
