package jp.ac.uryukyu.ie.e215720;
import java.util.ArrayList;
import java.util.Scanner;
public class Commands {
    ArrayList<String> commands;
    Scanner scanner;
    Commands(){
        scanner = new Scanner(System.in);
        commands = new ArrayList<>();
    }
    void addCommand(String command_name){
        commands.add(command_name);
    }
    void clearCommands(){
        commands.clear();
    }
    int waitPlayersCommand(String prompt){
        var index = 0;
        System.out.println(prompt);
        for(var command:commands){
            System.out.println(index + ":"+ command);
            index +=1;
        }
        while(true){
            int target_index = scanner.nextInt();
            if(target_index >=0 &&target_index<commands.size()){
                return target_index;

            }
        }

    }

    
}
