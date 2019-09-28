import java.math.BigInteger;

public class Q3 {
    public static void main(String[] args) {
        String n = "3465555369355754989772";
        BigInteger num = new BigInteger(n);
        toBin(num);
    }

    private static void toBin(BigInteger n) {
        BigInteger base = new BigInteger("2");
        if ( n.divide(base).compareTo(new BigInteger("0")) > 0) {
            toBin(n.divide(base));
        }
        System.out.print(n.mod(base));
    }
}
