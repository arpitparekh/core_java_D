package oopc;

public class MyEncapsulation {

  public static void main(String[] args) {
    Demo d = new Demo();

  }

}

class Demo {
  int a;  // default
  public int b;
  private int c;
  protected int d;

  public void dance() {
    System.out.println("Dancing");
  }
}

class Child extends Demo {

}
