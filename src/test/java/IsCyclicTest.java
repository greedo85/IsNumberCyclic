import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class IsCyclicTest {

    @Test
    public void isCyclicTest() {
        //given

        IsNumberCyclic isNumberCyclic = new IsNumberCyclic();

        long number = 142857;
        //then
        assertTrue(isNumberCyclic.isCyclic(number));


    }
}
