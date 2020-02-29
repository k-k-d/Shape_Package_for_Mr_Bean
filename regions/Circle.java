package regions;

public class Circle extends Basic
{
    private Point centre;
    private double radius;

    public Circle(Point centre, double radius)
    {
        this.r = this;
        this.centre = centre;
        this.radius = radius;
    }

    public boolean contains(Point point)
    {
        double distance = this.centre.distanceSquared(point);
        if(distance <= this.radius * this.radius)
            return true;
        else
            return false;
    }
    public void translate(double dx, double dy)
    {
        this.centre.translate(dx, dy);
    }
    public void rotate(double angle)
    {
        this.centre.rotate(angle);
    }
    public void print()
    {
        System.out.println("Circle\t:\tR = " + this.radius + ", Centre = " + this.centre.toString());
    }
}