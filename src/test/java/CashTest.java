import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashTest {
    Cash cash;
    @Before
    public void before(){
        cash = new Cash(100.00);
    }

    @Test

    public void hasAmount(){
        assertEquals(100.00,cash.getAmount(),0.00);
    }


}