package jp.ac.uryukyu.ie.e215720;
import java.util.ArrayList;
public class GameMaster {
    /**
     * ゲームマスタークラス
     * 対戦する際の審判的なもの
     * ArrayList<Player> Player1  プレイヤーのうちの一人
     * ArrayList<Player> Player2 　プレイヤーのうちの一人
     * ArrayList<Character> player1Character プレイヤー１のキャラクター
     * ArrayList<Character> player２Character　プレイヤー２のキャラクター
     */
    ArrayList<Player> Player1 = new ArrayList<>();
    ArrayList<Player> Player2 = new ArrayList<>();
    ArrayList<Character> player1Character = new ArrayList<>();
    ArrayList<Character> player2Character = new ArrayList<>();
    /**
     * コンストラクタ
     * プレイヤーとキャラクターをここで生成する
     * var player1　プレイヤー１
     * var player2 プレイヤー２
     * var character1 キャラクター１
     * var character2 キャラクター２
     * それぞれ対応するプレイヤーやlistに追加
     */
    public GameMaster(){
        var player1 = new Player("プレイヤー１",20);
        var player2 = new Player("プレイヤー2",20);
        var character1 = new Character("キャラ1",2,6);
        var character2 = new Character("キャラ2",2,5);
        //ここにキャラを追加する場合はコードを増やす
        player1.addCharacter(character1);
        player2.addCharacter(character2);
        player1Character.add(character1);
        player2Character.add(character2);
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
    /**
     * 一ターンのバトル用のコードを作成するメゾット
     * リストを参照してリスト内にプレイヤーが残っている場合のみ攻撃できる
     * プレイヤーが倒されいる場合はリストから削除する
     * 
     */
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
