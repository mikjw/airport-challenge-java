import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {
    @Test
    public void testPlane() {
        Plane plane = new Plane();
        plane.land();
        assertTrue("Landed status is true", plane.getLandedStatus() == true);
    }
}