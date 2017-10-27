package pl.sda.java1.day06.credits;

public class CreditBankY implements Credit {

    private int minTime = 3;
    private int maxTime = 100;
    private int minValue = 10_000;

    private double rate = 1.04;

    @Override
    public double calculate(int value, int months) {
        if (months < minTime || months > maxTime) {
            return 0;
        }
        if (value < minValue) {
            return 0;
        }


        double years = months / 12;
        double overal1Rate = Math.pow(rate, years);
        double sum = value * overal1Rate;

        return Math.round(sum / months);
    }
}
