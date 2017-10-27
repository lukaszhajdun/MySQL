package pl.sda.java1.day5;

public enum Operator {
    ADD('+'), SUB('-'), MULT('*'), DIV('/'), MOD('%'), POW('^'), NONE(' ');

    private char sign;

    Operator(char sign) {
        this.sign = sign;
    }

    public void printSign() {
        System.out.println(sign);
    }

    public static Operator fromChar(char c) {
        switch (c) {
            case '+':
                return ADD;
            case '-':
                return SUB;
            case '*':
                return MULT;
            case '/':
                return DIV;
            case '%':
                return MOD;
            case '^':
                return POW;
            default:
                return NONE;
        }
    }
}
