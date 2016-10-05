package com.company;

/**
 * Created by yzhytnia on 04.10.16.
 */
public class Person {

    protected String name;
    protected String surname;
    Room room;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String newSurname){
        surname = newSurname;
    }
    public String getSurname(){
        return surname;
    }

    public void comeIn(Room room){
        System.out.println("student "+getSurname()+" "+getName()+" comein in room number " + room.getNumberRoom());
        room.addPersons(this);
        this.room = room;
    }

    public void comeOut(Room room){
        System.out.println(getName()+" "+getSurname()+" comeout from room number " + room.getNumberRoom());
        room.removePersons(this);
    }

    public void endlesson(){
        System.out.println("finish lesson");
    }

    @Override
    public String toString(){
        return "surname = " + surname;
    }
}
