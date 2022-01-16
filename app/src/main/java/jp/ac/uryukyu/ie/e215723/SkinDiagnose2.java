package jp.ac.uryukyu.ie.e215723;
/**
 * 肌質診断の質問をするクラス。
 * 質問をし、その答えにより肌の状態を状態を可視化する。
 * 肌の状態は、全ての質問の数（sum）のうち、当てはまったものがどれぐらいかによって変わる。
 */
public class SkinDiagnose2 {

    private Scan sc = new Scan();
    /**
     * ユーザーが肌の乾燥に関する質問ではいと答えた場合に増えていく。
     */
    int dryness = 0;
    /**
     * 肌の乾燥に関する質問の合計。わからないと答えた場合には、減るようにされている。
     */
    int sumDryness = 7;
    /**
     * ユーザーが肌の脂性に関する質問ではいと答えた場合に増えていく。
     */
    int oiliness = 0;
    /**
     * 肌の脂性に関する質問の合計。分からないと答えた場合には、減るようにされている。
     */
    int sumOiliness = 6;
    /**
     * ユーザーが肌の敏感度に関する質問ではいと答えた場合に増えていく。
     */
    int sensitive = 0;
    /**
     * 肌の敏感度に関する質問の合計。分からないと答えた場合には、減るようにされている。
     */
    int sumSensitive = 5;

    public SkinDiagnose2(){
        q1();
    }

    /**
     * 乾燥に関する質問文を表示し、当てはまるならdryness（乾燥度）をふやすメソッド。
     */
    public void q1(){
        System.out.println("\nQ.洗顔後に肌がつっぱる。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            dryness++;
        }
        this.q2();
    }

    /**
     * 脂性に関する質問文を表示し、当てはまるならoiliness（脂性度）をふやすメソッド。
     */
    public void q2(){
        System.out.println("\nQ.Tゾーン（おでこや鼻）がテカリやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            oiliness++;
        }
        this.q3();
    }

    /**
     * 乾燥に関する質問文を表示し、当てはまるならdryness（乾燥度）をふやすメソッド。
     */
    public void q3(){
        System.out.println("\nQ.乾燥気味だと思う。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            dryness++;
        }
        this.q4();
    }

    /**
     * 乾燥に関する質問文を表示し、当てはまるならdryness（乾燥度）をふやすメソッド。
     */
    public void q4(){
        System.out.println("\nQ.冬はカサカサする。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            dryness++;
        }
            this.q5();
    }
    
    /**
     * 脂性に関する質問文を表示し、当てはまるならoiliness（脂性度）をふやすメソッド。
     */
    public void q5(){
        System.out.println("\nQ.朝起きた時、肌が脂っぽい。\n1:はい\n2:いいえ");
        int ans = sc.input(3);
        if(ans == 1){
            oiliness++;
        }
        this.q6();
        
    }

    /**
     * 乾燥に関する質問文を表示し、当てはまるならdryness（乾燥度）をふやすメソッド。
     */
    public void q6(){
        System.out.println("\nQ.目の周り、口の周りが乾燥しやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            dryness++;
        }
        this.q7();
    }

    /**
     * 質問文を表示し、ユーザーの選択によりdryness（乾燥度）やoiliness（脂性度）、sumDryness、sumOilinessの変数を変更するメソッド。
     */
    public void q7(){
        System.out.println("\nQ.夕方に化粧崩れを感じる。\n1:皮脂による崩れを感じる\n2:乾燥による崩れを感じる\n3:いいえ");
        int ans = sc.input(3);
        if(ans == 1){
            oiliness++;
        }else if(ans == 2){
            dryness++;
        }
        this.q8();
    }

    /**
     * 敏感さに関する質問文を表示し、当てはまるならsensitive（敏感度）をふやすメソッド。
     */
    public void q8(){
        System.out.println("\nQ.季節の変わり目にトラブルが起こりやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            sensitive++;
        }
        this.q9();
        
    }

    /**
     * 敏感さに関する質問文を表示し、当てはまるならsensitive（敏感度）やsumSensitiveを変更するメソッド。
     */
    public void q9(){
        System.out.println("\nQ.化粧品かぶれしたことがある。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            sensitive++;
        }
            this.q10();
    }

    /**
     * 敏感さに関する質問文を表示し、当てはまるならsensitive（敏感度）をふやすメソッド。
     */
    public void q10(){
        System.out.println("\nQ.肌が痒いことがある。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            sensitive++;
        }
            this.q11();
    }
    
    /**
     * 質問文を表示し、ユーザーの選択によりdryness（乾燥度）やoiliness（脂性度）の変数を変更するメソッド。
     */
    public void q11(){
        System.out.println("\nQ.ニキビや吹き出物ができやすい。\n1:フェイスラインにできやすい\n2:額や鼻、中心部分にできやすい。\n3:いいえ");
        int ans = sc.input(3);
        if(ans == 1){
            dryness++;
        }else{
            oiliness++;
        }
        this.q12();
    }
    //ここから下は結果につながる。
    /**
     * 敏感さに関する質問文を表示し、当てはまるならsensitive（敏感度）をふやすメソッド。
     */
    public void q12(){
        System.out.println("\nQ.化粧水が染みることがある。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            sensitive++;
        }
        this.q13();
    }

    /**
     * 乾燥に関する質問文を表示し、当てはまるならdryness（乾燥度）をふやすメソッド。
     */
    public void q13(){
        System.out.println("\nQ.肌に艶がない。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            dryness++;
        }
        this.q14();
    }

    /**
     * 脂性に関する質問文を表示し、当てはまるならoiliness（脂性度）をふやすメソッド。
     */
    public void q14(){
        System.out.println("\nQ.毛穴の開きや黒ずみが気になる。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
           oiliness++;
        }
        this.q15();
    }

    /**
     * 脂性に関する質問文を表示し、当てはまるならoiliness（脂性度）をふやすメソッド。
     */
    public void q15(){
        System.out.println("\nQ.肌にベタつきを感じる。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            oiliness++;
        }
        this.q16();
    }

    /**
     * 敏感さに関する質問文を表示し、当てはまるならsensitive（敏感度）をふやすメソッド。
     */
    public void q16(){
        System.out.println("\nQ.ストレスや体調で肌が荒れやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
           sensitive++;
        }
        this.result();
    }

    /**
     * 結果をもとに、肌の状態をプリントするためMakeSheetクラスをインスタンス化させている。
     */
    public void result(){
        MakeSheet makeSheet = new MakeSheet(dryness, oiliness, sensitive, sumDryness, sumOiliness, sumSensitive);
    }

}

