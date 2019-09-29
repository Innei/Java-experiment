class A {
  int i;
  float x;

  A(int i, float x) {
    this.i = i;
    this.x = x;
  }
}

public class Q6 {

  public static void main(String[] args) {
    A a = new A(2, 8.0f);

    A res = b(a);
    System.out.printf("i = %d, x = %f", res.i, res.x);
  }

  static A b(A a) {
    a.i++;
    a.x = a.x + 2.0f;
    return a;
  }
}