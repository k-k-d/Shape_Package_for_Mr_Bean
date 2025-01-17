package regions;

public class Union extends Region
{
    private Region r1, r2;

    public Union(Region r1, Region r2)
    {
        this.r1 = r1;
        this.r2 = r2;
    }

    public boolean contains(Point point)
    {
        return r1.contains(point) || r2.contains(point);
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
        System.out.println("Union of the following \t:\n");
        System.out.print("\t");
        r1.print();
        System.out.print("\t");
        r2.print();
    }
}