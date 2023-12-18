import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    Calc calc = new Calc();

    @Test
    public void addTest() {
        Assert.assertEquals(10, calc.add(1, 9));
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(8, calc.subtract(9, 1));
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(9, calc.multiply(9, 1));
    }

    @Test
    public void divideTest() {
        Assert.assertEquals(4, calc.divide(8, 2));
    }
}
