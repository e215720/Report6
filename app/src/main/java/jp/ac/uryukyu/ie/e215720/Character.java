package jp.ac.uryukyu.ie.e215720;
/**
 * キャラクタークラス
 * String name;//キャラの名前
 * int hp;//キャラのHP
 * Mob.javaを継承
 * カードゲームのイメージで作成している
 * int attack;//キャラの攻撃力
 * プレイヤーのHPやキャラクターのHPを減らすのはキャラクターのみ
 */
public class Character extends Mob{
    int attack;
    /**
     * コンストラクタ.キャラの名前、HP、攻撃力
     * @param name キャラ名
     * @param hp　キャラのHP
     * @param attack　キャラの攻撃力
     */
    public Character(String name,int hp,int attack){
        super(name, hp);
        this.attack = attack;
    }
    @Override
    /**
     * Mobクラス（キャラクタークラス、プレイヤークラス）に攻撃するメゾットのつもり
     *攻撃対象になるモブに対してキャラに応じた攻撃力分のダメージを与える
     * @param mob 攻撃対象になるモブ
     */
    public void act(Mob mob){
        System.out.println(mob.getName()+"に"+getName()+"は攻撃した");
        mob.damaged(attack);
        System.out.println(mob.getName()+"に"+attack+"のダメージ");
    }
    @Override
    /**
     * ステータス(キャラの名前、攻撃力、HP)を出力するメゾット
     */
    void showStatus() {
        System.out.printf("%s:HP %d  attack %d\n", getName(),getHp(),attack);
    }


    
}
