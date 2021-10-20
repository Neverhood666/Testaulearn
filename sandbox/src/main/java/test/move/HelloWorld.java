package test.move;

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


}