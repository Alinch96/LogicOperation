import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть заробітну плату працівника(грн): ");

        double zarplata = scanner.nextDouble();

        System.out.println();
        System.out.print("Введіть вислугу років працівника: ");

        int vysluga = scanner.nextInt();

        System.out.println();

        if (5 > vysluga)
            System.out.printf("Премія становить %.2f (грн)", 0.1 * zarplata);
        else if (5 >= vysluga && vysluga < 10)
            System.out.printf("Премія становить %.2f (грн)", 0.15 * zarplata);
        else if (10 >= vysluga && vysluga < 15)
            System.out.printf("Премія становить %.2f (грн)", 0.25 * zarplata);
        else if (15 >= vysluga && vysluga < 20)
            System.out.printf("Премія становить %.2f (грн)", 0.35 * zarplata);
        else if (20 >= vysluga && vysluga < 25)
            System.out.printf("Премія становить %.2f (грн)", 0.45 * zarplata);
        else
            System.out.printf("Премія становить %.2f (грн)", 0.5 * zarplata);

    }
}
