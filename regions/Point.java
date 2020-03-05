package regions;

public class Point
{
    private double x, y;

    public Point(double x, double y)    //takes abcissa and ordinate
    {
        this.x = x;
        this.y = y;
    }

    public void translate(double dx, double dy) //translate a point
    {
        this.x += dx;
        this.y += dy;
    }
    public void rotate(double angle)    //rotate a point about origin
    {
        double x = (Math.cos(angle) * (this.x - Region.origin.x)) - (Math.sin(angle) * (this.y - Region.origin.y)) + Region.origin.x;
        double y = (Math.sin(angle) * (this.x - Region.origin.x)) + (Math.cos(angle) * (this.y - Region.origin.y)) + Region.origin.y;
        this.x = x;
        this.y = y;
    }
    public double distanceSquared(Point point)  //square of distance of given point from another point
    {
        return ((point.x - this.x) * (point.x - this.x)) + ((point.y - this.y) * (point.y - this.y));
    }
    public double subInLine(Point p1, Point p2) //substitute a given point in the equation of line joining two other points
    {
        return (((this.x - p1.x) * (p2.y - p1.y)) - ((this.y - p1.y) * (p2.x - p1.x)));
    }
    public boolean sameSideOfLine(Point p,Point p1, Point p2)   //is the given point on the same side of line joining p1 and p2 as p
    {
        double s1 = this.subInLine(p1, p2);
        double s2 = p.subInLine(p1, p2);
        if ((s1 * s2) >= 0.0)
            return true;
        else
            return false;
    }
    public String toString()    //returns point as a string
    {
        return "(" + String.format("%.2f", this.x) + ", " + String.format("%.2f", this.y) + ")";
    }
}