import jp.ac.uryukyu.ie.e215723.*;

public class Main {
    public static void main(String[] args){
        Scan sc = new Scan();
        System.out.println("肌質診断をします。\nどの診断をしますか？\n1:肌質診断１\n2:肌質診断２");
        int ans = sc.input(2);
        if(ans == 1){
            SkinDiagnose sd = new SkinDiagnose();
        }else{
            SkinDiagnose2 sd = new SkinDiagnose2();
        }
    }
}
