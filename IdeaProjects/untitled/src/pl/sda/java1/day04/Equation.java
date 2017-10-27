package pl.sda.java1.day04;

public class Equation {
    private double a;
    private double b;
    private double c;

    private double delta;

    //przerobić x1, x2, num numOfSols na tablice:
    // tab == null -> nieskończenie wiele
    // tab == [] -> 0 rozwiązań
    // tab == [x1]... -> 0 rozwiązań

    private double x1;
    private double x2;

    // -1 to nieskończenie wiele
    // 0, 1, 2 rozwiązania
    private int numOfSols;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solves() {
        if (a == 0) {
            solveLinear();
        } else {
            solveQuadratic();
        }
    }

    private void solveLinear() {
        if (b == 0) {
            if (c == 0) {
                numOfSols = -1;
            } else {
                numOfSols = 0;
            }
        } else {
            numOfSols = 1;
            x1 = -c / b;

        }
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public int getNumOfSols() {
        return numOfSols;
    }

    private void solveQuadratic() {
        countDelta();
        countSolutions();

        switch (numOfSols) {
            case 2:
                double sqrtDelta = Math.sqrt(delta);
                x1 = (-b - sqrtDelta) / (2 * a);
                x2 = (-b + sqrtDelta) / (2 * a);
                break;
            case 1:
                x1 = -b / (2 * a);
                break;
            case 0:
            default:
                //do nothing
        }
    }

    private void countDelta() {
        delta = b * b - 4 * a * c;
    }

    private void countSolutions() {
        if (delta > 0) {
            numOfSols = 2;
        } else if (delta == 0) {
            numOfSols = 1;
        } else {
            numOfSols = 0;
        }
    }

    // 3 x^2 - 10 x + 4 = 0 -> x1=1, x2=3
    // Przerobić na String.format()
    // switch (numOfSols)
    @Override
    public String toString() {
        return
                (a + " x^2 + " +
                        b + " x + " +
                        c + " = 0 " +
                        " -> " +
                        "x1=" + x1 + ", " +
                        "x2=" + x2).replaceAll("\\+ -", "- ");
    }

    public static void main(String[] args) {
        Equation eq1 = new Equation(1, -2, 1);
        Equation eq2 = new Equation(1, -1, 0);
        Equation eq3 = new Equation(3, -1, -2);
        Equation eq4 = new Equation(3, 0, 0);
        Equation eq5 = new Equation(0, 0, 0);

        eq1.solves();
        eq2.solves();
        eq3.solves();
        eq4.solves();
        eq5.solves();

        System.out.println(eq1.getNumOfSols());
        System.out.println(eq2.getNumOfSols());
        System.out.println(eq3.getNumOfSols());
        System.out.println(eq4.getNumOfSols());
        System.out.println(eq5.getNumOfSols());

        System.out.println();

        System.out.println(eq1);
        System.out.println(eq2);
        System.out.println(eq3);
        System.out.println(eq4);
        System.out.println(eq5);


    }

}