import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int max = 10;
        float[] fArr = new float[max];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < max; i++) {
            fArr[i] = scanner.nextFloat();

        }

        System.out.println("find a element: ");
        float x = scanner.nextFloat();
        for (float i : fArr) {
            if (Math.abs(i - x) < 0.001d) {
                System.out.println("有");
                return;
            }

        }
        System.out.println("无");
    }
}
