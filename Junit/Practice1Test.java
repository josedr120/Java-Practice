package Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Practice1Test {

    @Test
    void sum() {
        Practice1 obj = new Practice1();
        Assertions.assertEquals(24, obj.Sum(12, 12), "12 + 12 = 24");
    }
}