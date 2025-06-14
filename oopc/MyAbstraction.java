package oopc;

public class MyAbstraction {

  public static void main(String[] args) {

    // abstraction
    // abstract class

    // interfaace
    // interface is a group of abstarct method

  }

}

abstract class Weather {
  double temp;
  double windSpeed;

  abstract void tornado();

  void rain() {
    System.out.println("Raining");
  }
}

class MyClass extends Weather {
  @Override
  void tornado() {

  }

  void rain() {
    System.out.println("Raining");
  }
}

interface MyInterface {
  void func1();
  void func2();
  void func3();
}

final class ParulClass implements MyInterface {

  final int a = 12;
  int b;

  void dance() {
  }
  @Override
  public void func1() {
    // TODO Auto-generated method stub
  }
  @Override
  public void func2() {
    // TODO Auto-generated method stub
  }
  @Override
  public void func3() {
    // TODO Auto-generated method stub
  }
}
