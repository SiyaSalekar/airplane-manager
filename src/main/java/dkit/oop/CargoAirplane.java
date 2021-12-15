package dkit.oop;

public class CargoAirplane extends Airplane{

    // fields (ref. Q1)
    private final int MAX_LOAD_KILOS = 50_000;
    private int currentLoad;


    // constructor
    public CargoAirplane(String type, int currentLoad){
        super(type);
        this.currentLoad = currentLoad;
    }


    // toString()

    @Override
    public String toString() {
        return super.toString() +
                " MAX_LOAD_KILOS= \'" + MAX_LOAD_KILOS +"\'"+
                ", currentLoad=\'" + currentLoad +
                '\'';
    }
} // END of CargoAirplane class.

