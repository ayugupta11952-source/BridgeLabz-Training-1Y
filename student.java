import java.util.*;
class Student {
    int id;
    int age;
    String name;
  void printDetails() {
  System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
         }  public static void main(String[] args) {
   Student s1 = new Student();
        s1.id = 101;
        s1.age = 18;
        s1.name = "Rahul";
        s1.printDetails();
    }
}