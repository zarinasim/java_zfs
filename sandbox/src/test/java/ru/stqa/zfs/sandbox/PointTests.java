package ru.stqa.zfs.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void TestDistance() {

    Point p1 = new Point (1,1);
    Point p2 = new Point(5,1);
    Assert.assertEquals(p1.distance(p2), 4.0);
  }
}
