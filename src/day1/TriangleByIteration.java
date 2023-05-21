package day1;

public class TriangleByIteration {
	
	public long factorial(int i) {
		long fact =1;
		
	    if (i <=1) {
	        return fact;
	    }
	    for(int p =2; p<=i; p++) {
	    	fact *=i;
	    }
	    return fact;
	}
	
	public void printUseIeration(int n) {
	 
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j <= n - i; j++) {
	 
	                // for left spacing
	                System.out.print(" ");
	            }
	 
	            // used to represent C(line, i)
	            
	            for (int k = 0; k <= i; k++) {
		            System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
		        }
	            
	            System.out.println();
	        }
	    }
		
}
