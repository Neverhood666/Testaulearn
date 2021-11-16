package eulerProblems;

public class Problem01 {
    public static void main (String[] args ) {

        int x = 0;
        int y = 0;

        while (x < 1000) {
            if (x%3==0 || x%5 == 0) {
                y = y + x;
            }
            x = x + 1;
        }

        System.out.println(y);

    }
}

/*
Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
Найдите сумму всех чисел меньше 1000, кратных 3 или 5.

Ответ: 233168
 */