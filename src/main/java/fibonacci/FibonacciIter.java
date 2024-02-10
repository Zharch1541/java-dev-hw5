package fibonacci;

public class FibonacciIter {
    public static long fibonacci( int n) {

        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return n;
        }

        long first = 0;
        long second = 1;
        long result = 0;

        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }
}
