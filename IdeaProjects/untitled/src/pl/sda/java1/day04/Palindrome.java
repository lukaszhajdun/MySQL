package pl.sda.java1.day04;

public class Palindrome {
    private String text;
    private String textPrepared;

    public Palindrome(String text) {
        this.text = text;
        prepareString();
    }

    private void prepareString() {
        //tmp -> użyj StringBuilder sb.append(), sb.toString()
        String tmp = "";
        int len = text.length();

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                tmp += text.charAt(i);
            }
        }

        this.textPrepared = tmp.toLowerCase();
    }

    public boolean check() {
        int len = textPrepared.length();
        int len2 = len / 2;


        for (int i = 0; i < len2; i++) {
            if (textPrepared.charAt(i) != textPrepared.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean checkFaster() {
        String trimmed = text.replaceAll(" ", "").toLowerCase();
        String reversed = new StringBuilder(trimmed).reverse().toString();
        return trimmed.equals(reversed);

    }


    @Override
    public String toString() {
        return text;
    }

    public static void main(String[] args) {
        Palindrome p1 = new Palindrome("Kajak");
        Palindrome p2 = new Palindrome("kajak");
        Palindrome p3 = new Palindrome("kobyla ma maly bok");
        Palindrome p4 = new Palindrome("kobylamamalybok");
        Palindrome p5 = new Palindrome("");
        Palindrome p6 = new Palindrome(" safsas");

        System.out.println(p1 + " : " + p1.check());
        System.out.println(p2 + " : " + p2.check());
        System.out.println(p3 + " : " + p3.check());
        System.out.println(p4 + " : " + p4.check());
        System.out.println(p5 + " : " + p5.check());
        System.out.println(p6 + " : " + p6.check());

        System.out.println(p1 + " : " + p1.checkFaster());
        System.out.println(p2 + " : " + p2.checkFaster());
        System.out.println(p3 + " : " + p3.checkFaster());
        System.out.println(p4 + " : " + p4.checkFaster());
        System.out.println(p5 + " : " + p5.checkFaster());
        System.out.println(p6 + " : " + p6.checkFaster());
    }
}