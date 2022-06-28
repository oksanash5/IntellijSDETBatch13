package com.syntax.class17;

public class TeacherClass {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Zomnie";
        teacher.schoolName="Marvard";
        teacher.printInfo();// Because printInfo is public we can call
        //it in other classes and because its the
        //part of Techer class it can access the private fields
        // which in turn let us access those fields

        //
    }
}
