public class Restaurant {

	public static void main(String[] args) throws InterruptedException {
		Gas gas = new Gas(0.2
				,200);
		Oil oil = new Oil(0.3,"Mahakosh",90);
		Water water = new Water("Soft",1,"27C");
		Salt salt = new Salt("MDH",10,0.1);
		TurmericPowder turmericPowder = new TurmericPowder("MDH",10,0.5);
		ChilliPowder chilliPowder = new ChilliPowder("MDH",10,2);
		GreenChilli greenChilli = new GreenChilli(0.2,20);
		Tomato tomato = new Tomato(0.3,15);
		Potato potato = new Potato(2,13);
		Onion onion = new Onion(0.4,16);
		Paneer paneer = new Paneer(0.5,180);
		Cooking cooking = new Cooking();
		
		AlooSabji alooSabji;
		PaneerSabji paneerSabji;
		
		
		try {
			
			System.out.println("Checking for Aloo Sabji");
			alooSabji = cooking.cookAlooSabji(gas,oil,water,salt,turmericPowder,chilliPowder,greenChilli,tomato,potato,onion);
			
			System.out.println("Checking for Paneer Sabji");
			paneerSabji = cooking.cookPaneerSabji(gas,oil,water,salt,turmericPowder,chilliPowder,greenChilli,tomato,paneer,onion);
			
			alooSabji.start();
			paneerSabji.start();
			
			alooSabji.join();
			paneerSabji.join();
			
			System.out.println(alooSabji);
			
			
			System.out.println(paneerSabji);
			
		} catch (OilNotAvailablException | VegPowderNotAvailableException | VegetablesNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
//		try {
//			
//			
//		} catch (OilNotAvailablException | VegPowderNotAvailableException | VegetablesNotAvailableException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}

class Cooking{
	AlooSabji cookAlooSabji(Gas gas, Oil oil, Water water, Salt salt, TurmericPowder turmericPowder, ChilliPowder chilliPowder,
			GreenChilli greenChilli, Tomato tomato, Potato potato, Onion onion) 
					throws OilNotAvailablException, VegPowderNotAvailableException, VegetablesNotAvailableException {
		
		
		double value = Math.random()%10;
		if(value>0.95) {
			throw new GasNotAvailableException("Oh No!! Gas has been over....");
		}
		
		AlooSabji alooSabji = new AlooSabji();
	
		alooSabji.setTimeRequired(20);
		alooSabji.setWaterUsed(water.getQuantity());
		alooSabji.setOilUsed(oil.getQuantity());
		alooSabji.setGasUsed(gas.getQuantity());
		
		double cost = (gas.getQuantity()*gas.getCostPerLt())+(oil.getQuantity()*oil.getCostPerLt()) + (salt.getQuantity()*salt.getCostPerGram())
				+(turmericPowder.getQuantity()*turmericPowder.getCostPerGram()) + 
				(chilliPowder.getQuantity()*chilliPowder.getCostPerGram()) +
				(greenChilli.getQuantity()*greenChilli.getCostPerKg()) +
				(tomato.getQuantity()*tomato.getCostPerKg()) +
				(potato.getQuantity()*potato.getCostPerKg()) +
				(onion.getQuantity()*onion.getCostPerKg());
		
		alooSabji.setTotalCost(cost);
		
		return alooSabji;
	}
	
	PaneerSabji cookPaneerSabji(Gas gas, Oil oil, Water water, Salt salt, TurmericPowder turmericPowder, ChilliPowder chilliPowder,
			GreenChilli greenChilli, Tomato tomato, Paneer paneer, Onion onion) 
					throws OilNotAvailablException, VegPowderNotAvailableException, VegetablesNotAvailableException {
		
		
		double value = Math.random()%10;
		if(value>0.95) {
			throw new GasNotAvailableException("Oh No!! Gas has been over....");
		}
		
		PaneerSabji paneerSabji = new PaneerSabji();
	
		paneerSabji.setTimeRequired(30);
		paneerSabji.setWaterUsed(water.getQuantity());
		paneerSabji.setOilUsed(oil.getQuantity());
		paneerSabji.setGasUsed(gas.getQuantity());
		
		double cost = (gas.getQuantity()*gas.getCostPerLt())+(oil.getQuantity()*oil.getCostPerLt()) + (salt.getQuantity()*salt.getCostPerGram())
				+(turmericPowder.getQuantity()*turmericPowder.getCostPerGram()) + 
				(chilliPowder.getQuantity()*chilliPowder.getCostPerGram()) +
				(greenChilli.getQuantity()*greenChilli.getCostPerKg()) +
				(tomato.getQuantity()*tomato.getCostPerKg()) +
				(paneer.getQuantity()*paneer.getCostPerKg()) +
				(onion.getQuantity()*onion.getCostPerKg());
		
		paneerSabji.setTotalCost(cost);
		
		return paneerSabji;
	}
}

