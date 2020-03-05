package regions;

public class Basic extends Region  //subclass to Region and a general template for subclasses like Circle, Rectangle, Triangle etc.
{
    protected Region r; //all subclass objects set this property to their own reference

    public boolean contains(Point point)
    {
        return (r.contains(point));
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
        r.print();
    }
}