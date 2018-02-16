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
public class NewClass {
        public static void main(String[] args) {
        // Humanクラスのインスタンス生成
        Human hito = new Human();

        // 人インスタンスのageフィールドへ年齢設定
        hito.age = 30;

        // 人インスタンスのsetHumanメソッドを利用
        hito.setHuman("伊藤健次", 23);
    }
}
class Human {
    // フィールドの宣言
    public String name = "";
    public int age = 0;

    // メソッドの宣言
    public void setHuman(String n, int a) {
        // 引数をフィールドへ設定
        this.name = n;
        this.age = a;
        System.out.print(name);
        System.out.print(age);
    }
    
}
