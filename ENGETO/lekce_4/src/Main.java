import cz.bonoman.computers.Computer;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        System.out.println("Computer class in 4th lesson.");
        ArrayList<Computer> computers = new ArrayList<>();

        // define computers
        computers.add(new Computer("IBM", "Recepce",2015, 21, LocalDate.of(2024, 5, 11)));
        computers.add(new Computer("Apple", "Reditel", 2018, 21, LocalDate.of(2017, 10, 6)));
        computers.add(new Computer("Dell", "Office1", 2014, 21, LocalDate.of(2013, 12, 23)));
        computers.add(new Computer("Autocont", "Office2", 2009, 21, LocalDate.of(2007, 6, 10)));
        computers.add(new Computer("HP", "Office3", 2001, 21, LocalDate.of(2001, 7, 5)));



        // output
        for(Computer computer : computers) {
            System.out.println(computer.getDescription() + " " + computer.getBrand() + " " + computer.getYear());
        }
    }

}
