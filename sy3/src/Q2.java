public class Q2 {
    public static void main(String[] args) {
        first f = new first();
        f.allprime(1,10);
    }
}

class first {
    boolean prime(int n) {//该方法为判断n是否为素数
        boolean flag = true;

        if (n < 2) {// 素数不小于2
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {// 若能被整除，则说明不是素数，返回false

                    flag = false;
                    break;// 跳出循环
                }
            }
        }
        return flag;

    }

    void allprime(int m, int n) {
        for (int i = m; i < n; i++) {
            if (prime(i)) System.out.println(i);
        }
    }//利用前一个方法求出 m到n之间的所有素数}

}
