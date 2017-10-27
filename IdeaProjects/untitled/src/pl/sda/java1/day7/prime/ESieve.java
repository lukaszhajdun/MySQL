package pl.sda.java1.day7.prime;

public class ESieve extends Prime {

    private boolean[] sieve;

    private int[] Esieve;

    public ESieve(int n) {
        super(n);
        generateSieve();
        generatePrimes();

    }

    private void generatePrimes() {
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    sieve[j] = false;
                }
            }
        }
    }

    private void generateSieve() {
        this.sieve = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }
    }

    @Override
    public void printPrimes() {

    }
}
