import java.util.Arrays;
import java.lang.System;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] iArr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< 5;i++) {
            iArr[i] = scanner.nextInt();
        }
        Until u = new Until();
        u.sort(iArr);

        for (int i :
                iArr) {
            System.out.println(i);
        }
        int[] delArr = u.deleteElem(iArr, 1);
        for (int i :
                delArr) {

            System.out.println(i);
        }
    }
}

class Until {
    void sort(int[] arr) {
        int temp;

        for (int i = 0, length = arr.length; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    int[] deleteElem(int[] arr, int index) {
        for (int i = index, length = arr.length; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return Arrays.copyOf(arr, arr.length - 1); // 新数组缩容
    }
}
