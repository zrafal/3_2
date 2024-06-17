import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wysokość schodów: ");
        int height = scanner.nextInt();

        // Pętla zewnętrzna iteruje po wysokości schodów
        for (int i = 1; i <= height; i++) {
            // Pętla wewnętrzna wypisuje znaki dla każdego stopnia schodów
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Przejście do nowego wiersza po zakończeniu każdego stopnia
        }

        scanner.close();
    }
}
