package cz.bonoman.hotel;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private final int roomId, id;
    private final LocalDate checkIn, checkOut;
    private final List<Integer> guestIdList;

    public Booking(List<Integer> guestIdList, int roomId, LocalDate checkIn, LocalDate checkOut, int id){
        this.guestIdList = guestIdList;
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.id = id;
    }

    // getters, setters
    public List<Integer> gsGuestIdList(){return this.guestIdList;}
    //public void gsGuestIdList(List<Integer> input){this.guestIdList = input;}
    public int gsRoomId(){return this.roomId;}
    //public void gsRoomId(int input){this.roomId = input;}
    public LocalDate gsCheckIn(){return this.checkIn;}
    //public void gsCheckIn(LocalDate input){this.checkIn = input;}
    public LocalDate gsCheckOut(){return this.checkOut;}
    //public void gsCheckOut(LocalDate input){this.checkOut = input;}
    public int gsId(){return this.id;}
    //public void gsId(int input){this.id = input;}
}
