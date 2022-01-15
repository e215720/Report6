package jp.ac.uryukyu.ie.e215720;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CharacterTest {
    @Test
    void test(){
        int hp = 10;
        Character hero = new Character("デモモブ", hp,5);
        Character mao = new Character("デモ魔王", hp,100);
        hero.act(mao);
        hero.act(mao);
        assertEquals(0,mao.getHp());
    } 
}
