package mazegame.entity;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class Location {
	private Map <String,Exit> exits;
	private String description;
	private String label;
	
	public Location () { }
	
	public Location (String description, String label){
	  this.description = description;
		this.label = label;
		exits = new HashMap<>();
	}
	
	public void addExit (String exitLabel, Exit theExit)	{
		if(!exits.containsKey(exitLabel)){
			exits.put(exitLabel, theExit);
		}
	}

	public  boolean containsExit(String label){
		return exits.containsKey(label);
	}
  public Exit getExit(String label){
		return exits.get(label);
	}


	public String availableExits(){
		StringBuilder exitToString = new StringBuilder();
		this.exits.keySet().forEach(exit -> exitToString.append("[ ").append(exit).append(" ]"));

		return  exitToString.toString();

	}
	private String getStars(){
		return "\n************************************************************************************************************************\n";
	}
	public String toString(){
		return getStars()
				+ this.label
				+getStars()
				+"Exist found :: "
				+ availableExits()
				+ getStars()
				+ this.description
				+ getStars();

	}
}
