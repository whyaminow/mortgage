// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    final static int MOUNTH_IN_YEAR = 12;
    final static int PERCENT = 100;
    public static void main(String[] args) {


        int cheqad = (int) Consule.readNumber("cheqad mikhay?", 1000, 1000000);
        double sud = Consule.readNumber("ba che sudi?", 1, 30);
        int sal = (int) Consule.readNumber("chand sale?", 1.0, 30.0);
        var calculator = new MorgageCalculator(cheqad, sud, sal);
        var report = new MortgageReport(calculator);
        report.printavalie();
        report.printListPardakht();
    }

}