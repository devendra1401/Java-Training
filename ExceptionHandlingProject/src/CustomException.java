
public class CustomException {

	public static void main(String[] args) {
		System.out.println("Main started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key issue : "+ex1);
		}
		catch(CarBatteryDownException ex2) {
			System.out.println("Battery issue : "+ex2);
		}
		catch(CarBreaksWorkingExceptoin ex3) {
			System.out.println("Breaks issue : "+ex3);
		}
		catch(CarMusicSystemWorkingException ex4) {
			System.out.println("Music System issue : "+ex4);
		}
		
		System.out.println("\nMain finished...\n");
	}
}

class CarKeyNotFoundException extends Exception{
	CarKeyNotFoundException(String msg){
		super(msg);
	}
}

class CarBatteryDownException extends Exception //checked
{
	CarBatteryDownException(String msg) {
		super(msg);
	}
}

class CarBreaksWorkingExceptoin extends Exception{
	CarBreaksWorkingExceptoin(String msg){
		super(msg);
	}
}

class CarMusicSystemWorkingException extends Exception{
	CarMusicSystemWorkingException(String msg){
		super(msg);
	}
}

class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}

class TyrePuncturedException extends RuntimeException
{
	TyrePuncturedException(String msg) {
		super(msg);
	}
}

class GotAnAccidentException extends RuntimeException{
	GotAnAccidentException(String msg){
		super(msg);
	}
}

class MetAFriendException extends RuntimeException{
	MetAFriendException(String msg){
		super(msg);
	}
}

class Car{
	boolean keyFound = false;
	boolean carBatteryFunctioning = true;
	boolean carBreaksWorking = true;
	boolean carMusicSystemWorking = true;
	
	Car() throws CarKeyNotFoundException, CarBatteryDownException, 
				CarBreaksWorkingExceptoin, CarMusicSystemWorkingException{
		double value = Math.random()%10;
		if(value>0.30) {
			keyFound = true;
		}
		
		if(keyFound == true) {
			System.out.println("Car is started..."+value);
		}
		else {
			throw new CarKeyNotFoundException("Hey...Where is the Car key? I am not getting it..."+value);
		}
		
		if(value<0.10) {
			carBatteryFunctioning=false;
		}
		else {
			System.out.println("Car Battery is FINE...!!!");
		}
		
		if(value<0.15) {
			carBreaksWorking=false;
		}
		else {
			System.out.println("Car's Breaks are working FINE...!!!");
		}
		
		if(value<0.5) {
			carMusicSystemWorking=false;
		}
		else {
			System.out.println("Car's Music System is working FINE...!!!");
		}
		
		if(carBatteryFunctioning==false) {
			CarBatteryDownException ex = new CarBatteryDownException("Car Battery is out of order...");
			throw ex;
		}
		
		if(carBreaksWorking==false) {
			CarBreaksWorkingExceptoin ex = new CarBreaksWorkingExceptoin("Car's breaks are not working...");
			throw ex;
		}
		
		if(carMusicSystemWorking==false) {
			CarMusicSystemWorkingException ex = new CarMusicSystemWorkingException("Car's Music System is not working...");
			throw ex;
		}
	}
	
	public void longDrive() {
		for(int i=1;i<=30;i++) {
			System.out.println(i+" kms driven...");
			double value = Math.random()%10;
			if(value>0.99) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured...."+value);
				throw ex1;
			}
			else if(value>0.85 && value <=0.87) {
				TyrePuncturedException ex2 = new TyrePuncturedException("Oh No!!! tyre got punctured......."+value);
				throw ex2;
			}
			else if(value>0.75 && value <=0.76) {
				GotAnAccidentException ex3 = new GotAnAccidentException("Oh No!!! Got an Accident..."+value);
				throw ex3;
			}
			else if(value>0.65 && value <=0.70) {
				MetAFriendException ex4 = new MetAFriendException("Just meet with a friend..."+value);
			}
		}
	}
}
