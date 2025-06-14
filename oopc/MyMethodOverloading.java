package oopc;

public class MyMethodOverloading {

  public static void main(String[] args) {

    // polymorphism  // many - forms

    // funtion overloading
    // parameter must be different
    // type of parameter also should be different
    // order of parameter also should be different

    College c = new College();
    c.study(12);

    // function overriding

  }

}

class College {
  String name;
  String address;

  void study() {
    System.out.println("Study 1");
  }

  void study(int a) {
    System.out.println("Study 2");
  }

  void study(float a) {
    System.out.println("Study 2");
  }

  void study(int a, int b) {
    System.out.println("Study 2");
  }

  void study(int a, String b) {
    System.out.println("Study 2");
  }

  void study(String a, int b) {
    System.out.println("Study 2");
  }
}
