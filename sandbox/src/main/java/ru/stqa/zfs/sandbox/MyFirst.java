package ru.stqa.zfs.sandbox;

public class MyFirst {
  public static void main (String[] args) {
    Point p1 = new Point(1,1);
    Point p2 = new Point(5,8);
    System.out.println("Расстояние между точками" + " = " + p1.distance(p2));
  }

}
