package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane  extends Airplane{

    // fields(Q2)
    public int MAX_NUM_PASSENGERS;
    public ArrayList<String> namesList;

    PassengerAirplane(String type, int maxNumPassengers) {
        // code here
        super(type);
        this.MAX_NUM_PASSENGERS = maxNumPassengers;
        this.namesList = new ArrayList<>();
    }

    @Override

    public String toString() {
        return super.toString() +
                " MAX_NUM_PASSENGERS= \'" + MAX_NUM_PASSENGERS +"\'"+
                ", namesList= " + namesList ;
    }

    public void addPassenger(String name) {
        // code here
        if(this.namesList.size()<MAX_NUM_PASSENGERS){
            namesList.add(name);
        }
    }


} // end of PassengerAirplane
