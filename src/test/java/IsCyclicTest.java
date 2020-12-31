import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class IsCyclicTest {

    @Test
    public void isCyclicTest() {
        //given

        IsNumberCyclic isNumberCyclic = new IsNumberCyclic();

        long number1 = 142857;
        long number2 = 142856;
        //then
        assertTrue(isNumberCyclic.isCyclic(number1));
        assertFalse(isNumberCyclic.isCyclic(number2));

    }
}
