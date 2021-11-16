package eulerProblems;

public class Problem02 {
    public static void main (String[] args){
        long a,b,c,d;
        a = 1L;
        b = 1L;
        c = 0L;
       // d = 200;
       d = 4000000L;
        long sum = 0L;
        System.out.print(a + " " + b + " ");

        while (a+b<d) {

            c = a + b;
            if (c%2 == 0) {
                sum = sum + a + b;
            }
         //   System.out.print(c + " " );
            a = b;
            b = c;

        }
        System.out.println("сумма = "+ sum);
    }
}

/*
Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
 */