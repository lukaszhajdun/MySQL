package pl.sda.java1.day5;

public class Calculator {
    public static final char ADD = '+';

    //char o - operator +, -, *, /, %, ^
    public double eval(double a, Operator o, double b) {
        double result;

        switch (o) {
            case ADD:
                result = a + b;
                break;
            case SUB:
                result = a - b;
                break;
            case MULT:
                result = a * b;
                break;
            case DIV:
                if (b != 0) {
                    result = a / b;
                } else {
                    result = 0.0;
                }
                break;
            case MOD:
                if (b != 0) {
                    result = a % b;
                } else {
                    result = 0.0;
                }
                break;
            case POW:
                result = Math.pow(a, b);
                break;
            default:
                result = 0.0;
        }

        return result;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.eval(5.7, Operator.fromChar('+'), 7));
        System.out.println(calc.eval(10, Operator.fromChar('/'), 0));
        System.out.println(calc.eval(10, Operator.fromChar('%'), 3));
        System.out.println(calc.eval(10, Operator.fromChar('*'), 3));
        System.out.println(calc.eval(2, Operator.fromChar('^'), 10));
        System.out.println(calc.eval(2, Operator.fromChar('-'), 10));


        System.out.println(Operator.valueOf("ADD"));
        for (Operator x : Operator.values()) {
            System.out.println(x);
        }
    }
}
