package basic_problems;
class cyl {
  private int radius;
  private int height;

  public int getradius() {
    return radius;
  }

  public void setradius(int radius) {
    this.radius = radius;
  }

  public int getheight() {
    return height;
  }

  public void setheight(int height) {
    this.height = height;
  }

  public double area() {
    return 2 * 3.142 * radius * height + 2 * 3.142 * radius * radius;
  }

  public double volume() {
    return 3.142 * radius * radius * height;
  }
}

public class cylinder {
  public static void main(String[] args) {

    cyl obj = new cyl();

    obj.setradius(4);
    System.out.println("radius is: " + obj.getradius());

    obj.setheight(6);
    System.out.println("height is: " + obj.getheight());

    System.out.println("area is: " + obj.area());

    System.out.println("volume is: " + obj.volume());
  }
}
