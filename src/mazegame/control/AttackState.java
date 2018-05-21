package mazegame.control;

import mazegame.entity.NonPlayerCharacter;
import mazegame.entity.Player;

public class AttackState extends CommerceState {
    public AttackState(){
        this.getAvailableCommands().put("go", new MoveCommand());
        this.getAvailableCommands().put("quit", new QuitCommand());
        this.getAvailableCommands().put("move", new MoveCommand());
        this.getAvailableCommands().put("look", new LookCommand());
        this.getAvailableCommands().put("unlock", new UnlockCommand());
        this.getAvailableCommands().put("attack", new AttackCommand());
        this.getAvailableCommands().put("get", new GetCommand());
        this.getAvailableCommands().put("drop", new DropCommand());
        this.getAvailableCommands().put("inv",new InvCommand());
        this.getAvailableCommands().put("equip",new EquipCommand());
        this.getAvailableCommands().put("unequip",new UnequipCommand());

    }
    public CommandState update(Player thePlayer)
    {
        for(NonPlayerCharacter npc: thePlayer.getCurrentLocation().getNonPlayerCharacters().values()){
            if(npc.getHostile() == true){
                return  this;
            }
        }

        return new MovementState();

    }
}
