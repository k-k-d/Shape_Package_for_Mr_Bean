package regions;

public abstract class Region
{
    protected static final Point origin = new Point(0, 0);
    
    public abstract boolean contains(Point point);
    public abstract void translate(double dx, double dy);
    public abstract void rotate(double angle);
    public abstract void print();
}