package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0); // функция
    }

    @Test
    public void testPoint () {
        Point p = new Point(4.0, 7.0, 9.0, 6.0);
        Assert.assertEquals(p.distance(), 2.0);
    }
}
