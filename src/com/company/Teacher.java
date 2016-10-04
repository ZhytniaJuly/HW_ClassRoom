package com.company;

/**
 * Created by yzhytnia on 04.10.16.
 */
public class Teacher extends Person {
    private String position;
    Room room;
    public Teacher(String s, String n, String p){
        surname = s;
        name = n;
        position = p;
    }
    public void setPosition(String newPosition){
        position = newPosition;
    }
    public String getPosition(){
        return position;
    }

    @Override
    public void comeIn(Room room) {
        System.out.println(getPosition()+" come in and switch light");
        room.addPersons(this);
        this.room = room;
    }

    public void openRoom(Room room){
        if (room.isRoomOpen() == false) {
            System.out.println(getPosition() + " " + getSurname() + " " + getName() + " open the room number " + room.getNumberRoom());
            room.setRoomOpen(true);
        } else {
            System.out.println(getPosition()+" try open the room number " + room.getNumberRoom()+", but it is already opened");
        }
    }

    public void closeRoom(Room room){
        if (room.isRoomOpen() == true) {
            System.out.println(getPosition() + " " + getSurname() + " " + getName() + " close the room number " + room.getNumberRoom());
            room.setRoomOpen(false);
        } else {
            System.out.println(getPosition()+" try close the room number"+ room.getNumberRoom()+", but it is already closed" );
        }

    }

    public void teach(){
        for(Person student: room.getPersons()){
            if(student instanceof Student) {
                System.out.println("the teacher teaches "+student.getSurname()+" "+student.getName());
                ((Student) student).learn();

            }
        }
    }

//    @Override
//    public void endlesson() {
//        for(Person student: room.getPersons()){
//            if(student instanceof Student) {
//                System.out.println("teacher announced home task "+student.getSurname()+" "+student.getName());
//                ((Student) student).writeHomeTask();
//
//            }
//        }
//
//    }
}
