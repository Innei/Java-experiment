import java.io.*;

class sum_3 {
  int sum, num1, num2;
  static int num3;

  // 定义构造函数初始化对象
  sum_3() {
    num1 = 0;
    num2 = 0;
    num3 = 0;
    sum = 0;
  }
}

class sub_sum3 extends sum_3 {
  int sum, num1, num2; // 隐藏父类sum_3中的实例变量
  static int num3; // 隐藏父类sum_3中的类变量

  void sum(int i, int j, int k) {
    num1 = i;
    num2 = j;
    num3 = k;
    sum = num1 + num2 + num3;
  }

  void getSuper() {
    System.out.printf("%d %d %d", num1, super.num2, super.sum);
  }
}

public class Q1 {
  public static void main(String arg[]) {
    sub_sum3 m1 = new sub_sum3();
    m1.sum(100, 200, 300);

    System.out.println("sum=" + m1.num1 + "+" + m1.num2 + "+" + m1.num3 + "=" + m1.sum);
    m1.getSuper();
  }
}
