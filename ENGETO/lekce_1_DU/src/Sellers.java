import java.time.LocalDate;

public class Sellers {
    private String nameSurname;
    private LocalDate birthDate;
    private int contracts;
    private double carrotsTons;
    private String sellersCity;
    private String carRegPlate;
    private double fuelConsumption;
    private String ipv4;

    public Sellers(){
        this.nameSurname = "Jan Novotny";
        this.birthDate = LocalDate.of(1980, 7, 9);
        this.contracts = 13;
        this.carrotsTons = 3.1415926535897932384626433832795;
        this.sellersCity = "Olomouc";
        this.carRegPlate = "6M26262";
        this.fuelConsumption = 8.7;
        this.ipv4 = "8.8.8.8";
    }

    public double getAvgCarrotPerContract(){
        double retVal = Math.round((this.carrotsTons / this.contracts) * 100.0) / 100.0;
        return retVal;
    }

    public String getSellerInfo(){
        String retVal = "\n#################################################\n";
        retVal += "#### SELLERS ####################################\n";
        retVal += "Name, surname: " + this.nameSurname + "\n";
        retVal += "From: " + this.sellersCity + "\n";
        retVal += "IPv4: " + this.ipv4 + "\n";
        retVal += "Car reg. plate: " + this.carRegPlate + "\n";
        retVal += "Car fuel consumption per 100 km: " + this.fuelConsumption + "\n";
        retVal += "Birth date: " + this.birthDate + "\n";
        retVal += "Successfull contracts: " + this.contracts + "\n";
        retVal += "Carrot tons: " + this.carrotsTons + "\n";
        retVal += "Average tons of carrot per contract: " + this.getAvgCarrotPerContract() + "\n";

        return retVal;
    }
}
