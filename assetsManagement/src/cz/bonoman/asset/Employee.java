package cz.bonoman.asset;

public class Employee implements Location{
    private String firstName, surName, jobTitle;
    private int id;
    private static int nextId = 1;

    public Employee(String firstName, String surName, String jobTitle){
        this.id = nextId++;
        this.firstName = firstName;
        this.surName = surName;
        this.jobTitle = jobTitle;
    }

    public String getDescription(){
        return this.firstName + " " + this.surName + " (" + this.jobTitle + ")";
    }
}
