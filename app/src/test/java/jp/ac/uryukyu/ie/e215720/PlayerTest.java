package jp.ac.uryukyu.ie.e215720;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PlayerTest {
    @Test
    void test(){
        int hp = 10;
        Player player1 = new Player("デモ１", hp);
        Player player2 = new Player("デモ2", hp);
        Character cha1= new Character("キャラ1",2,10);
        Character cha2= new Character("キャラ2",2,5);
        Character cha3= new Character("キャラ3",2,5);
        player1.addCharacter(cha1);
        player2.addCharacter(cha2);
        player2.addCharacter(cha3);
        cha1.act(player2);
        cha2.act(player1);
        cha3.act(player1);
        assertEquals(0,player2.getHp());
        assertEquals(0, player1.getHp());
        assertEquals(1, player1.getCharacters().size());
        assertEquals(2, player2.getCharacters().size());
    }

    
}
