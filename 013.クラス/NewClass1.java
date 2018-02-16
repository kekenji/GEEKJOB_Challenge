/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;

/**
 *
 * @author geust1Day
 */
public class NewClass1 {
    
public static void main(String[] args) {
    // 継承を利用して作成したkenjiクラスのインスタンスを生成
    kenji ito = new kenji();
    // 親クラスに実装されていた、setHumanが利用可能
    ito.setHuman("伊藤健次",23);
    // 親クラスに実装されていた、フィールドも利用可能
    ito.age = 30;
    // Teacherクラス独自のメソッド、kougiももちろん利用可能
    ito.kougi();
}
}
    // フィールドの宣言
 class kenji extends Human {
    public void kougi() {
        String msg = "生徒の" + this.name + "です。講義を受講します。";
        System.out.print(msg);
    }
}
