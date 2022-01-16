package jp.ac.uryukyu.ie.e215720;
import java.util.ArrayList;
public class Player extends Mob{
    /**
     * プレイヤークラス
     * カードゲームのイメージで作成
     * String name プレイヤーの名前
     * int hp プレイヤーのHP
     * ArrayList<Character> characters プレイヤーの持つキャラクターのリスト(カードのデッキ)
     * 
     */
    private ArrayList<Character> characters = new ArrayList<>();
    /**
     * コンストラクタ、プレイヤーの名前、HP
     * @param name キャラの名前
     * @param hp　　キャラのHP
     */
    public Player(String name, int hp) {
        super(name, hp);
    }
    /**
     * プレイヤーの持つキャラのリストにキャラを追加するメゾット
     * @param character 追加されるキャラクターオブジェクト
     */
    public void addCharacter(Character character) {
        characters.add(character);
    }
    /**
     * プレイヤーの持つキャラのリストを返すメゾット
     * @return　characters　キャラクター名のリスト
     */
    public ArrayList<Character> getCharacters(){
        return characters;
    }
    /**
     * プレイヤーが操作（選択）するメゾット（主に相手プレイヤーへの攻撃）
     * 現状キャラクターはプレイヤーしか攻撃できないがいずれキャラクターにも攻撃できるようにしたい
     * 
     * @param targets キャラクターのリストの中から選択したキャラクター
     */
    public void act(ArrayList<Player>targets){
        var commands = new CharacterCommands();
    
        for(var character:characters){
            commands.addCharaxter(character.getName());
        }
        var command_number = commands.waitPlayersSelect("どのキャラで攻撃する？");
        commands.clearCharacter();
        for(var target: targets) {
            commands.addCharaxter(target.getName());
        }
        var target_number = commands.waitPlayersSelect("ターゲット？");
        
        characters.get(command_number).act(targets.get(target_number));

    }    


    
}
