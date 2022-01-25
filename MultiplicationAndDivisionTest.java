import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class MultiplicationAndDivisionTest {
    @Test
    public void test1() {
        assertTrue("3 and 2", String.format("a*b=6 , a/b=1 rem 1").equals(MultiplicationAndDivision.multiplicationAndDivision(3, 2)));
    }

    @Test
    public void test2() {
        assertTrue("2 and 2", String.format("a*b=4 , a/b=1 rem 0").equals(MultiplicationAndDivision.multiplicationAndDivision(2, 2)));
    }

    @Test
    public void test3() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            MultiplicationAndDivision.multiplicationAndDivision(2, 0);
        });
        String expectedMessage = "by zero";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));    }
}