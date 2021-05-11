import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction attraction;
    Stall stall;
    Visitor visitor;

    @Before
    public void setUp() {
        themePark = new ThemePark("Magical Wonderland");
        attraction = new RollerCoaster("Shooting Star", 2);
        stall = new IceCreamStall("The Frozen Palace", 5, "Stuart", ParkingSpot.A1);
        visitor = new Visitor(20, 190, 50);
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(attraction);
        themePark.addStall(stall);
        assertEquals(2, themePark.getAttractionsAndStalls());
    }

    @Test
    public void visitorCanHaveAttractionsList(){
        themePark.addAttraction(attraction);
        themePark.addStall(stall);
        themePark.visit(visitor, attraction);
        ArrayList<Attraction> goalList = new ArrayList<>();
        goalList.add(attraction);
        assertEquals(goalList, visitor.getVisitedAttractions());
        assertEquals(1, attraction.getVisitCount());
    }
}
