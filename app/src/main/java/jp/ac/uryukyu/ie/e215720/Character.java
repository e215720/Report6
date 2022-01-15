package jp.ac.uryukyu.ie.e215720;
public class Character extends Mob{
    int attack;
    Character(String name,int hp,int attack){
        super(name, hp);
        this.attack = attack;
    }
    @Override
    public void act(Mob mob){
        System.out.println(mob.getName()+"に"+getName()+"は攻撃した");
        mob.damaged(attack);
        System.out.println(mob.getName()+"に"+attack+"のダメージ");
    }
    @Override
    void showStatus() {
        System.out.printf("%s:HP %d  attack %d\n", getName(),getHp(),attack);
    }


    
}
