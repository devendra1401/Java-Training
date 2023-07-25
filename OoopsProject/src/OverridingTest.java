
public class OverridingTest {

	public static void main(String[] args) {
		
		GrandFather x = new GrandFather();
		x.farming();
		
		GrandFather y = new Father();
		y.farming();
		
		GrandFather z = new Child();
		z.farming();
		
	}
}

class GrandFather{
	void farming() {
		System.out.println("GrandFather: farming in traditional style...using bull...plough....");
	}
}

class Father extends GrandFather{
	void farming() {
		//super.farming();
		System.out.println("Father: farming in new style...using tractor.......");
	}
	void banking() {
		System.out.println("Father : banking....");
	}
}

class Child extends Father{
	void farming() {
		//super.farming();
		System.out.println("Child: farming in new style...using robotic tractor.......");
	}
	void javaCoding() {
		System.out.println("Child is doing : Java Coding ");
	}
}