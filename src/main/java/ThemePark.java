import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> attractionsAndStalls;
    public ThemePark(String name){
        this.name = name;
        this.attractionsAndStalls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAttractionsAndStalls() {
        return attractionsAndStalls.size();
    }

    public void addStall(Stall stall){
        this.attractionsAndStalls.add(stall);
    }

    public void addAttraction(Attraction attraction){
        this.attractionsAndStalls.add(attraction);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.attractionsAndStalls;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addVisitor(visitor);
    }

}
