package mazegame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mazegame.boundary.IMazeData;
import mazegame.entity.Exit;
import mazegame.entity.Location;
import mazegame.utility.StrengthTable;
import mazegame.utility.WeightLimit;

public class HardCodedData implements IMazeData {
	private Location startUp;
	
	public HardCodedData()
	{
		createLocations();
	}
	
	public Location getStartingLocation()
	{
		return startUp;
	}
	
	public String getWelcomeMessage()	{
		populateStrengthTable();
		populateWeightLimitTable();
		return "Your eyes are glassy your head is pounding that sadist of a lecturer has you pulling an “all-nighter”"
				+ " to get your assignment in. "
				+ "Despite being on your 8th can of “Guarana Max” your eyes start to close and you drift off to sleep at the keyboard……."
				+ "\n\n\n\n";
	}

	private void createLocations () {

		startUp = new Location ("an office with paper strewn everywhere, how anyone can work here effectively is a mystery", "Julies Office");
		Location lounge = new Location ("an open space containing comfortable looking couches and artwork", "Airport Lounge");
		Location t127 = new Location ("a lecture theatre", "T127");
		Location gregOffice = new Location ("a spinning vortex of terror", "Greg's Office");
		
		// Connect Locations
		startUp.addExit("south",  new Exit ("you see an open space to the south", lounge));
		lounge.addExit("north", new Exit("you see a mound of paper to the north", startUp));

        startUp.addExit("west", new Exit("you see a terrifying office to the west", gregOffice));
        gregOffice.addExit("east", new Exit("you see a mound of paper to the east", startUp));

        t127.addExit("south", new Exit("you see a mound of paper to the south", startUp));
        startUp.addExit("north", new Exit("you see a bleak place to the north", t127));

        lounge.addExit("northwest", new Exit("you see a terrifying office to the northwest", gregOffice));
        gregOffice.addExit("southeast", new Exit("you see an open space to the southeast", lounge));


	}

	private void populateStrengthTable()	{
		StrengthTable strengthModifiers = StrengthTable.getInstance();
		strengthModifiers.setModifier(1, -5);
		strengthModifiers.setModifier(2, -4);
		strengthModifiers.setModifier(3, -4);
		strengthModifiers.setModifier(4, -3);
		strengthModifiers.setModifier(5, -3);
		strengthModifiers.setModifier(6, -2);
		strengthModifiers.setModifier(7, -2);
		strengthModifiers.setModifier(8, -1);
		strengthModifiers.setModifier(9, -1);
		strengthModifiers.setModifier(10, 0);
		strengthModifiers.setModifier(11, 0);
		strengthModifiers.setModifier(12, 1);
		strengthModifiers.setModifier(13, 1);
		strengthModifiers.setModifier(14, 2);
		strengthModifiers.setModifier(15, 2);
		strengthModifiers.setModifier(16, 3);
		strengthModifiers.setModifier(17, 3);
		strengthModifiers.setModifier(18, 4);
		strengthModifiers.setModifier(19, 4);
		strengthModifiers.setModifier(20, 5);
		strengthModifiers.setModifier(21, 5);
		strengthModifiers.setModifier(22, 5);
		strengthModifiers.setModifier(23, 5);
		strengthModifiers.setModifier(24, 5);
		strengthModifiers.setModifier(25, 5);
		strengthModifiers.setModifier(26, 8);
		strengthModifiers.setModifier(27, 8);
		strengthModifiers.setModifier(28, 8);
		strengthModifiers.setModifier(29, 8);
		strengthModifiers.setModifier(30, 10);
		strengthModifiers.setModifier(31, 10);
		strengthModifiers.setModifier(32, 10);
		strengthModifiers.setModifier(33, 10);
		strengthModifiers.setModifier(34, 10);
		strengthModifiers.setModifier(35, 10);
		strengthModifiers.setModifier(36, 12);
		strengthModifiers.setModifier(37, 12);
		strengthModifiers.setModifier(38, 12);
		strengthModifiers.setModifier(39, 12);
		strengthModifiers.setModifier(40, 12);
		strengthModifiers.setModifier(41, 15);
		strengthModifiers.setModifier(42, 15);
		strengthModifiers.setModifier(43, 15);
		strengthModifiers.setModifier(44, 17);
		strengthModifiers.setModifier(45, 17);
		strengthModifiers.setModifier(46, 18);
	}
	private void populateWeightLimitTable(){
//		Dice dice = new Dice(20);
//		System.out.println("Dice roll *****************"+dice.roll());
		WeightLimit weightModifier = WeightLimit.getInstance();
		weightModifier.setModifier(1, 6);
		weightModifier.setModifier(2, 13);
		weightModifier.setModifier(3, 20);
		weightModifier.setModifier(4, 26);
		weightModifier.setModifier(5, 33);
		weightModifier.setModifier(6, 40);
		weightModifier.setModifier(7, 46);
		weightModifier.setModifier(8, 53);
		weightModifier.setModifier(9, 60);
		weightModifier.setModifier(10, 66);
		weightModifier.setModifier(11, 76);
		weightModifier.setModifier(12, 86);
		weightModifier.setModifier(13, 100);
		weightModifier.setModifier(14, 116);
		weightModifier.setModifier(15, 133);
		weightModifier.setModifier(16, 153);
		weightModifier.setModifier(17, 173);
		weightModifier.setModifier(18, 200);
		weightModifier.setModifier(19, 233);
		weightModifier.setModifier(20, 266);
		weightModifier.setModifier(21, 306);
		weightModifier.setModifier(22, 346);
		weightModifier.setModifier(23, 400);
		weightModifier.setModifier(24, 466);
		weightModifier.setModifier(25, 533);
		weightModifier.setModifier(26, 613);
		weightModifier.setModifier(27, 693);
		weightModifier.setModifier(28, 800);
		weightModifier.setModifier(29, 933);
		weightModifier.setModifier(30, 1013);
		weightModifier.setModifier(31, 1093);
		weightModifier.setModifier(32, 1300);
		weightModifier.setModifier(33, 1433);
		weightModifier.setModifier(34, 1513);
		weightModifier.setModifier(35, 1593);
		weightModifier.setModifier(36, 1700);
		weightModifier.setModifier(37, 1833);
		weightModifier.setModifier(38, 1913);
		weightModifier.setModifier(39, 1993);
		weightModifier.setModifier(40, 2100);
		weightModifier.setModifier(41, 2233);
		weightModifier.setModifier(42, 2313);
		weightModifier.setModifier(43, 2393);
		weightModifier.setModifier(44, 2500);
		weightModifier.setModifier(45, 2633);
		weightModifier.setModifier(46, 2713);
	}


}
