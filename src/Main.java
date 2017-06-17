import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
    If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
    For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
    Evaluate the sum of all the amicable numbers under 10000.
    */
    public static void main(String[] args) {
        int sum = 0;
        for (int A = 1; A < 20000; A++) {
            List<Integer> Adivisors = new ArrayList<>();
            for (int j = 1; j < A; j++) {
                if (A%j == 0) {
                    Adivisors.add(j);
                }
            }
            int B = 0;
            for (Integer Adivisor: Adivisors) {
                B += Adivisor;
            }

            List<Integer> Bdivisors = new ArrayList<>();
            for (int j = 1; j < B; j++) {
                if (B%j == 0) {
                    Bdivisors.add(j);
                }
            }
            int Bsum = 0;
            for (Integer Bdivisor: Bdivisors) {
                Bsum += Bdivisor;
            }

            if (Bsum == A && B != A) {
                if (A < 10000) {
                    sum += A;
                }
            }
        }
        System.out.println(sum);
    }
}
