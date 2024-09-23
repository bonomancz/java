import cz.bonoman.asset.AssetManagementException;
import cz.bonoman.asset.AssetsRegister;

public class Main {
    public static void main(String []args){
        try {
            AssetsRegister assetsRegister = new AssetsRegister();
            assetsRegister.fillEmployees();
            assetsRegister.fillRooms();
            assetsRegister.fillInventory();
            System.out.println(assetsRegister.getAssetListReport());
        }catch (AssetManagementException e){
            System.err.println(e.getMessage());
        }
    }
}
