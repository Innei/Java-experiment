import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数n");
        int n = scanner.nextInt();

        float max = 0, min = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            float x = scanner.nextFloat();
            sum += x;
            if (i == 0) {
                min = max = x;
            }
            if (x < min) {
                min = x;
            } else max = x;
        }
        System.out.println("sum = " + sum + "; min = " + min + "; max = " + max);
    }
}
