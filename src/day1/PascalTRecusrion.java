package day1;

public class PascalTRecusrion {
	
	
	
	
	
	public static void main (String args[]) {
    System.out.println("Print Traingle using Recursion");
	TriangleByRecursion triangle= new TriangleByRecursion();
	triangle.printUseRecursion(10);
	
	System.out.println("Print Traingle using Memoization");
	TriangleBYMemoization mem =new TriangleBYMemoization();
    mem.printUseMemoization(8);
    
    System.out.println("Print Traingle using Iteration");	
	TriangleByIteration triangleIt = new TriangleByIteration();
	triangleIt.printUseIeration(10);
		
	}

}
