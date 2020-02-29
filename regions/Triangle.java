package regions;

public class Triangle extends Basic
{
    private Point A, B, C;

    public Triangle(Point A, Point B,Point C)
    {
        this.r = this;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public boolean contains(Point point)
    {
        if(point.sameSideOfLine(A, B, C) && point.sameSideOfLine(B, C, A) && point.sameSideOfLine(C, A, B))
            return true;
        else
            return false;
    }
    public void translate(double dx, double dy)
    {
        this.A.translate(dx, dy);
        this.B.translate(dx, dy);
        this.C.translate(dx, dy);
    }
    public void rotate(double angle)
    {
        this.A.rotate(angle);
        this.B.rotate(angle);
        this.C.rotate(angle);
    }
    public void print()
    {
        System.out.println("Triangle Corners\t:\tA = " + this.A.toString() + ", B = " + this.B.toString() + ", C = " + this.C.toString());
    }
}