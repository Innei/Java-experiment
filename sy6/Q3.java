class Sort2or3 {
  double max1, max2, max3;

  Sort2or3() {
    max1 = -1;
    max2 = -1;
    max3 = -1;
  }

  void sort(double i, double j) {
    double s;
    max1 = i;
    max2 = j;
    if (max1 < max2) {
      s = max1;
      max1 = max2;
      max2 = s;
    }
  }

  void sort(double i, double j, double k) {
    double s;
    max1 = i;
    max2 = j;
    max3 = k;
    if (max1 < max2) {
      s = max1;
      max1 = max2;
      max2 = s;
    }
    if (max1 < max3) {
      s = max1;
      max1 = max3;
      max3 = s;
    }
    if (max2 < max3) {
      s = max2;
      max2 = max3;
      max3 = s;
    }
  }
}

public class Q3 {
  public static void main(String args[]) {
    Sort2or3 m1 = new Sort2or3();
    m1.sort(100, 200);
    System.out.println("两个数从大到小为：" + m1.max1 + "," + m1.max2);
    m1.sort(50, 150, 100);
    System.out.println("三个数从大到小为：" + m1.max1 + "," + m1.max2 + "," + m1.max3);
  }
}
