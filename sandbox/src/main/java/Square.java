/* public class Square {
    public double l;
    public double s;

    public Square(double len){
        l = len;
    }
    public static double area (Square s){
           return s.l * s.l;
        }

    public static void main(String[] args){

        Square s = new Square(5);
        System.out.println(area(s));
    }
}

 */

public class Square {       //Класс, который описывает структуру объектов, хранящих информацию о квадратах
    public double l;          // Атрибут (длина стороны квадрата), которым обладает объект этого типа (квадрат)
    public Square(double l){  // Конструктор
        this.l = l;             // Переменная, которая ссылается на конструируемый объект (первая l - атрибут, вторая l - переменная, которая объявлена как аргумент функции)
    }
    public double area(){
        return this.l*this.l;
    }

}



