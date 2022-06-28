package com.syntax.class24;

public abstract class Database {

    abstract void open();
    abstract void readData ();
    abstract boolean writeData();
    public void closeTheDatabase(){
        System.out.println("Terminate the connection to close it");
    }


}
class Informix extends Database{

    @Override
    void open() {
        System.out.println("Opening the Informix dataBase class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the Informix");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written succesfuly");
        return true;
    }
}
class MySQLServer extends Database {

    @Override
    void open() {
        System.out.println("Opening the MySQLServer dataBase class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the MySQLServer ");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written succesfuly");
        return true;
    }
}