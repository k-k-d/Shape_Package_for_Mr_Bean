package regions;

public class Square extends Rectangle
{
    private Point A, B, C, D;

    public Square(Point A, Point B,Point C, Point D)
    {
        super(A, B, C, D);
        this.r = this;
        if((Math.abs(A.distanceSquared(B) - B.distanceSquared(C)) < 0.01)  && (Math.abs(B.distanceSquared(C) - C.distanceSquared(D)) < 0.01) && (Math.abs(C.distanceSquared(D) - D.distanceSquared(A)) < 0.01) && (Math.abs(A.distanceSquared(C) - B.distanceSquared(D)) < 0.01))
        {
            System.err.println("The given points do not form a square. Expect random behaviour");
        }
    }

    public void print()
    {
        System.out.println("Square Corners\t:\tA = " + this.A.toString() + ", B = " + this.B.toString() + ", C = " + this.C.toString() + ", D = " + this.D.toString());
    }
}