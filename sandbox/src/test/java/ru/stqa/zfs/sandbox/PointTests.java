package ru.stqa.zfs.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void TestDistance() {

    Point p = new Point (1,1,1,1);
    Assert.assertEquals(p.distance(), 0.0);
  }
}
