package com.company;

/**
 * Created by yzhytnia on 04.10.16.
 */
public class Student extends Person{

    private int id;
    public Student(String s, String n, int p) {
        surname = s;
        name = n;
        id = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void learn (){
        System.out.println("student "+ getSurname()+" "+getName()+" learns");
    }


//    public void writeHomeTask() {
//        System.out.println("student "+ getSurname()+" "+getName()+ " writes home task");;
//    }
}
