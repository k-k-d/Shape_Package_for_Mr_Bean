package regions;

public class Intersection extends Region
{
    private Region r1, r2;

    public Intersection(Region r1, Region r2)
    {
        this.r1 = r1;
        this.r2 = r2;
    }

    public boolean contains(Point point)
    {
        return r1.contains(point) && r2.contains(point);
    }
    public void translate(double dx, double dy)
    {
        r1.translate(dx, dy);
        r2.translate(dx, dy);
    }
    public void rotate(double angle)
    {
        r1.rotate(angle);
        r2.rotate(angle);
    }
    public void print()
    {
        System.out.println("Intersection of the following\t:");
        System.out.print("1. ");
        r1.print();
        System.out.print("2. ");
        r2.print();
    }
}