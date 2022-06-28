package review;

public class Doctor {
    public String firstName, lastName;
    protected String speciality;
    int experience;
    private double salary;

    static String hospital;
public Doctor(String firstName, String lastName){
    this.firstName=firstName;
    this.lastName=lastName;

}
Doctor(String firstName,String lastName, String speciallity, int experience){
    this(firstName, lastName);
    this.speciality=speciallity;
    this.experience=experience;
}
public void printInfo(){
    System.out.println("Doctor name is "+firstName+" "
             + lastName+" and speciality is "+speciality);
}
//instance method can wort with noth instance and static variable
protected void work(){
    System.out.println("Doctor "+lastName+" works at "+hospital);
}
void treat(String patientName){
    this.printInfo();// this. is not nececeary actualy,
    System.out.println("Traets patient"+patientName);
}

private void getPaid(){
    System.out.println("doctor"+lastName+ "getSalsry");
}
// static methid can work only with static variables and static method
public static void study(String univercity){
   //printInfo(); CE:Can not make a static reference to the
    System.out.println("Doctor studied at"+univercity+" and now works at "+hospital);
}
}
