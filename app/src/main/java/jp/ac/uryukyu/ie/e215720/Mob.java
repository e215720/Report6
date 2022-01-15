package jp.ac.uryukyu.ie.e215720;

public class Mob {
    private String name;
    private int hp;
    String getName(){
        return this.name;
    }
    int getHp(){
        return this.hp;
    }
    void damaged(int value){
        this.hp -=value;
    }
    void heelingHp(int value){
        this.hp +=value;
    }
    Mob(String name,int hp){
        this.name = name;
        this.hp = hp;
    }
    void act(Mob target){
    };
    void showStatus() {
        System.out.printf("%s:HP %d \n", name, hp);
    }
 

}
