public class OldRomanConverter {
    private String[] romanNumber = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    private int[] romanValues = {1,4,5,9,10,40,50,90,100,400,500,900,1000};

    public String convert(int number) {

        String result = "";
        int romanIndex = romanNumber.length-1;

        while (number > 0) {

            while (romanValues[romanIndex] <= number) {
                    result += romanNumber[romanIndex];
                    number -= romanValues[romanIndex];
            }
            romanIndex--;
        }
        return result;

    }
}

