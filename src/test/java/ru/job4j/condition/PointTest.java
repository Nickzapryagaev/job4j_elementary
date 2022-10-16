package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        float eps = 0.01F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when82to23then6dot08() {
        int x1 = 8;
        int y1 = 2;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 6.08;
        float eps = 0.01F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when103to23then8() {
        int x1 = 10;
        int y1 = 3;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 8;
        float eps = 0.01F;
        Assert.assertEquals(expected, out, eps);
    }
}