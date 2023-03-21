import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo;
        int chislo_minus1;

        do {
            System.out.print("\nВведіть ціле число >0: ");

            chislo = scanner.nextInt();

            if (chislo <= 0) {
                System.out.println("\nВід'ємні числа та 0 не можуть бути степенем 2.");
                continue;
            }
            System.out.println("В бінарній системі " + chislo + " становить " + Integer.toBinaryString(chislo));

            chislo_minus1 = chislo - 1;

            System.out.println("\nВ бінарній системі " + chislo + "-1= " + chislo_minus1 + " становить " + Integer.toBinaryString(chislo_minus1));
            System.out.println();
            System.out.println("У випадку, якщо введене вами число Є степенем 2 " +
                    "(його представлення у двійковій системі \nмістить лише 1 одиницю, а решта-0), "
                    + " то його побітова кон'юнкція з числом на 1 меншим буде завжди давати 0");


            System.out.println("\nПорахуємо побітову кон'юнкцію цих двох чисел:");
            System.out.println("\t" + Integer.toBinaryString(chislo) + "\n&" + "\n\t" + Integer.toBinaryString(chislo_minus1));
            System.out.println("\n=\t" + Integer.toBinaryString(chislo & chislo_minus1));

            if ((chislo & chislo_minus1) == 0)
                System.out.println("\nЯк бачимо, побітова кон'юнкція = 0, отже введене вами число Є степенем 2.");
            else
                System.out.println("\nЯк бачимо, побітова кон'юнкція != 0, отже введене вами число НЕ є степенем 2.");

            break;
        } while (true);
    }

}
