package ru.stqa.zfs.sandbox;

public class Point {
  double x11;
  double y11;
  double x12;
  double y12;

  public Point(double x11,double y11,double x12,double y12){
    this.x11=x11;
    this.y11=y11;
    this.x12=x12;
    this.y12=y12;

  }

  public  double distance() {
    return Math.sqrt((this.x12 - this.x11) * (this.x12- this.x11) + (this.y12 - this.y11) * (this.y12 - this.y11));
  }
}
