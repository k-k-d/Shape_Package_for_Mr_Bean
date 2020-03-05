package regions;

public class Complement extends Region
{
    private Region r;

    public Complement(Region r) //all regions other than given r
    {
        this.r = r;
    }

    public boolean contains(Point point)    //r should not contain the point
    {
        return !(r.contains(point));
    }
    public void translate(double dx, double dy) //translate r
    {
        r.translate(dx, dy);
    }
    public void rotate(double angle)    //rotate r
    {
        r.rotate(angle);
    }
    public void print()
    {
        System.out.println("Complement of the following\t:");
        System.out.print(" ");
        r.print();
    }
}