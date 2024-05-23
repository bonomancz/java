package cz.bonoman.computers;

import java.time.LocalDate;

public class Computer implements Comparable<Computer> {
    private String brand, model, description;
    private int year;
    private double weight;
    private LocalDate purchaseDate;

    public Computer(String brand, String description, int year, double weight, LocalDate purchaseDate){
        this.description = description;
        this.year = year;
        this.weight = weight;
        this.purchaseDate = purchaseDate;
        this.brand = brand;
    }

    public double getWeight() {return weight;}
    public int getYear() {return year;}
    public String getBrand() {return brand;}
    public String getDescription() {return description;}
    public LocalDate getPurchaseDate() {return purchaseDate;}

    @Override
    public int compareTo(Computer computerForSort) {
        return 0;
    }
}
