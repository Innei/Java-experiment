public class Q3 {
    public static void main(String[] args) {
        A3 a = new A3();
        for (int i = 1; i < 1000000; i++) {
            if (a.isStrongNum(i)) System.out.println(i);
        }
    }
}

class A3 {
    public boolean isStrongNum(int i) {
        int origin = i;
        int temp, r = 0;

        while (i != 0) {
            temp = i % 10;
            i /= 10;
            r += factorial(temp);
        }
        if (origin == r) return true;
        return false;
    }

    public int factorial(int i) {
        int r = 1;
        for (int t = 1; t <= i; t++) {
            r *= t;
        }
        return r;
    }
}
