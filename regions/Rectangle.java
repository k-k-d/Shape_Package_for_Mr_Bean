package regions;

public class Rectangle extends Basic
{
    protected Point A, B, C, D;

    public Rectangle(Point A, Point B,Point C, Point D) //takes in vertices in either clockwise or anticlockwise order and validates
    {
        this.r = this;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        if(!((Math.abs(A.distanceSquared(B) - C.distanceSquared(D)) < 0.01)  && (Math.abs(B.distanceSquared(C) - D.distanceSquared(A)) < 0.01) && (Math.abs(A.distanceSquared(C) - B.distanceSquared(D)) < 0.01)))
        {
            System.err.println("The given points do not form a rectangle. Check and run program again");
            System.exit(1);
        }
    }

    public boolean contains(Point point)    //true if for every pair of consecutive vertices, the point and the other vertices lie on the same side of the line joining the pair of vertices, else false
    {
        if(point.sameSideOfLine(A, B, C) && point.sameSideOfLine(C, A, B) && point.sameSideOfLine(A, C, D) && point.sameSideOfLine(C, D, A))
            return true;
        else
            return false;
    }
    public void translate(double dx, double dy) //translate all three points
    {
        this.A.translate(dx, dy);
        this.B.translate(dx, dy);
        this.C.translate(dx, dy);
        this.D.translate(dx, dy);
    }
    public void rotate(double angle)    //rotate all three points
    {
        this.A.rotate(angle);
        this.B.rotate(angle);
        this.C.rotate(angle);
        this.D.rotate(angle);
    }
    public void print()
    {
        System.out.println("Rectangle\t:\tA = " + this.A.toString() + ", B = " + this.B.toString() + ", C = " + this.C.toString() + ", D = " + this.D.toString());
    }
}