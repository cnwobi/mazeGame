package mazegame.entity;

public class Weapon extends Item {
	
	public Dice m_Dice;


    public Weapon(String label, int price, double weight, String description) {
         super (label, price, weight, description);
    }

    @Override
    public String getLabel() {
        return super.getLabel();
    }


    @Override
    public String getDescription() {
        return super.getDescription();
    }



    @Override
    public double getWeight() {
        return super.getWeight();
    }


}
