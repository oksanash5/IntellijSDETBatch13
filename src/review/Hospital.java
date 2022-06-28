package review;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Jane","Smith");
       doc.printInfo();
        Doctor.hospital="UCSF";
        doc.work();
        System.out.println("_______----------------");
// creating another doctor
        Doctor doctor=new Doctor("Joe","Doe","cardiologyst",10);
        doctor.printInfo();
        doctor.work();
        System.out.println("____________________");
// changing value of static variable
        Doctor.hospital="George Washington";
        doc.work();
        doctor.work();
        System.out.println("_______________");
        // changing value of instance variable
        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();

        System.out.println("________________");
        doc.hospital="Mayo Clinic";
        doc.work();
        doctor.work();
     System.out.println("------------");
        doctor.treat("Samantha");

        // accessing static method by class name when it was created

        Doctor.study("GTU");

    }
}
