package week9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntShipTest
{
    @Test
    void gotHit()
    {
        IntShip a = new IntShip();

        //default constructor should get hit in 0.
        assertEquals(true, a.gotHit(0));

        a.setCurInt(75);
        //just checking getter.
        assertEquals(75, a.getCurInt());

        //after setting different value it should no longer get hit at 0.
        assertEquals(false, a.gotHit(1));
    }

    @Test
    void getCurInt()
    {
        IntShip a = new IntShip();

        //just checking getter.
        assertEquals(0, a.getCurInt());

        a.setCurInt(-4);

        //just checking getter.
        assertEquals(-4, a.getCurInt());
    }
}