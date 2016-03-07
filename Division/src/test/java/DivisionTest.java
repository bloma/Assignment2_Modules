import org.junit.Assert;

/**
 * Created by Cant-Detect on 2016/03/06.
 */

public class DivisionTest{

    Division div;

    @org.junit.Before
    public void setUp() throws Exception {
        div = new Division();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testName() throws Exception {

        int result = div.divide(10,2);
        Assert.assertEquals(5,result);

    }
}