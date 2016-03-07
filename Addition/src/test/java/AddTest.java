import org.junit.Assert;

/**
 * Created by Cant-Detect on 2016/03/06.
 */
public class AddTest{

    Add addition;

    @org.junit.Before
    public void setUp() throws Exception {
        addition = new Add();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testName() throws Exception {

        int result = addition.add(5,5);
        Assert.assertEquals(10,result);

    }
}