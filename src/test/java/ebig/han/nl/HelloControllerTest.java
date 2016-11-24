package ebig.han.nl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloControllerTest {

    @Test
    public void testIndexReturnsHello() throws Exception {
        // variables
        HelloController sut = new HelloController();
        // Mock behavior

        // Execute
        String result = sut.index();

        // Verify
        assertThat(result, is("A message"));

    }

}