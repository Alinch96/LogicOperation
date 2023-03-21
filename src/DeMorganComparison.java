public class DeMorganComparison {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        // Умови застосування теореми Де Моргана.
        if (a || b)
            System.out.println("A || B = " + (!a || !b));
        else
            System.out.println("A || B = " + (!a || !b));

        // Умови після застосування теореми Де Моргана.
        if (!(!a && !b))
            System.out.println("!(!A && !B) = " + !(!a && !b));
        else
            System.out.println("!(!A && !B) = " + !(!a && !b));
    }
}
