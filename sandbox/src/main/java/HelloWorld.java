import test.move.Rectangle;
import test.move.Square;

public class HelloWorld {
    public static void main(String[] args) {
        hello("world");
        hello("user");


        Square s = new Square(5);


        Rectangle r = new Rectangle(8,12);

        System.out.println("квадрат " + area(s));
        System.out.println("прямоугольник " + area(r));

        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(1.0 / 2);

        System.out.println(Math.sqrt(4));


            Point p1 = new Point(3,4);
            Point p2 = new Point(-3,-4);

            System.out.println("Расстояние между точками = " + distance( p1,p2));


    }
    public static void hello(String somebody) {
            System.out.println("Hello, " + somebody);
        }

    public static double area (Square s){
        return s.l * s.l;
    }

    public static double area (Rectangle r){
        return r.a * r.b;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
    }





}