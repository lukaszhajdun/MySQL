import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz testObject = new FizzBuzz();

    @Test
    public void shouldReturnEmptyArrayWhenZeroProvided(){

        Assert.assertArrayEquals(new String[0],testObject.fizzBuzz(0));
    }

    public void test (int input, String [] expectedOutput) {
        Assert.assertArrayEquals(expectedOutput, testObject.fizzBuzz(input));
    }

    @Test
    public void shouldReturnArrayWithOnly1When1Provided() {
        Assert.assertArrayEquals(new String[]{"1"},testObject.fizzBuzz(1));
    }

    @Test
    public void shouldReturnArrayWithOnly1And2When2Provided() {
        Assert.assertArrayEquals(new String[]{"1","2"},testObject.fizzBuzz(2));
    }

    @Test
    public void shouldReturnArrayWithOnly1And2AndFizzWhen3Provided() {
        Assert.assertArrayEquals(new String[]{"1","2","Fizz"},testObject.fizzBuzz(3));
    }

    @Test
    public void shouldReturnArrayWithBuzzWhen5Provided() {
        Assert.assertArrayEquals(new String[]{"1","2","Fizz","4","Buzz"},testObject.fizzBuzz(5));
    }

    @Test
    public void shouldReturnArrayWith2FizzOn3rdAnd6thprovided() {
        Assert.assertArrayEquals(new String[]{"1","2","Fizz","4","Buzz","Fizz"},testObject.fizzBuzz(6));
    }


    @Test
    public void shouldReturnArrayWith2BuzzOn5And6provided() {
        Assert.assertArrayEquals(
                new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz"},
                testObject.fizzBuzz(10));
    }

    @Test
    public void shouldReturnFizzBuzzWhenElementIs105() {
        Assert.assertEquals("FizzBuzz", testObject.getStringRepresentation(105));
    }

    @Test //(expected = NegativeArraySizeException.class)
    public void shouldNotAcceptNegativeNumbers(){
        testObject.getStringRepresentation(-5);
    }


}
