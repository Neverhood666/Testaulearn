package test.move;

public class HelloWorld {
    public static void main(String[] args) {
        hello("world");
        hello("user");

        double len = 5;

        System.out.println(area(len));

        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(1.0 / 2);
    }
    public static void hello(String somebody) {
            System.out.println("Hello, " + somebody);
        }

    public static double area (double l){
        return l*l;
    }


}