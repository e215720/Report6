package jp.ac.uryukyu.ie.e215720;

public class Mob {
    /**
     * モブクラス
     * String name モブの名前
     * int hp モブのHP
     *  
     */
    private String name;
    private int hp;
    /**
     * モブの名前を返すメゾット
     * @return String name モブの名前
     */
    String getName(){
        return this.name;
    }
    /**
     * モブのHPを返すメゾット
     * @return　int hp モブのHP
     */
    int getHp(){
        return this.hp;
    }
    /**
     * モブのHPに対してダメージを与えるメゾット
     * @param value　モブに与えられるダメージ
     */
    void damaged(int value){
        this.hp -=value;
    }
    /**
     * モブのHPを回復するメゾット
     * @param value　モブのHPの回復量
     */
    void heelingHp(int value){
        this.hp +=value;
    }
    /**
     * コンストラクタ、モブの名前、モブのHP
     * @param name　モブの名前
     * @param hp　　モブのHP
     */
    Mob(String name,int hp){
        this.name = name;
        this.hp = hp;
    }
    /**
     * サブクラスに任せるメゾット
     * @param target　モブクラスのオブジェクト（現状だとプレイヤークラスのオブジェクトだけ）
     * 
     */
    void act(Mob target){
    };
    /**
     * ステータス(キャラの名前、HP)を出力するメゾット
     */
    void showStatus() {
        System.out.printf("%s:HP %d \n", name, hp);
    }
 

}
