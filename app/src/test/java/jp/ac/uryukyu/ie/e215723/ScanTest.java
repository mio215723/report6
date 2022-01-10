package jp.ac.uryukyu.ie.e215723;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ScanクラスのconfOfAnswer()メソッドが正常に機能しているか確認するテスト。
 */
public class ScanTest {

    /**
     * confOfAnswer()メソッドでは引数が文字であれば戻り値が０、引数が数字であればその数字が返ってくる。
     */
    @Test void scanTest(){
        Scan scanTest = new Scan();
        assertEquals(0, scanTest.confOfAnswer("ans"));
        assertEquals(3, scanTest.confOfAnswer("3"));

    }
    
}
