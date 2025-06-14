package oopc;

public class MyClass {

  // oopc
  // class

  public static void main(String[] args) {
    // object
    Student s1 = new Student();
    s1.name = "John";
    s1.roll = 1;
    s1.marks = 100;
    s1.phone = 9876543210L;

    s1.study();

  }

}

class Student {
  String name;
  int roll;
  int marks;
  long phone;

  void study() {
    System.out.println("Student is studying");
  }

}
