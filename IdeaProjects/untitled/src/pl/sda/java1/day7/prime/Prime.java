package pl.sda.java1.day7.prime;

public abstract class Prime {

    protected int n;

    public Prime(int n) {
        this.n = n;
    }

    public abstract void printPrimes();
}
