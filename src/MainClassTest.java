import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber()
    {
        int b = 45;
        this.getClassNumber();
        Assert.assertTrue("Test is ok, 20 < 45", b < 45);
    }

}
