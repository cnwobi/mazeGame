package mazegame;

import java.util.Scanner;

import mazegame.boundary.IMazeClient;

public class SimpleConsoleClient implements IMazeClient {
	
	public String getReply (String question){
		System.out.println("\n" + question + " ");
		return new Scanner (System.in).nextLine();
	}
	
	public void playerMessage (String message){
		System.out.print(message);
	}

	@Override
	public String getCommand() {
		System.out.print ("\n\n>>>\t");
		return new Scanner(System.in).nextLine();
		}
}
