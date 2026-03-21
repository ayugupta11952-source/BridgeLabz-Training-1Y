package com.gla.constructors.level1;
class Book {
    String title;
    String author;
    double price;
    // Default constructor
    Book(){
        title="Unknown";
        author="Unknown";
        price=0;
    }
    // Parameterized constructor
    Book(String t,String a,double p){
        title=t;
        author=a;
        price=p;
    }
    void display(){
        System.out.println(title+" "+author+" "+price);
    }
    public static void main(String args[]){
        com.gla.constructors.AccessModifiers.Book b1=new com.gla.constructors.AccessModifiers.Book();
        com.gla.constructors.AccessModifiers.Book b2=new com.gla.constructors.AccessModifiers.Book("Java","James",500);
        b1.display();
        b2.display();
    }
}
