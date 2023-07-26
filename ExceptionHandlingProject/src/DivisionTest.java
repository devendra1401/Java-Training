
public class DivisionTest {

	public static void main(String[] args) {
		System.out.println("Begin of Main..\n");
		
		try {
			Calculator.divide(100, 4);
		}
		catch(Exception e1) {
			System.out.println("Exception : "+e1);
		}
		finally {
			System.out.println("Finally : 1 Runs regardless of the Exception ");
		}
		
		try {
			Calculator.divide(40, 5);
		}
		catch(Exception e2) {
			System.out.println("Exception : "+e2);
		}
		finally {
			System.out.println("Finally : 2 Runs regardless of the Exception ");
		}
		
		try {
			Calculator.divide(60, 0);
		}
		catch(Exception e3) {
			System.out.println("Exception : "+e3);
		}
		finally {
			System.out.println("Finally : 3 Runs regardless of the Exception ");
		}
		
		System.out.println("\nEnd of Main");
	}
	
}

class Calculator{
	/*static void divide(int num, int deno) {
		System.out.println("BEGIN of divide");
		System.out.println("Numerator   : "+num);
		System.out.println("Denominator :"+deno);
		System.out.println("Trying to divide "+num+ " by "+deno);
		if(deno!=0) { //BL
			int division  = num / deno ;
			System.out.println("Division    : "+division);
		}
		else {//EL
			System.out.println("CANNOT DIVIDE BY ZERO....");
		}
		System.out.println("END of divide\n");
	}*/
	
	static void divide(int num, int deno) throws Exception {
		
		System.out.println("Begin of Divide...");
		System.out.println("Numerator   : "+num);
		System.out.println("Denominator :"+deno);
		System.out.println("Trying to divide "+num+ " by "+deno);
		
		int division = num/deno;
		System.out.println("Division : "+division);
		
		if(10>50) {
			throw new Exception("Some Problem...");
		}
		
		System.out.println("End of Divide\n");
		
	}
	
}