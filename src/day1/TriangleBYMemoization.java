package day1;

import java.util.HashMap;
import java.util.Map;

public class TriangleBYMemoization {
	
	
	public static Map<Integer, Long> fCache = new HashMap<>();
	
	
	private static long factorial(int n) {
        long fact = 1;
        if (n <= 1) {
            return fact;
        } else if (fCache.containsKey(n)) {
            return fCache.get(n);
        }

        fact = n * factorial(n-1);
        fCache.put(n, fact);

        return fact;
    }
		
		public void printUseMemoization(int n) {
		    for (int i = 0; i <= n; i++) {
		        for (int j = 0; j <= n - i; j++) {
		            System.out.print(" ");
		        }

		        for (int k = 0; k <= i; k++) {
		            System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
		        }

		        System.out.println();
		    }
		}
}
