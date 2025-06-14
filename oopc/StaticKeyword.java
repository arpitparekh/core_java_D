package oopc;

public class StaticKeyword {

  public static void main(String[] args) {
    Dummy d1 = new Dummy();
    d1.a = 55;
    Dummy d2 = new Dummy();
    Dummy d3 = new Dummy();
    Dummy d4 = new Dummy();
    System.out.println(d4.a);

  }
}

class Dummy {
  static int a;  // for shared memmory reference
}
