package review;

public class B13String {
    //Best practice is make all of your instance as private
    private String str;
    public B13String(String str){
        int number;
       // this.number // error this use onlu with instance veriable
        this.str=str;

    }
  //write a methos that can tell me how many times as
    //character is being repeated in a string

    public int countChars(char c){
        int counter=0;
        for(char cha:str.toCharArray()){ //str.toCharArray() == char[] arr{a,b,c,s,d,...}
            if(cha==c){
                counter++;
            }

        }
   return counter;
    }

    public void printChars(char c) {
       int counter=0;
       for (int i=0;i<str.length(); i++){
           if (str.charAt(i)==c){
               counter++;
           }
       }
        System.out.println(c+ " has appeared " + counter+" times inside this string"+str);
    }
}
