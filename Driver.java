import regions.*;

public class Driver
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(10.0, 5.0), new Point(0.0, 5.0));
        Rectangle r2 = new Rectangle(new Point(0.0, 0.0), new Point(5.0, 0.0), new Point(5.0, 10.0), new Point(0.0, 10.0));
        Circle c = new Circle(new Point(0.0, 0.0), 5.0);
        System.out.println(c.contains(new Point(0.0, 6.0)));
    }
}