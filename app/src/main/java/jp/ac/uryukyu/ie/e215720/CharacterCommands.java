package jp.ac.uryukyu.ie.e215720;
import java.util.ArrayList;
import java.util.Scanner;
public class CharacterCommands {
    /**
     * キャラクターコマンドクラス
     * プレイヤーが選択できるようにするためのコマンド置き場的なもの
     * ArrayList<String> commands　コマンドの名前
     * Scanner scanner　スキャナー
     */
    ArrayList<String> Character_name;
    Scanner scanner;
    /**
     * コンストラクタ、スキャナー、コマンドのリスト
     * @param scanner スキャナー
     * @param Character_name キャラクター名のリスト
     * 
     */
    CharacterCommands(){
        scanner = new Scanner(System.in);
        Character_name = new ArrayList<>();
    }
    /**
     * キャラクターの名前をリストに追加する
     * @param character_name キャラクターの名前
     */

    void addCharaxter(String character_name){
        Character_name.add(character_name);
    }
    /**
     * キャラクター名をリセットする
     */
    void clearCharacter(){
        Character_name.clear();
    }
    /**
     * キャラクターを並べプレイヤーが見る選択画面的なものを出力するメゾット
     * @param prompt　最初のキャラクターを選択する？などの固定文
     * @return　攻撃対象の番号
     */
    int waitPlayersSelect(String prompt){
        var index = 0;
        System.out.println(prompt);
        for(var Character:Character_name){
            System.out.println(index + ":"+ Character);
            index +=1;
        }
        while(true){
            int target_index = scanner.nextInt();
            if(target_index >=0 &&target_index<Character_name.size()){
                return target_index;

            }
        }

    }

    
}
