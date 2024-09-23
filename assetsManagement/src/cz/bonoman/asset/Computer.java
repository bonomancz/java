package cz.bonoman.asset;

public class Computer extends Asset{

    public Computer(String vendor, String type, Room room, Employee employee){
        super(vendor, type, room, employee);
        this.itemType = "computer";
    }
}
