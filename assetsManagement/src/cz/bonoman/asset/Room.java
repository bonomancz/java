package cz.bonoman.asset;

import java.util.TreeMap;

public class Room implements Location {
    private String building;
    private int id, roomNo;
    private static int nextId = 1;

    public Room(String building, int roomNo){
        this.id = nextId++;
        this.building = building;
        this.roomNo = roomNo;
    }

    public String getDescription(){
        String buildingDescription = "";
        if(!this.building.isEmpty()){
            buildingDescription += " Budova: " + this.building;
        }
        if(this.roomNo != 0){
            buildingDescription += " Mistnost: " + this.roomNo;
        }
        if(!buildingDescription.isEmpty()){ buildingDescription = " [" + buildingDescription + " ]"; }
        return buildingDescription;
    }
}
