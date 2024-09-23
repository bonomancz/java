package cz.bonoman.asset;

import java.util.ArrayList;
import java.util.List;

public class AssetsRegister implements AssetsInterface {

    private List<Asset> assetList;
    private List<Employee> employeeList;
    private List<Room> roomList;

    public AssetsRegister(){
        assetList = new ArrayList<>();
        employeeList = new ArrayList<>();
        roomList = new ArrayList<>();
    }

    public void fillInventory(){
        this.assetList.add(new Computer("HP", "AllInOne4HP", this.getRoomList().getFirst(), this.getEmployeeList().getFirst()));
        this.assetList.add(new Computer("HP", "AllInOne10HP", this.getRoomList().getFirst(), this.getEmployeeList().get(1)));
        this.assetList.add(new Vehicle("Porsche", "911 S", this.getRoomList().get(2), this.getEmployeeList().get(2)));
        this.assetList.add(new Vehicle("Range Rover", "VELAR", this.getRoomList().get(2), this.getEmployeeList().getFirst()));
    }

    public void fillEmployees(){
        this.employeeAdd("Jan", "Novotný", "IT Network administrator");
        this.employeeAdd("Martin", "Vlk", "IT Network administrator");
        this.employeeAdd("Lukáš", "Kobza", "IT Network administrator");
    }

    public void fillRooms(){
        this.roomAdd("CTW", 1001);
        this.roomAdd("CPI", 106);
        this.roomAdd("", 0);
    }

    public void employeeAdd(String firstName, String surName, String jobTitle){
        this.employeeList.add(new Employee(firstName, surName, jobTitle));
    }

    public void roomAdd(String building, int roomNumber){
        this.roomList.add(new Room(building, roomNumber));
    }

    public String getAssetListReport() throws AssetManagementException{
        StringBuilder report = new StringBuilder();
        for(Asset asset : this.getAssetList()){
            report.append(asset.id).append(" (").append(asset.itemType).append(", ").append(asset.getVendor());
            report.append(" - ").append(asset.getType()).append(") -> ");
            report.append(asset.getEmployee().getDescription());
            String roomInfo = asset.getRoom().getDescription();
            if(!roomInfo.isEmpty()){
                report.append(roomInfo);
            }
            report.append("\n");
        }
        return report.toString();
    }

    public List<Asset> getAssetList() { return this.assetList;}
    public List<Room> getRoomList() { return this.roomList; }
    public List<Employee> getEmployeeList() { return this.employeeList; }

}
