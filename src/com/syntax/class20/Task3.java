package com.syntax.class20;

public class Task3 {
    //
   // Write a Java program called Teacher.
     //   Identify features and behaviour of that Class.
      //  Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have
      //  it their own features and behaviour.
      //  Test all 4 classes


    public static void main(String[] args) {
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Adem";
        chemistryTeacher.favoriteChemSbject="Organic";
        chemistryTeacher.teacherChem();


    }}
class Teacher{
    String name;
    String typeOfTeacher;
      public  void teach(){
            System.out.println(name+" Teachers"+typeOfTeacher);
        }
    }
class MathTeacher extends Teacher{
    String favoriteMathSubject;
    public void teachesMath(){
        System.out.println(name+" Teacher Math and his favorite math subject is "+favoriteMathSubject);
    }
}
class ChemistryTeacher extends Teacher{
    String favoriteChemSbject;
    public void teacherChem(){
        System.out.println(name+" Teacher Chemistry and his favorite chemistry subject is "+favoriteChemSbject);
    }
}
class PianoTeacher extends Teacher {
    String favoriteModelOfPiano;

    public void teacherPiano() {
        System.out.println(name + " Teacher Piano and his favorite Piano model is " + favoriteModelOfPiano);
    }
}