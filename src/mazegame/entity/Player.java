package mazegame.entity;

import mazegame.utility.WeightLimit;

import java.util.ArrayList;

public class Player extends Character {
	
	private Location currentLocation;
	private Location lastLocation;

    public Location getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(Location lastLocation) {
        this.lastLocation = lastLocation;
    }

    private static Player instance = null;
	private int weightLimit;
	private Inventory playerInventory;
    private WeightLimit weightModifier = WeightLimit.getInstance();
    private ArrayList<Weapon> equipped;


    private Player()
    {
    }

    private Player(String name, int strength,int agility, int lifepoints)
	{

	    super (name);
	   super.setStrength(strength);
	   super.setAgility(agility);
	   super.setLifePoints(lifepoints);
       weightLimit = weightModifier.getModifier(super.getStrength()); //use weight modifier to get weight limit according to character strength
        playerInventory = new Inventory();
        playerInventory.getGold().Add(150);
        weightLimit -=playerInventory.getGold().getWeight();
        equipped = new ArrayList<>();
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
        lastLocation = this.currentLocation;
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

   public String equipWeapon(Weapon weapon){

        if (equipped.size() ==0){
            equipped.add(weapon);
            return "You successfully equipped [" +equipped.get(0).getLabel() + "]";
        }
        else if (equipped.get(0) == weapon){
            return "["+equipped.get(0).getLabel() +"] is already equipped";
        }
       else
            return "You cannot equip more than one weapon at a time....unequip [" + equipped.get(0).getLabel() + "] before equipping ["+weapon.getLabel()+"]";

   }

    public ArrayList<Weapon> getEquipped() {
        return equipped;
    }

    public void setEquipped(ArrayList<Weapon> equipped) {
        this.equipped = equipped;
    }
}
