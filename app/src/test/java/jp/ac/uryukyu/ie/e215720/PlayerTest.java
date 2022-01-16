package jp.ac.uryukyu.ie.e215720;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PlayerTest {
    @Test
    void test(){
        int hp = 10;
        Player player1 = new Player("デモ１", hp);
        Player player2 = new Player("デモ2", hp);
        player1.addCharacter(new Character("キャラ1",2,10));
        player2.addCharacter(new Character("キャラ2",2,5));
        player2.addCharacter(new Character("キャラ3",2,5));
        assertEquals(1,player1.getCharacters().size());
        assertEquals(2,player2.getCharacters().size());
    }

    
}
