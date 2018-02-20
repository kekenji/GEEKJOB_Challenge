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

//文字列型の変数を宣言して，"きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" をその値としてください。 
//宣言した変数について，「I」を「い」に，「U」を「う」に置換した文字列を表示してください。



public class NewClass9 {
    public static void main(String[] args) {
        String word = "きょUはぴIえIちぴIのくみこみかんすUをしてIます。";
        
        // 文字の置換 
        word = word.replace("U", "う");
        word = word.replace("I", "い");
        System.out.print(word);
    }
}

