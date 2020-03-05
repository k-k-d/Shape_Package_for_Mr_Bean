package regions;

public class Intersection extends Region
{
    private Region r1, r2;

    public Intersection(Region r1, Region r2)   //intersection of r1 and r2
    {
        this.r1 = r1;
        this.r2 = r2;
    }

    public boolean contains(Point point)    //both r1 and r2 should contain the point
    {
        return r1.contains(point) && r2.contains(point);
    }
    public void translate(double dx, double dy) //translate both regions
    {
        r1.translate(dx, dy);
        r2.translate(dx, dy);
    }
    public void rotate(double angle)    //rotate r1 and r2
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