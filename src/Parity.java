import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.print("Введіть будь-яке ціле число, окрім 0 : ");
         int chislo = scanner.nextInt();
         System.out.println("");
//
//       1 спосіб - банальний
            if (chislo % 2 == 0)
                System.out.println("Число парне");
            else
                System.out.println("Число непарне");

//      2 спосіб
//  результатом chislo&1 буде 1 лише у випадку, коли в нульовому розряді числа є 1,
//   а отже-воно непарне

            if ((chislo & 1) != 1)
                System.out.println("Число парне");
            else
                System.out.println("Число непарне");

//      3 спосіб
//  частка від ділення має = 2 без залишку

            if ((float) chislo / (chislo >> 1) == 2.0)   //частка від ділення має = 2 без залишку
                System.out.println("Число парне");
            else
                System.out.println("Число непарне");


    }
}


