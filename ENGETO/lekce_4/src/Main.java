import cz.bonoman.computers.Computer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {

    public static void main(String[] args){
        System.out.println("Computer class in 4th lesson.");
        ArrayList<Computer> computers = new ArrayList<>();

        // define computers
        computers.add(new Computer("IBM", "Recepce",2015, 10, LocalDate.of(2014, 5, 11)));
        computers.add(new Computer("Apple", "Reditel", 2018, 12, LocalDate.of(2017, 10, 6)));
        computers.add(new Computer("Dell", "Office1", 2014, 7, LocalDate.of(2013, 12, 23)));
        computers.add(new Computer("Autocont", "Office2", 2009, 20, LocalDate.of(2007, 6, 10)));
        computers.add(new Computer("HP", "Office3", 2001, 14, LocalDate.of(2001, 7, 5)));

        computers.sort(Comparator.comparing(Computer::getYear, Comparator.naturalOrder()));

        // output
        for(Computer computer : computers) {
            System.out.println("Description: " + computer.getDescription() + " Brand: " + computer.getBrand() + " Year: " + computer.getYear() + " Weight: " + computer.getWeight());
        }
    }

}
