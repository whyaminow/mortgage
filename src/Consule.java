import java.util.Scanner;

public class Consule {

    private static Scanner scanner = new Scanner(System.in);
    public static double readNumber(String soal, double min, double max) {
        double valeu;

        while (true) {
            System.out.print(soal);
            valeu = scanner.nextInt();
            if (valeu >= min && valeu <= max)
                break;
            System.out.println("mablagh bayad beyne " + min + " ta " + max + " bashad");
        }
        return valeu;
    }
    public static double readNumber(String soal) {
        return scanner.nextDouble();
    }
}
