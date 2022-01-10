package jp.ac.uryukyu.ie.e215723;

/**
 * 肌の状態についてプリントする。
 * 全ての質問のうち、当てはまったものがどれぐらいかにより結果は変わる。
 * プリントされた星の数は全ての質問の数で、黒星は左から数えて当てはまった数。
 * 例:全ての質問の数 ５、当てはまる質問　３の場合 ☆ ☆ ★ ☆ ☆ のような表示となる。
 */
public class MakeSheet{
    /**
     * 以下の６つを引数としている。
     * これらの変数を使用し、肌の状態を可視化（星で表現）させ、プリントする。
     * @param dryness ユーザーが当てはまった乾燥に関する質問の数。
     * @param oiliness ユーザーが当てはまった脂性に関する質問の数。
     * @param sensitive ユーザーが当てはまった敏感さに関する質問の数。
     * @param sumDryness 全ての乾燥に関する質問の数
     * @param sumOiliness 全ての脂性に関する質問の数。
     * @param sumSensitive 全ての敏感さに関する質問の数。
     */
    MakeSheet(int dryness, int oiliness, int sensitive, int sumDryness, int sumOiliness, int sumSensitive){
        System.out.println("黒星があなたの度合いです。\n右であるほどよく当てはまります。\n");
        System.out.println("脂性度");
        printList(makeList(oiliness, sumOiliness));
        System.out.println("乾燥度");
        printList(makeList(dryness, sumDryness));
        System.out.println("敏感度");
        printList(makeList(sensitive, sumSensitive));
    }

    /**
     * ２つの引数を使い、肌の状態を可視化（星で表現）するメソッド。
     * 白い星は全ての質問の数。
     * 左から数えてユーザーが当てはまった当てはまった質問の数の場所に黒い星を置いている。
     * @param number ユーザーが当てはまった何かに関する質問の数。
     * @param sumNumber 全ての何かに関する質問の数。
     * @return 肌の状態を可視化させた（星で表した）配列。
     */
    public String[] makeList(int number, int sumNumber){
        String[] numberList = new String[sumNumber];
        for(int i = 0; i < sumNumber; i++){
            if(i + 1 == number){
                numberList[i] = "★";
            }else{
                numberList[i] = "☆";
            }
        }
        return numberList;
    }

    /**
     * 可視化(星で表現）された肌の状態をプリントするメソッド。
     * @param list 肌の状態を可視化させた（星で表した）配列。
     */
    public void printList(String[] list){
        System.out.print("low|");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]);
            if(i < list.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println("|high");
    }
}