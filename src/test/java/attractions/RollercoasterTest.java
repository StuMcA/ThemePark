package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1, visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(12, 201, 10);
        visitor2 = new Visitor(13, 90, 500);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollerCoaster(){
        rollerCoaster.addVisitor(visitor1);
        rollerCoaster.addVisitor(visitor2);
        assertEquals(1, rollerCoaster.getVisitCount());
    }

    @Test
    public void getTicketCosts(){
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.01);
        assertEquals(16.8, rollerCoaster.priceFor(visitor1), 0.01);
    }
}
