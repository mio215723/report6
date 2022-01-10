package jp.ac.uryukyu.ie.e215723;
/**
 * 肌質診断の質問をするクラス。
 * 表示される質問に答え、その結果をもとに肌質診断をする。
 * チャート式。
 */
public class SkinDiagnose {
    private Scan sc = new Scan();

    SkinDiagnose(){
        q1();
    }

    public void q1(){
        System.out.println("Q.洗顔後に肌がつっぱる。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q5();
        }else{
            this.q2();
        }
    }

    public void q2(){
        System.out.println("Q.Tゾーン（おでこや鼻）がテカリやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q6();
        }else{
            this.q3();
        }
    }

    public void q3(){
        System.out.println("Q.乾燥気味だと思う。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q7();
        }else{
            this.q4();
        }
    }

    public void q4(){
        System.out.println("Q.冬はカサカサする。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q8();
        }else{
            this.q7();
        }
    }
    
    public void q5(){
        System.out.println("Q.ファンデーションのノリが悪い。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q6();
        }else{
            this.q9();
        }
    }

    public void q6(){
        System.out.println("Q.目の周り、口の周りが乾燥しやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q10();
        }else{
            this.q7();
        }
    }

    public void q7(){
        System.out.println("Q.夕方に化粧崩れを感じる。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q11();
        }else{
            this.q8();
        }
    }

    public void q8(){
        System.out.println("Q.季節の変わり目にトラブルが起こりやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q11();
        }else{
            this.q12();
        }
    }

    public void q9(){
        System.out.println("Q.化粧品かぶれしたことがある。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q10();
        }else{
            this.q13();
        }
    }

    public void q10(){
        System.out.println("Q.肌が痒いことがある。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q14();
        }else{
            this.q11();
        }
    }
    
    public void q11(){
        System.out.println("Q.ニキビや吹き出物ができやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q15();
        }else{
            this.q16();
        }
    }
    //ここから下は結果につながる。
    public void q12(){
        System.out.println("Q.化粧水が染みることがある。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            this.q16();
        }else{
            this.q11();
        }
    }

    public void q13(){
        System.out.println("Q.肌に艶がない。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            System.out.println("Bタイプ");
            this.typeB();
        }else{
            //Aタイプ
            this.typeA();
        }
    }

    public void q14(){
        System.out.println("Q.日中に肌が乾燥する。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            //Bタイプ
            this.typeB();
        }else{
            this.q13();
        }
    }

    public void q15(){
        System.out.println("Q.肌にベタつきを感じる。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            //Cタイプ
            this.typeC();
        }else{
            this.q14();
        }
    }

    public void q16(){
        System.out.println("Q.ストレスや体調で肌が荒れやすい。\n1:はい\n2:いいえ");
        int ans = sc.input(2);
        if(ans == 1){
            //Dタイプ
            this.typeD();
        }else{
            this.q15();
        }
    }

    public void typeA(){
        System.out.println("結果：普通肌\n肌の水分と油分のバランスが保たれているいい状態で肌トラブルも少なく、バリア機能も正常に働いています。\nただし、冬は誰でも乾燥よりになります。\nケアを怠るとすぐに乾燥肌へ向かいます。\n過信せずにケアを続けましょう。");
    }

    public void typeB(){
        System.out.println("結果：乾燥肌\n肌の水分・油分共に不足しがちで外部の刺激から肌を守るバリア機能が低下しやすい肌です。\n水分が蒸発しやすく注意が必要です。\n保湿に特化したケアをして敏感肌へ移行しないように防ぎましょう。\n洗顔ではよく泡だてお湯の温度（体温くらい）に気をつけましょう。");
    }

    public void typeC(){
        System.out.println("結果：脂性肌\n食事や夜更かしなどの不規則な生活習慣、また、ストレスや年齢などによるホルモンバランスの乱れが要因になりますが、Tゾーンなど、洗い過ぎにより、水分が少なくて、オイリーになる場合もあります。\n水分の蒸発を防ぐために皮脂が余計に分泌されるからです。\n洗顔に特に注意して、オイリー部分のゴシゴシ洗いに注意が必要です。");
    }

    public void typeD(){
        System.out.println("結果：敏感肌\n刺激に対して敏感に反応してしまいます。\n乾燥肌から移行する場合が多く、アレルギーの炎症が含まれます。\n体調やホルモンバランスの乱れも影響します。\nバリア機能を高めるために、キメを育てるよう心がけ、洗顔の時に特に注意が必要です。\nお湯の温度は体温よりやや低め、指はゆっくり動かしましょう。\n保湿ケアを重視しましょう。");
    }
}