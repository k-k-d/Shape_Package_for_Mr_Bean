package regions;

public class Circle extends Basic
{
    private Point centre;
    private double radius;

    public Circle(Point centre, double radius)  //takes centre and radius
    {
        this.r = this;
        this.centre = centre;
        this.radius = radius;
    }

    public boolean contains(Point point)    //true if distance between point and centre is less than radius
    {
        double distance = this.centre.distanceSquared(point);
        if(distance <= this.radius * this.radius)
            return true;
        else
            return false;
    }
    public void translate(double dx, double dy) //just translate the centre
    {
        this.centre.translate(dx, dy);
    }
    public void rotate(double angle)    //rotate the centre about origin
    {
        this.centre.rotate(angle);
    }
    public void print()
    {
        System.out.println("Circle\t:\tR = " + this.radius + ", Centre = " + this.centre.toString());
    }
}