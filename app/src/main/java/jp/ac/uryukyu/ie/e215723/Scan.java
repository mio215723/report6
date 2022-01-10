package jp.ac.uryukyu.ie.e215723;

import java.util.Scanner;

public class Scan {
    private Scanner sc = new Scanner(System.in);

    /**
     * ユーザーから標準入力を受け、それを返すメソッド。
     * @param num 選択肢の数。
     * @return int型。選択肢の範囲の中から選ぶ。
     */
    public int input(int num){
        int intAnswer = 0;

        for(int i = 0; i == 0;){
            System.out.println("答えを入力してください。");
            String answer = this.sc.nextLine();
            intAnswer = confOfAnswer(answer);

            if(intAnswer == 0){
                System.out.println("答えを再入力してください");
            }else if(intAnswer <= num){
                i++;
            }else{
                System.out.println("選択肢の中から選択してください。");
            }
        }
        return intAnswer;
    }

    /**
     * 入力された文字が数字であるか確認してくれるメソッド。
     * @param ans 入力された文字。
     * @return intAnswer 引数をint型に変えたもの。変換できなければ0が返ってくる。
     */
    public int confOfAnswer(String ans){
        try{
            int intAnswer = Integer.parseInt(ans);
            return intAnswer;
        }catch(NumberFormatException e){
            int intAnswer = 0;
            return intAnswer;
        }
    }
}
