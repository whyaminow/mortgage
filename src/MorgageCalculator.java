public class MorgageCalculator {

    private double sud;
    private int cheqad;
    private int sal;

    public MorgageCalculator(int cheqad, double sud, int sal) {
        this.sud = sud;
        this.cheqad = cheqad;
        this.sal = sal;
    }
    private double sudMahane = sud / Main.PERCENT / Main.MOUNTH_IN_YEAR;
    private int tedadeQest = sal * Main.MOUNTH_IN_YEAR;
    public double calculateMortgage() {
        double mortgage = cheqad * (sudMahane * Math.pow(1 + sudMahane, tedadeQest)) /
                (Math.pow(1 + sudMahane, tedadeQest) - 1);
        return mortgage;
    }

    public double calculateBlance(int numberOfPaymentsMaid) {

        double balance = cheqad * (Math.pow(1 + sudMahane, tedadeQest) - Math.pow(1 + sudMahane, numberOfPaymentsMaid))
                / (Math.pow(1 + sudMahane, tedadeQest) - 1);
        return balance;
    }

    public int getSal() {
        return sal;
    }
}
