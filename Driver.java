import regions.*;

public class Driver
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle(new Point(5.0, 0.0), new Point(-5.0, 0.0), new Point(0.0, 10.0));
        
        System.out.println("1. Triangle");
        t.print();
        System.out.println("Test point : " + (new Point(-1.0, -1.0)).toString());
        printMsg(t.contains(new Point(-1.0, -1.0)));
        System.out.println("Test point : " + (new Point(1.0, 2.0)).toString());
        printMsg(t.contains(new Point(1.0, 2.0)));
        
        System.out.println("Rotation :");
        System.out.println("Test point : " + (new Point(1.0, 1.0)).toString());
        System.out.println("Initial :");
        t.print();
        printMsg(t.contains(new Point(1.0, 1.0)));
        t.rotate(3.142);
        System.out.println("Rotation by pi radians :");
        t.print();
        printMsg(t.contains(new Point(1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-2.0, 2.0)).toString());
        System.out.println("Initial :");
        t.print();
        printMsg(t.contains(new Point(-2.0, 2.0)));
        t.rotate(-1.571);
        System.out.println("Rotation by -(pi/2) radians :");
        t.print();
        printMsg(t.contains(new Point(-2.0, 2.0)));

        System.out.println("Translation :");
        System.out.println("Test point : " + (new Point(-9.0, 0.0)).toString());
        System.out.println("Initial :");
        t.print();
        printMsg(t.contains(new Point(-9.0, 0.0)));
        t.translate(2.0, 0.0);
        System.out.println("Translation by (2.0, 0.0) units :");
        t.print();
        printMsg(t.contains(new Point(-9.0, 0.0)));
        System.out.println("Test point : " + (new Point(1.0, 8.0)).toString());
        System.out.println("Initial :");
        t.print();
        printMsg(t.contains(new Point(1.0, 8.0)));
        t.translate(0.0, 4.0);
        System.out.println("Translation by (0.0, 4.0) units :");
        t.print();
        printMsg(t.contains(new Point(1.0, 8.0)));

        System.out.println();

        Rectangle r = new Rectangle(new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(10.0, 5.0), new Point(0.0, 5.0));
        
        System.out.println("2. Rectangle");
        r.print();
        System.out.println("Test point : " + (new Point(0.0, 6.0)).toString());
        printMsg(r.contains(new Point(0.0, 6.0)));
        System.out.println("Test point : " + (new Point(6.0, 1.0)).toString());
        printMsg(r.contains(new Point(6.0, 1.0)));
        
        System.out.println("Rotation :");
        System.out.println("Test point : " + (new Point(1.0, 1.0)).toString());
        System.out.println("Initial :");
        r.print();
        printMsg(r.contains(new Point(1.0, 1.0)));
        r.rotate(3.142);
        System.out.println("Rotation by pi radians :");
        r.print();
        printMsg(r.contains(new Point(1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-1.0, 6.0)).toString());
        System.out.println("Initial :");
        r.print();
        printMsg(r.contains(new Point(-1.0, 6.0)));
        r.rotate(-1.571);
        System.out.println("Rotation by -(pi/2) radians :");
        r.print();
        printMsg(r.contains(new Point(-1.0, 6.0)));

        System.out.println("Translation :");
        System.out.println("Test point : " + (new Point(-1.0, 1.0)).toString());
        System.out.println("Initial :");
        r.print();
        printMsg(r.contains(new Point(-1.0, 1.0)));
        r.translate(2.0, 2.0);
        System.out.println("Translation by (2.0, 2.0) units :");
        r.print();
        printMsg(r.contains(new Point(-1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-3.0, 13.0)).toString());
        System.out.println("Initial :");
        r.print();
        printMsg(r.contains(new Point(-3.0, 13.0)));
        r.translate(-3.0, 4.0);
        System.out.println("Translation by (-3.0, 4.0) units :");
        r.print();
        printMsg(r.contains(new Point(-3.0, 13.0)));

        System.out.println();

        Square s = new Square(new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(10.0, 10.0), new Point(0.0, 10.0));
        
        System.out.println("3. Square");
        s.print();
        System.out.println("Test point : " + (new Point(6.0, -1.0)).toString());
        printMsg(s.contains(new Point(6.0, -1.0)));
        System.out.println("Test point : " + (new Point(6.0, 6.0)).toString());
        printMsg(s.contains(new Point(6.0, 6.0)));
        
        System.out.println("Rotation :");
        System.out.println("Test point : " + (new Point(1.0, 1.0)).toString());
        System.out.println("Initial :");
        s.print();
        printMsg(s.contains(new Point(1.0, 1.0)));
        s.rotate(3.142);
        System.out.println("Rotation by pi radians :");
        s.print();
        printMsg(s.contains(new Point(1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-1.0, 6.0)).toString());
        System.out.println("Initial :");
        s.print();
        printMsg(s.contains(new Point(-1.0, 6.0)));
        s.rotate(-1.571);
        System.out.println("Rotation by -(pi/2) radians :");
        s.print();
        printMsg(s.contains(new Point(-1.0, 6.0)));

        System.out.println("Translation :");
        System.out.println("Test point : " + (new Point(-1.0, 1.0)).toString());
        System.out.println("Initial :");
        s.print();
        printMsg(s.contains(new Point(-1.0, 1.0)));
        s.translate(2.0, 2.0);
        System.out.println("Translation by (2.0, 2.0) units :");
        s.print();
        printMsg(s.contains(new Point(-1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-3.0, 13.0)).toString());
        System.out.println("Initial :");
        s.print();
        printMsg(s.contains(new Point(-3.0, 13.0)));
        s.translate(-3.0, 4.0);
        System.out.println("Translation by (-3.0, 4.0) units :");
        s.print();
        printMsg(s.contains(new Point(-3.0, 13.0)));

        System.out.println();

        Circle c = new Circle(new Point(2.0, 0.0), 2.0);
        
        System.out.println("4. Circle");
        c.print();
        System.out.println("Test point : " + (new Point(6.0, -1.0)).toString());
        printMsg(c.contains(new Point(6.0, -1.0)));
        System.out.println("Test point : " + (new Point(2.0, 1.0)).toString());
        printMsg(c.contains(new Point(2.0, 1.0)));
        
        System.out.println("Rotation :");
        System.out.println("Test point : " + (new Point(1.0, 1.0)).toString());
        System.out.println("Initial :");
        c.print();
        printMsg(c.contains(new Point(1.0, 1.0)));
        c.rotate(3.142);
        System.out.println("Rotation by pi radians :");
        c.print();
        printMsg(c.contains(new Point(1.0, 1.0)));
        System.out.println("Test point : " + (new Point(1.0, 2.0)).toString());
        System.out.println("Initial :");
        c.print();
        printMsg(c.contains(new Point(1.0, 2.0)));
        c.rotate(-1.571);
        System.out.println("Rotation by -(pi/2) radians :");
        c.print();
        printMsg(c.contains(new Point(1.0, 2.0)));

        System.out.println("Translation :");
        System.out.println("Test point : " + (new Point(-1.0, 1.0)).toString());
        System.out.println("Initial :");
        c.print();
        printMsg(c.contains(new Point(-1.0, 1.0)));
        c.translate(2.0, 2.0);
        System.out.println("Translation by (2.0, 2.0) units :");
        c.print();
        printMsg(c.contains(new Point(-1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-3.0, 8.0)).toString());
        System.out.println("Initial :");
        c.print();
        printMsg(c.contains(new Point(-3.0, 8.0)));
        c.translate(-3.0, 4.0);
        System.out.println("Translation by (-3.0, 4.0) units :");
        c.print();
        printMsg(c.contains(new Point(-3.0, 8.0)));

        System.out.println();

        Complement c_bar = new Complement(new Circle(new Point(2.0, 0.0), 2.0));
        
        System.out.println("5. Complement of a Circle");
        c_bar.print();
        System.out.println("Test point : " + (new Point(6.0, -1.0)).toString());
        printMsg(c_bar.contains(new Point(6.0, -1.0)));
        System.out.println("Test point : " + (new Point(2.0, 1.0)).toString());
        printMsg(c_bar.contains(new Point(2.0, 1.0)));
        
        System.out.println("Rotation :");
        System.out.println("Test point : " + (new Point(1.0, 1.0)).toString());
        System.out.println("Initial :");
        c_bar.print();
        printMsg(c_bar.contains(new Point(1.0, 1.0)));
        c_bar.rotate(3.142);
        System.out.println("Rotation by pi radians :");
        c_bar.print();
        printMsg(c_bar.contains(new Point(1.0, 1.0)));
        System.out.println("Test point : " + (new Point(1.0, 2.0)).toString());
        System.out.println("Initial :");
        c_bar.print();
        printMsg(c_bar.contains(new Point(1.0, 2.0)));
        c_bar.rotate(-1.571);
        System.out.println("Rotation by -(pi/2) radians :");
        c_bar.print();
        printMsg(c_bar.contains(new Point(1.0, 2.0)));

        System.out.println("Translation :");
        System.out.println("Test point : " + (new Point(-1.0, 1.0)).toString());
        System.out.println("Initial :");
        c_bar.print();
        printMsg(c_bar.contains(new Point(-1.0, 1.0)));
        c_bar.translate(2.0, 2.0);
        System.out.println("Translation by (2.0, 2.0) units :");
        c_bar.print();
        printMsg(c_bar.contains(new Point(-1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-3.0, 8.0)).toString());
        System.out.println("Initial :");
        c_bar.print();
        printMsg(c_bar.contains(new Point(-3.0, 8.0)));
        c_bar.translate(-3.0, 4.0);
        System.out.println("Translation by (-3.0, 4.0) units :");
        c_bar.print();
        printMsg(c_bar.contains(new Point(-3.0, 8.0)));

        System.out.println();

        Circle c1 = new Circle(new Point(0.0, 0.0), 5.0);
        Circle c2 = new Circle(new Point(0.0, 0.0), 2.0);
        Intersection annulus = new Intersection(c1, new Complement(c2));
        
        System.out.println("6. Annulus");
        annulus.print();
        System.out.println("Test point : " + (new Point(0.0, 0.0)).toString());
        printMsg(annulus.contains(new Point(0.0, 0.0)));
        System.out.println("Test point : " + (new Point(0.0, 3.0)).toString());
        printMsg(annulus.contains(new Point(0.0, 3.0)));
        
        System.out.println("Rotation : Not applicable for this annulus because it is centeres at origin");

        System.out.println("Translation :");
        System.out.println("Test point : " + (new Point(0.0, 3.0)).toString());
        System.out.println("Initial :");
        annulus.print();
        printMsg(annulus.contains(new Point(0.0, 3.0)));
        annulus.translate(1.0, 3.0);
        System.out.println("Translation by (1.0, 3.0) units :");
        annulus.print();
        printMsg(annulus.contains(new Point(0.0, 3.0)));
        System.out.println("Test point : " + (new Point(0.0, 3.0)).toString());
        System.out.println("Initial :");
        annulus.print();
        printMsg(annulus.contains(new Point(0.0, 3.0)));
        annulus.translate(-1.0, -4.0);
        System.out.println("Translation by (-1.0, -4.0) units :");
        annulus.print();
        printMsg(annulus.contains(new Point(0.0, 3.0)));

        System.out.println();

        Rectangle r1 = new Rectangle(new Point(0.0, 0.0), new Point(0.0, 5.0), new Point(10.0, 5.0), new Point(10.0, 0.0));
        Rectangle r2 = new Rectangle(new Point(0.0, 0.0), new Point(0.0, 10.0), new Point(5.0, 10.0), new Point(5.0, 0.0));
        Union Lshape = new Union(r1, r2);

        System.out.println("7. L-shaped Region");
        Lshape.print();
        System.out.println("Test point : " + (new Point(6.0, 6.0)).toString());
        printMsg(Lshape.contains(new Point(6.0, 6.0)));
        System.out.println("Test point : " + (new Point(2.0, 1.0)).toString());
        printMsg(Lshape.contains(new Point(2.0, 1.0)));
        
        System.out.println("Rotation :");
        System.out.println("Test point : " + (new Point(1.0, 1.0)).toString());
        System.out.println("Initial :");
        Lshape.print();
        printMsg(Lshape.contains(new Point(1.0, 1.0)));
        Lshape.rotate(3.142);
        System.out.println("Rotation by pi radians :");
        Lshape.print();
        printMsg(Lshape.contains(new Point(1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-4.0, 6.0)).toString());
        System.out.println("Initial :");
        Lshape.print();
        printMsg(Lshape.contains(new Point(-4.0, 6.0)));
        Lshape.rotate(-1.571);
        System.out.println("Rotation by -(pi/2) radians :");
        Lshape.print();
        printMsg(Lshape.contains(new Point(-4.0, 6.0)));

        System.out.println("Translation :");
        System.out.println("Test point : " + (new Point(-1.0, 1.0)).toString());
        System.out.println("Initial :");
        Lshape.print();
        printMsg(Lshape.contains(new Point(-1.0, 1.0)));
        Lshape.translate(-2.0, 2.0);
        System.out.println("Translation by (-2.0, 2.0) units :");
        Lshape.print();
        printMsg(Lshape.contains(new Point(-1.0, 1.0)));
        System.out.println("Test point : " + (new Point(-9.0, 12.0)).toString());
        System.out.println("Initial :");
        Lshape.print();
        printMsg(Lshape.contains(new Point(-9.0, 12.0)));
        Lshape.translate(-3.0, 4.0);
        System.out.println("Translation by (-3.0, 4.0) units :");
        Lshape.print();
        printMsg(Lshape.contains(new Point(-9.0, 12.0)));
    }

    private static void printMsg(boolean b)
    {
        if(b)   System.out.println("----------Region contains the point----------");
        else    System.out.println("******Region does not contain the point******");
    }
}