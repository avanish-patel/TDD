import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest {

    private MainClass test;

    @Before
    public void setUp(){

        test = new MainClass();
    }

    @Test
    public void add() {

        Assert.assertEquals(45, test.add(10,10,10,10,5));
    }

    @Test
    public void subtract() {

        Assert.assertEquals(45,test.subtract(90,45));
    }
}