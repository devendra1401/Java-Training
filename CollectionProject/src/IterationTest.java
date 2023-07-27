import java.util.Scanner;

public class IterationTest {
	
	public static void main(String[] args) {
		Demo demoRef = new Demo();
		demoRef.demo();
	}

}

class Demo{
	
	void demo() {
		System.out.println("Which magician type you want ? ");
		Scanner scanner = new Scanner(System.in);
		
		String theHint = scanner.next();
		
		Magician magician = EventAgency.getMagician(theHint);
		SavingsAccount savObj = new SavingsAccount();
		Magic magic = magician.doTrick(savObj);
		magic.show();
	}
	
}

interface Magic{
	void show();
}

class CardMagic implements Magic{
	public void show() {
		System.out.println("Showing cards...in a magical way....");
	}
}

class HatMagic implements Magic{
	public void show() {
		System.out.println("Showing hats  and parrot...in a magical way....");
	}
}

class FireMagic implements Magic{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Throwing fire from a stick....");
	}
	
}

interface Magician{
	Magic doTrick(Account acc);
}

class CardMagician implements Magician{

	@Override
	public Magic doTrick(Account accRef) {
		// TODO Auto-generated method stub
		System.out.println("Hiding some cards under the sleeves....");
		Magic magic = new CardMagic();
		accRef.deposit(5000);
		return magic;
	}
	
}

class HatMagician implements Magician{

	@Override
	public Magic doTrick(Account accRef) {
		// TODO Auto-generated method stub
		System.out.println("Hiding the parrot under the Hat....");
		Magic magic = new HatMagic();
		accRef.deposit(6000);
		return magic;
	}
	
}

class FireMagician implements Magician{

	@Override
	public Magic doTrick(Account accRef) {
		// TODO Auto-generated method stub
		System.out.println("Using a stick to show a fire magic...");
		Magic magic = new FireMagic();
		accRef.deposit(4000);
		return magic;
	}
	
}

class EventAgency{
	public static Magician getMagician(String hint) {
		Magician magician = null;
		if(hint.equalsIgnoreCase("hats")) {
			magician = new HatMagician();
		}
		else if(hint.equalsIgnoreCase("cards")) {
			magician = new CardMagician();
		}
		else if(hint.equalsIgnoreCase("fire")){
			magician = new FireMagician();
		}
		return magician;
	}
}

interface Account{
	void withdraw(float amt);
	void deposit(float amt);
}

class SavingsAccount implements Account{
	public void withdraw(float amt) {
		System.out.println("withdrawing..."+amt);
	}
	public void deposit(float amt) {
		System.out.println("depositing...."+amt);
	}
}


