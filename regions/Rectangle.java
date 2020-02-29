package regions;

public class Rectangle extends Basic
{
    private Point A, B, C, D;

    public Rectangle(Point A, Point B,Point C, Point D)
    {
        this.r = this;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        if((Math.abs(A.distanceSquared(B) - C.distanceSquared(D)) < 0.01)  && (Math.abs(B.distanceSquared(C) - D.distanceSquared(A)) < 0.01) && (Math.abs(A.distanceSquared(C) - B.distanceSquared(D)) < 0.01))
        {
            System.err.println("The given points do not form a rectangle. Expect random behaviour");
        }
    }

    public boolean contains(Point point)
    {
        if(point.sameSideOfLine(A, B, C) && point.sameSideOfLine(C, A, B) && point.sameSideOfLine(A, C, D) && point.sameSideOfLine(C, D, A))
            return true;
        else
            return false;
    }
    public void translate(double dx, double dy)
    {
        this.A.translate(dx, dy);
        this.B.translate(dx, dy);
        this.C.translate(dx, dy);
        this.D.translate(dx, dy);
    }
    public void rotate(double angle)
    {
        this.A.rotate(angle);
        this.B.rotate(angle);
        this.C.rotate(angle);
        this.D.rotate(angle);
    }
    public void print()
    {
        System.out.println("Rectangle Corners\t:\tA = " + this.A.toString() + ", B = " + this.B.toString() + ", C = " + this.C.toString() + ", D = " + this.D.toString());
    }
}