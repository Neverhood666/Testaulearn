package headFirstJava;

public class Bottles {
    public static void main(String[] args) {
      int beerNum =99;
      String wordBottle = "бутылок";

      while (beerNum > 0) {

          System.out.println(beerNum + " " + wordBottle + " пива на стене");
          System.out.println(beerNum + " " + wordBottle + " пива.");
          System.out.println("Возьми одну.");
          System.out.println("Пусти по кругу");
          beerNum = beerNum - 1;

          if (beerNum>0) {

              if (((beerNum % 10) >= 5) || ((beerNum % 10) == 0) || (beerNum > 10 && beerNum < 20)) {
                  wordBottle = "бутылок";
              } else if ((beerNum % 10) > 1 && (beerNum % 10) < 5) {
                  wordBottle = "бутылки";
              } else {
                  wordBottle = "бутылка";
              }

              System.out.println(beerNum + " " + wordBottle + " пива на стене. \n");
          } else {
              System.out.println("Нет бутылок пива на стене");
          } //else

      } // while

    } //main
} //class
