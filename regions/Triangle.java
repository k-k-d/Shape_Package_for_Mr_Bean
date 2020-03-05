package regions;

public class Triangle extends Basic
{
    private Point A, B, C;

    public Triangle(Point A, Point B,Point C)   //takes in three vertices and checks validity
    {
        this.r = this;
        this.A = A;
        this.B = B;
        this.C = C;
        if(Math.abs(C.subInLine(A, B)) < 0.01)
        {
            System.err.println("The given points do not form a rectangle. Check and run program again");
            System.exit(1);
        }
    }

    public boolean contains(Point point)    //true if for every vertex, the point and the vertex lie on the same side of the line joining the other two vertices, else false
    {
        if(point.sameSideOfLine(A, B, C) && point.sameSideOfLine(B, C, A) && point.sameSideOfLine(C, A, B))
            return true;
        else
            return false;
    }
    public void translate(double dx, double dy) //translate all three points
    {
        this.A.translate(dx, dy);
        this.B.translate(dx, dy);
        this.C.translate(dx, dy);
    }
    public void rotate(double angle)    //rotate all three points
    {
        this.A.rotate(angle);
        this.B.rotate(angle);
        this.C.rotate(angle);
    }
    public void print()
    {
        System.out.println("Triangle\t:\tA = " + this.A.toString() + ", B = " + this.B.toString() + ", C = " + this.C.toString());
    }
}