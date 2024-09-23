package cz.bonoman.asset;

public class Asset{
    protected int id;
    protected static int nextId = 1;
    protected String vendor, type;
    protected String itemType;
    protected Room room;
    protected Employee employee;

    public Asset(String vendor, String type, Room room, Employee employee){
        this.id = nextId++;
        this.vendor = vendor;
        this.type = type;
        this.room = room;
        this.employee = employee;
    }

    protected int getId(){ return this.id; }
    protected String getVendor(){ return this.vendor; }
    protected String getType(){ return this.type; }
    protected Employee getEmployee() { return this.employee; }
    protected Room getRoom() { return this.room; }
}
