package org.example.JavaHW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void turnUpTheVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(50);

        cond.increaseVolume();

        int expected = 6;
        int actual = cond.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

}
