package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonnaciDP {
    public static Map<Integer, Long> map = new HashMap<>();

    public static long fibonacci(int n) {

        if (n <= 0) {
            return 0;
        }

        map.put(0, 0L);
        map.put(1, 1L) ;

        for (int i = 2; i <= n; i++) {
            long fibonacci = map.get(i - 1) + map.get(i - 2);
            map.put(i, fibonacci);
        }

        return map.get(n);

    }

    // Просторова складність: O(n)
    // Часова складність: O(n)
}

