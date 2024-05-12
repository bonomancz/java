package cz.bonoman.hotel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Guest {
    private int id;
    private String name, surName;
    private LocalDate birthDay = LocalDate.now();

    public Guest(String name, String surName, LocalDate birthDay, int id){
        this.name = name;
        this.surName = surName;
        this.birthDay = birthDay;
        this.id = id;
    }

    // getters, setters
    public String gsName(){return this.name;}
    public void gsName(String input){this.name = input;}
    public String gsSurName(){return this.surName;}
    public void gsSurName(String input){this.surName = input;}
    public LocalDate gsBirthDay(){return this.birthDay;}
    public void gsBirthDay(LocalDate input){this.birthDay = input;}
    public int gsId(){return this.id;}
    public void gsId(int input){this.id = input;}
}
