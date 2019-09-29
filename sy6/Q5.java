class A {
  private int x = 8;

  void myPrint() {
    System.out.println(this.x);
  }
}

class B extends A {
  private int y = 16;
  String s = "java programing!";

  void myPrint() {
    System.out.printf("%d  %s\n", y, s);
  }

  void printAll() {
    this.myPrint();super.myPrint();
  }
}

public class Q5 {
  public static void main(String[] args) {
    B b = new B();
    b.printAll();
  }
}