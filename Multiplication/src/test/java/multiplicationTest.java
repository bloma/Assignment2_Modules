import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


/**
 * Created by Cant-Detect on 2016/03/06.
 */
public class multiplicationTest{

    multiplication multi;

    @Before
    public void setUp() throws Exception {

        multi = new multiplication();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {

        int result = multi.multiply(6,2);
        Assert.assertEquals(12,result);
    }
}