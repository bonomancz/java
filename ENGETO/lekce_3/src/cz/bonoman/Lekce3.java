package cz.bonoman;

import java.util.ArrayList;

public class Lekce3 {

    private ArrayList<Integer> intList = new ArrayList<Integer>();

    public Lekce3(){}

    public void fillList(){
        for(int i = 0; i < 100; i+=10){
            intList.add(i);
        }
    }

    public ArrayList<Integer> getFillList(){
        return this.intList;
    }

}
