import java.text.NumberFormat;

public class MortgageReport {

    private MorgageCalculator calculator;

    public MortgageReport(MorgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printListPardakht() {
        System.out.println();
        System.out.println("list pardakht ha");
        System.out.println("------------");


        for (int month = 1; month < calculator.getSal() * Main.MOUNTH_IN_YEAR; month++) {
            double balance = calculator.calculateBlance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printavalie() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("mahane bayad " + mortgageFormatted + " bedi");
        System.out.println("-----------");
    }

}
