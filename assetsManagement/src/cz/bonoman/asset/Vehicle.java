package cz.bonoman.asset;

public class Vehicle extends Asset {

    public Vehicle(String vendor, String type, Room room, Employee employee) {
        super(vendor, type, room, employee);
        this.itemType = "car";
    }

}
