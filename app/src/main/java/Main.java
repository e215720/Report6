import jp.ac.uryukyu.ie.e215720.*;
//import jp.ac.uryukyu.ie.e215720.Character;

public class Main {
    public static void main(String[] args){
        GameMaster master = new GameMaster();
        for(var i=0; i<4; i++){
            master.showStatus();
            master.battle();
        }
        //int hp = 10;
        //Player player1 = new Player("デモ１", hp);
        //Player player2 = new Player("デモ2", hp);
        //Character cha1 = new Character("キャラ1", hp, 10);
        //Character cha2= new Character("キャラ2",2,5);
        //Character cha3= new Character("キャラ3",2,5);
        //player1.addCharacter(cha1);
        //player2.addCharacter(cha2);
        //player2.addCharacter(cha3);
        //cha1.act(player2);
        //cha2.act(player1);
        //cha3.act(player1);

    }
}
