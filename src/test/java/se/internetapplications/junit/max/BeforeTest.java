package se.internetapplications.junit.max;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/context.xml" })
public class BeforeTest {

    @Before
    public void setup() {

    }

    @Test
    public void fail() {
        /*
         * This test failure is reported on the incorrect line in Junit Max
         * 1.1.19.
         */
        assertTrue(false);
    }
}
