package com.company;

/**
 * Created by yzhytnia on 04.10.16.
 */
public class Room {
    private int numberRoom;
    private Person[] persons = new Person[5];
    private boolean roomOpen;
    private int count;

    public Room(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public void removePersons(Person person)  {


        for (int i = 0; i < persons.length; i++) {
            if (persons[i].surname.equals(person.surname) ) persons[i]= null;
        }

    }

    public void addPersons(Person person) {
        if (count < persons.length) {
            persons[count] = person;
            count++;
  //        System.out.println(person.toString());
        } else {
            System.out.println("the room is full");
        }
    }

    public Person[] getPersons() {
        return persons;
    }

    public boolean isRoomOpen() {
        return roomOpen;
    }

    public void setRoomOpen(boolean roomOpen) {
        this.roomOpen = roomOpen;
    }
}