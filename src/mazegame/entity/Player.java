package mazegame.entity;

import mazegame.utility.WeightLimit;

import java.util.HashMap;

public class Player extends Character {
	
	private Location currentLocation;
	private static Player instance = null;
	private Money m_money;
	private int weightLimit;
	private Inventory playerInventory;
    private WeightLimit weightModifier = WeightLimit.getInstance();

    private Player()
    {
    }

    private Player(String name, int strength,int agility, int lifepoints)
	{

	    super (name);
	   super.setStrength(strength);
	   super.setAgility(agility);
	   super.setLifePoints(lifepoints);
       weightLimit = weightModifier.getModifier(super.getStrength()); //use weight modifier to get weight limit accoording to character strength
        playerInventory = new Inventory();
        playerInventory.getGold().Add(150);
        weightLimit -=playerInventory.getGold().getWeight();
	}


	public static Player getInstance(String name,int strength,int agility, int lifepoints){
        if(instance== null)
            instance = new Player(name,strength,agility,lifepoints);
        return instance;

    }
public int getWeightLimit() {

        return weightLimit;
    }

    public void setWeightLimit(int weight) {

        this.weightLimit -= weight;
    }



    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }


    public int getStrength() {
        return super.getStrength();
    }


    public void setStrength(int strength) {
       super.setStrength(strength);
    }

    @Override
    public int getLifePoints() {
        return super.getLifePoints();
    }

    @Override
    public int getAgility() {
        return super.getAgility();
    }
}
