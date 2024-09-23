package cz.bonoman.asset;

public interface AssetsInterface {
    public String getAssetListReport() throws AssetManagementException;
    public void fillInventory();
    public void fillEmployees();
    public void fillRooms();
}
