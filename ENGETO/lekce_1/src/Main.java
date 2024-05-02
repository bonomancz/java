import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test string from java."); // Initial test string

        printNumbers1To5(); // numbers in cycle

        double sideA = 20, sideB = 30;

        System.out.println("Triangle diagonal: " + calculateDiagonal(sideA, sideB)); // Triangle diagonal

        System.out.println(Main.getVariableTypes()); // variables kinds

        Plant plant = new Plant(); // external class instance example
        plant.tellAboutPlant();
    }


    private static void printNumbers1To5() {
        for(int i = 1; i <= 5; i++){
            System.out.println("Number: " + i);
        }
    }


    private static double calculateDiagonal(double sideA, double sideB){
        double retVal;
        retVal = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        retVal = Math.round(retVal * 100.0) / 100.0;
        return retVal;
    }


    private static String getVariableTypes(){
        String retVal = "#############################################\n";
        retVal += "###   Variable types   ######################\n";
        retVal += "#############################################\n";

        // String variable
        String string1 = "Jan Novotny";
        retVal += "String var: " + string1 + "\n";

        // Local date variable
        LocalDate date = LocalDate.now();
        date = LocalDate.of(2024, 05, 02);
        retVal += "LocalDate var: " + date + "\n";

        // BigDecimal variable
        BigDecimal price = new BigDecimal("123.45");
        retVal += "BigDecimal var: " + price + "\n";

        // Double variable
        double totalPrice = 0.0;
        // nespravne pocita
        for(int i = 0; i < 10; i++){
            totalPrice = totalPrice + 0.1;
        }
        retVal += "Double var: " + totalPrice + "\n";

        // BigDecimal variable calculates correctly
        BigDecimal totalBigPrice = BigDecimal.ZERO;
        for(int i = 0; i < 10; i++){
            totalBigPrice = totalBigPrice.add(BigDecimal.valueOf(0.1));
        }
        retVal += "BigDecimal var: " + totalBigPrice + "\n";

        return retVal;
    }
}
