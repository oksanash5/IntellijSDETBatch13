package com.syntax.class24;

public class Main {
    public static void main(String [] args){
        StoreProduct product1=new StoreProduct ("Egges",3,"Produce",true,10);
        product1.display();

        StoreProduct product2 = new StoreProduct("Paper Towels",2,24);
        product2.display();

        StoreProduct product3 = new StoreProduct("Paper Towels",2);
        product3.hasExpiration=false;
        product3.display();
    }
}
class StoreProduct{
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String label,double price,String category,boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String label,double price,int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;
        category="misc";
        hasExpiration=false;
    }
    StoreProduct(String label,double price){
        this.label=label;
        this.price=price;
        stock=0;
    }
    void display(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}

