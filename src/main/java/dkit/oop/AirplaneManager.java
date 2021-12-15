package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method
    public void add(Airplane plane){
        airplaneList.add(plane);
    }


    public void displayAllAirplanes() {
        // add code
        for(Airplane a: airplaneList){
                System.out.println(a);
        }
    }

    public void displayAllPassengerAirplanes() {
        // add code
        for(Airplane a: airplaneList){
            if(a instanceof PassengerAirplane) {
                System.out.println(a);
            }
        }
    }

    //  write method getAllCargoAirplanes()
    public ArrayList<Airplane> getAllCargoAirplanes() {
        ArrayList<Airplane> cargoList = new ArrayList<>();
        for(Airplane a: airplaneList){
            if(a instanceof CargoAirplane) {
               cargoList.add(a);
            }
        }
        return cargoList;
    }


    // write  addPassengerNameToAirplane( airplaneId, passengerName)
   public boolean addPassengerNameToAirplane(int airplaneId, String passengerName){
        for(Airplane a : airplaneList){
            if(a instanceof PassengerAirplane){
                if(a.getId()==airplaneId){
                    ((PassengerAirplane) a).addPassenger(passengerName);
                    return true;
                }
            }
        }
        return false;
   }

    // write containsAirplane( Airplane plane )
    public boolean containsAirplane(Airplane plane){
        for(Airplane a: airplaneList){
            if(a.equals(plane)){
                return true;
            }
        }
        return false;
    }

    // write findAirplaneByPassengerName( passengerName )


    // write displayAllAirplanesInOrderOfType( argument )


} // end of AirplaneManager


