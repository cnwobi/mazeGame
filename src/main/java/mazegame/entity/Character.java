package mazegame.entity;

import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Character {
	private int agility;
    private int lifePoints;
    private String name;
    private int strength;
    private Map<String, Item> inventory;
    
//    public Mazegame.Entity.Dice m_Dice;
//    public Mazegame.Entity.Party m_Party;
//    public Mazegame.Entity.Item m_Item;
//    public Mazegame.Entity.Shield m_Shield;
//    public Mazegame.Entity.Weapon m_Weapon;
//    public Mazegame.Entity.Armor m_Armor;
    

    public Character(String name){
        this.name = name;
    }

    }

