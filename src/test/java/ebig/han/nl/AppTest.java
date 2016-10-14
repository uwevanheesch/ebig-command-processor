package ebig.han.nl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by uwe on 14/10/16.
 */
public class AppTest {

    private App sut;

    @Before
    public void setUp() throws Exception {
        this.sut = new App();
    }

    @Test
    public void testTheTest() throws Exception {
        // variables

        // Mock behavior

        // Execute
        String result = this.sut.testMe();
        // Verify
        assertEquals("Test", result);
    }
}