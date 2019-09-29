class sort_Demo {
  int i, j, k, swap;

  sort_Demo() {
    i = j = k = swap = 0;
  }

  void sort(int t1, int t2[]) { // 父类中的方法用来实现升序
    // 用选择法按升序排列
    for (i = 0; i < t1 - 1; i++) {
      k = i;
      for (j = i + 1; j < t1; j++)
        if (t2[j] < t2[k])
          k = j;
      if (k != i) {
        swap = t2[i];
        t2[i] = t2[k];
        t2[k] = swap;
      }
    }
  }
}

class sub_sort_Demo extends sort_Demo {
  void sort(int t1, int t2[]) { // 子类中的方法实现降序
    // 用选择法实现降序排列
    for (i = 0; i < t1 - 1; i++) {
      k = i;
      for (j = i + 1; j < t1; j++)
        if (t2[j] > t2[k])
          k = j;
      if (k != i) {
        swap = t2[i];
        t2[i] = t2[k];
        t2[k] = swap;
      }
    }
  }
}

public class Q4 {
  public static void main(String args[]) {
    int a[] = { 34, 12, 8, 67, 88, 23, 98, 101, 119, 56 };
    sort_Demo m1 = new sort_Demo();
    sub_sort_Demo m2 = new sub_sort_Demo();
    System.out.println("排序前的数据为：");
    for (int i = 0; i < 10; i++)
      System.out.print("  " + a[i]);
    // 调用父类中的sotr()方法
    m1.sort(a.length, a);
    System.out.println("\n按升序排列的数据为：");
    for (int i = 0; i < 10; i++)
      System.out.print("  " + a[i]);
    // 调用子类中的sort()方法,该方法实现了对父类中方法的覆盖
    m2.sort(a.length, a);
    System.out.println("\n按降序排列的数据为：");
    for (int i = 0; i < 10; i++)
      System.out.print("  " + a[i]);
  }
}
