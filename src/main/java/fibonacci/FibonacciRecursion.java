package fibonacci;

public class FibonacciRecursion {
    public static long fibonacci(int n) {

        if (n <= 0) {
           return 0;
        }
        if (n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Просторова складність: O(2^n)
    // Часова складність: O(2^n)
}
