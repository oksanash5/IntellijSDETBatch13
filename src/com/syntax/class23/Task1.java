package com.syntax.class23;

public class Task1 {
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();

        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();

        Masters masters=new Masters();
        masters.getPrerequisite();

    }

}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a masters degree you need Bachelors degree first");
}
}

