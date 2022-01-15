import jp.ac.uryukyu.ie.e215720.*;

public class Main {
    public static void main(String[] args){
        GameMaster master = new GameMaster("マスター");
        for(var i=0; i<5; i++){
            master.showStatus();
            master.battle();
        }
    }
}
