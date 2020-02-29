package regions;

public class Complement extends Region
{
    private Region r;

    public Complement(Region r)
    {
        this.r = r;
    }

    public boolean contains(Point point)
    {
        return !(r.contains(point));
    }
    public void translate(double dx, double dy)
    {
        r.translate(dx, dy);
    }
    public void rotate(double angle)
    {
        r.rotate(angle);
    }
    public void print()
    {
        System.out.println("Complement of the following\t:\n\t");
        r.print();
    }
}