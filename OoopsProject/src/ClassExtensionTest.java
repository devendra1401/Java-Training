
public class ClassExtensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Doctor x = new Doctor();
		//Surgeon x = new Surgeon();
		//HeartSurgeon x = new HeartSurgeon();
		Doctor x = new Surgeon();
		x.diagnose();
		x.prescribe();
		x.charge();
		//x.cut();
		//x.stitch();
		
		/*if(x instanceof Doctor) {
			System.out.println("It is a Doctor's Object");
		}
		else {
			System.out.println("It is not a Doctor's Object");
		}
		
		System.out.println("--------------");
		
		if(x instanceof Surgeon) {
			System.out.println("It is a Surgeon's Object");
		}
		else {
			System.out.println("It is not a Surgeon's Object");
		}
		
		System.out.println("--------------");
		
		if(x instanceof HeartSurgeon) {
			System.out.println("It is a HeartSurgeon's Object");
		}
		else {
			System.out.println("It is not a HeartSurgeon's Object");
		}*/
		
		
	}

}

class Doctor{
	void diagnose() {
		System.out.println("Doctor is diagnosing...ENT checkup...");
	}
	void prescribe() {
		System.out.println("Doctor is prescribing...RGB pills...");
	}
	void charge() {
		System.out.println("Doctor is charging...300 Rs/-...");
	}
}

class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon is diagnosing...CT Scan/MRI Scan...");
	}
	void prescribe() {
		System.out.println("Surgeon is prescribing...expensive pills...");
	}
	void charge() {
		System.out.println("Surgeon is charging...1000 Rs/-...");
	}
	void cut() {
		System.out.println("Surgeon is cutting");
	}
	void stitch() {
		System.out.println("Surgeon is stiching");
	}
}

class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("Heart Surgeon is diagnosing...ECG Report...");
	}
	void prescribe() {
		System.out.println("HeartSurgeon is prescribing...expensive pills...plus yoga..plus exercise");
	}
	void charge() {
		System.out.println("HeartSurgeon is charging...3000 Rs/-...");
	}
	
}