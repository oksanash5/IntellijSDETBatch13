package review;

public class AnotherHospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Sherlor","Holmes","Magic",10);

        //access visability
        doc.printInfo();// acces to public
        doc.treat("samantha");// access to default
        doc.work();// acces to protected
        Doctor.study("GW");// acces  to public but static non acces
                                   // call though to Doctor class.
    }
}
