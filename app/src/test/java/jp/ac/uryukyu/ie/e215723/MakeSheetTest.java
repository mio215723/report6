package jp.ac.uryukyu.ie.e215723;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * MakeSheetクラスのテスト。
 */
public class MakeSheetTest {
    /**
     * MakeSheetのインスタンスを作り、makeListメソッドで配列を作った際、
     * 予想する配列の中身とその配列が同じかテストしている。
     */
    @Test void makeSheetTest(){
        MakeSheet mS = new MakeSheet(3,4,5,5,5,5);

        String[] expectedList = {"☆", "☆", "★", "☆", "☆"};
        String[] actualList = mS.makeList(3,5);

        for(int i = 0; i < expectedList.length; i++){
            assertEquals(expectedList[i], actualList[i]);
        }
    }
}
