
public class FlightTest {

	public static void main(String[] args) {
		CommercialFlight commFlight = new CommercialFlight();
		/*commFlight.checkTicket();
		commFlight.checkIdentityOfCPassengers();
		commFlight.fly();
		commFlight.land();*/
		
		System.out.println("-----------");
		
		FighterFlight fightFlight = new FighterFlight();
		/*fightFlight.armMissiles();
		fightFlight.fly();
		fightFlight.fireMissile();
		fightFlight.land();*/
		
		System.out.println("-----------");
		
		CargoFlight cargoFlight = new CargoFlight();
		/*cargoFlight.checkTheCapacity();
		cargoFlight.carryGoods();
		cargoFlight.fly();
		cargoFlight.land();*/
		
		RadarContorlSystem.checkFlyingObjects(commFlight);
		RadarContorlSystem.checkFlyingObjects(fightFlight);
		RadarContorlSystem.checkFlyingObjects(cargoFlight);
		
		GroundOperation.checkLandingStatus(commFlight);
		GroundOperation.checkLandingStatus(fightFlight);
		GroundOperation.checkLandingStatus(cargoFlight);
		
		/*	Flying f = commFlight;
		f.fly();
		
		f = fightFlight;
		
		f.fly();
		
		f  = cargoFlight;
		
		f.fly();*/
	}
}

class RadarContorlSystem{
	static void checkFlyingObjects(Flying x) {
		System.out.println("Checking Flying Objects...");
		x.fly();
	}
}

class GroundOperation{
	static void checkLandingStatus(Landing x) {
		System.out.println("Checking the Landing Objects...");
		x.land();
	}
}

interface Flying{
	void fly();
}

interface Landing{
	void land();
}

abstract class Flight implements Flying, Landing{
	
}

interface Ticketing{
	void checkTicket();
}

interface Fighting{
	void fireMissile();
}

interface Carrying{
	void carryGoods();
}

class CommercialFlight extends Flight implements Ticketing{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Commercial Flight is flying...");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Commercial Flight is landing...");
	}

	@Override
	public void checkTicket() {
		// TODO Auto-generated method stub
		System.out.println("Commercial Flight...checking tickets...");
	}
	
	void checkIdentityOfPassangers() {
		System.out.println("Commercial Flight is checking identity of passangers...");
	}
}

class FighterFlight extends Flight implements Fighting{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("FighterFlight Flight is flying...");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("FighterFlight is landing...");
	}

	@Override
	public void fireMissile() {
		// TODO Auto-generated method stub
		System.out.println("FighterFlight...firing missile...");
	}
	
	public void armMissile() {
		System.out.println("FighterFlight is arming the missiles...");
	}
}

class CargoFlight extends Flight implements Carrying{

	@Override
	public void fly() {
		System.out.println("CargoFlight Flight is flying...");
		
	}

	@Override
	public void land() {
		System.out.println("CargoFlight Flight is landing...");
		
	}

	@Override
	public void carryGoods() {
		System.out.println("CargoFlight  ... carrying goods....");		
	}
	
	void checkTheCapacity() {
		System.out.println("CargoFlight is checking the carriage capacit... ");
	}
}