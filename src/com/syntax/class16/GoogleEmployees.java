package com.syntax.class16;

public class GoogleEmployees {

    String name;
    double salary;
    static int noOfEmployess;
    static String companyName="Google";

  void displayEmploeeInfo() {
      System.out.println("Name " + name + " Company name " + companyName+ " Total Employess"+noOfEmployess);
  }

      public static void main(String[] args){
          GoogleEmployees emp1= new GoogleEmployees();
          emp1.name="Oleg";
          emp1.salary = 250000;
          emp1.noOfEmployess=1;
          emp1.displayEmploeeInfo();

          GoogleEmployees emp2= new GoogleEmployees();
          emp2.name="Sameer";
          emp2.salary = 250001;
          emp2.noOfEmployess=2;

          emp2.displayEmploeeInfo();


      }
  }

