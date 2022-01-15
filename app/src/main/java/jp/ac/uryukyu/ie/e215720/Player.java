package jp.ac.uryukyu.ie.e215720;
import java.util.ArrayList;
public class Player extends Mob{
    private ArrayList<Character> characters = new ArrayList<>();
    Player(String name, int hp) {
        super(name, hp);
    }
    
    void addCharacter(Character character) {
        characters.add(character);
    }



    void act(ArrayList<Player>targets){
        var commands = new Commands();
    
        for(var character:characters){
            commands.addCommand(character.getName());
        }
        var command_number = commands.waitPlayersCommand("コマンド？");
        commands.clearCommands();
        for(var target: targets) {
            commands.addCommand(target.getName());
        }
        var target_number = commands.waitPlayersCommand("ターゲット？");
        
        characters.get(command_number).act(targets.get(target_number));

    }    


    
}
