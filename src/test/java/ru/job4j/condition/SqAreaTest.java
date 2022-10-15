package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double in = SqArea.square(p, k);
        double out = 2;
        float eps = 0.01F;
        Assert.assertEquals(in, out, eps);
    }

    @Test
    public void whenP8K3Square3() {
        double p = 8;
        double k = 3;
        double in = SqArea.square(p, k);
        double out = 3;
        float eps = 0.01F;
        Assert.assertEquals(in, out, eps);
    }

    @Test
    public void whenP9K4Square3dot24() {
        double p = 9;
        double k = 4;
        double in = SqArea.square(p, k);
        double out = 3.24;
        float eps = 0.01F;
        Assert.assertEquals(in, out, eps);
    }

}