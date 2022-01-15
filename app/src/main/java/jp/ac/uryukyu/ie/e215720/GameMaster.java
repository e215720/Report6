package jp.ac.uryukyu.ie.e215720;
import java.util.ArrayList;
public class GameMaster {
    String name;
    ArrayList<Player> Player1 = new ArrayList<>();
    ArrayList<Player> Player2 = new ArrayList<>();
    public GameMaster(String name){
        var player1 = new Player("プレイヤー１",20);
        var player2 = new Player("プレイヤー2",20);
        player1.addCharacter(new Character("キャラ1",2,20));
        player2.addCharacter(new Character("キャラ2",2,5));
        Player1.add(player1);
        Player2.add(player2);
    }
    public void showStatus() { //全キャラクタのステータスを表示（テスト用）
        for(var ch : Player1) {
            ch.showStatus();
        }
        for(var ch : Player2) {
         ch.showStatus();
        }   
    }
    public void battle() { 
        //１ターン実行する
        if(Player2.size()>0){
            for(Player ch : Player1) {
                    if(ch.getHp()<=0){
                        System.out.println(ch.getName()+"はモンスターによって倒れた。");
                        Player1.remove(ch);
                        break;
                    } 
                    else{ 
                        ch.act(Player2);
                    }
            }
        }    
        if(Player1.size()>0){
                for(var ch : Player2) {
                    if(ch.getHp()<=0){
                        System.out.println(ch.getName()+"は倒れた。");
                        Player2.remove(ch);
                        break;
                    }
                    else{
                        ch.act(Player1);
                    }
                }
        } 
    } 
}
