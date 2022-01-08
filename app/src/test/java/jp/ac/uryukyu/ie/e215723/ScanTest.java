package jp.ac.uryukyu.ie.e215723;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScanTest {

    /**
     * ScanクラスのconfOfAnswer()メソッドが正常に機能しているか確認するテスト。
     * confOfAnswer()メソッドでは引数が文字であれば戻り値が０、引数が数字であればその数字が返ってくる。
     */
    @Test void scanTest(){
        Scan scanTest = new Scan();
        assertEquals(scanTest.confOfAnswer("ans"), 0);
        assertEquals(scanTest.confOfAnswer("3"), 3);

    }
    
}
