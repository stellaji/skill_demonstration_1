import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void multiply() {
        assertEquals(5, skillDemo.multiply(1, 2)); //This test shoudl fail
    }
}
