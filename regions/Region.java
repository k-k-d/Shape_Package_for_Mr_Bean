package regions;

public abstract class Region    //abstract class broadly defining any region
{
    protected static final Point origin = new Point(0.0, 0.0);  //origin is statically and finally set to (0, 0)

    public abstract boolean contains(Point point);  //is point inside or outside the region
    public abstract void translate(double dx, double dy);   //translate the region
    public abstract void rotate(double angle);  //rotate the region about origin
    public abstract void print();   //print functionality for every region
}