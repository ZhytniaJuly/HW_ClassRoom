package com.company;

public class Main  {

    public static void main(String[] args)  {
        Teacher teacher1 = new Teacher("Ivanov", "Ivan", "teacher");
        Teacher teacher2 = new Teacher("Sidorov", "Ivan", "assistant");
        Student student1 = new Student ("Petrov", "Petr",1);
        Student student2 = new Student ("Kozlov", "Oleh",2);
        Student student3 = new Student ("Sidorov", "Alex",3);
        Student student4 = new Student ("Kotov", "Bob",4);
        Student student5 = new Student ("Sergeev", "Vlad",5);

        Room room1 = new Room (1);

        teacher1.openRoom(room1);
        teacher1.comeIn(room1);
        teacher2.openRoom(room1);
        student1.comeIn(room1);
        student2.comeIn(room1);
        student3.comeIn(room1);
        student4.comeIn(room1);
        student5.comeIn(room1);
        teacher1.teach();

        teacher1.endlesson();
        student4.comeOut(room1);
        student3.comeOut(room1);
        student2.comeOut(room1);
        student1.comeOut(room1);
        teacher1.comeOut(room1);
        teacher1.closeRoom(room1);
        teacher2.closeRoom(room1);
    }
}
