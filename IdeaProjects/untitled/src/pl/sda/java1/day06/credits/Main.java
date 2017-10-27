package pl.sda.java1.day06.credits;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Credit creditBankX = new CreditBankX();
        //System.out.println(creditBankX.calculate(10100, 9));
        //System.out.println(creditBankX.calculate(100000, 20));
        //System.out.println(creditBankX.calculate(5000000, 60));
        //System.out.println(creditBankX.calculate(100, 5));

        Credit creditBankY = new CreditBankY();
        //System.out.println(creditBankY.calculate(12000, 12));
        //System.out.println(creditBankY.calculate(240_000, 48));

        List<Credit> list = new ArrayList<>();
        list.add(creditBankX);
        list.add(creditBankY);

        for (Credit credit : list) {
            System.out.println(credit.getClass().getSimpleName() + ":");
            System.out.println(credit.calculate(10100, 9));
            System.out.println(credit.calculate(100000, 20));
            System.out.println(credit.calculate(5000000, 60));
            System.out.println(credit.calculate(100, 5));
            System.out.println(credit.calculate(12000, 12));
            System.out.println(credit.calculate(240_000, 48));
        }


    }
}
