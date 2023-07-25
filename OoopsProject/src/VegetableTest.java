
public class VegetableTest {

	public static void main(String[] args) {
		Gas gas = new Gas(0.02,200);
		Oil oil = new Oil(2,"Mahakosh",90);
		Water water = new Water("Soft",1,"27C");
		Salt salt = new Salt("MDH",10,0.1);
		TurmericPowder turmericPowder = new TurmericPowder("MDH",10,0.5);
		ChilliPowder chilliPowder = new ChilliPowder("MDH",10,2);
		GreenChilli greenChilli = new GreenChilli(0.2,20);
		Tomato tomato = new Tomato(0.3,15);
		Potato potato = new Potato(2,13);
		Onion onion = new Onion(0.4,16);
		
		Cooking cooking = new Cooking();
		
		FinalSabji finalSabji = cooking.cook(gas,oil,water,salt,turmericPowder,chilliPowder,greenChilli,tomato,potato,onion);
		
		System.out.println(finalSabji);
	}
}

class Cooking{
	FinalSabji cook(Gas gas, Oil oil, Water water, Salt salt, TurmericPowder turmericPowder, ChilliPowder chilliPowder,
			GreenChilli greenChilli, Tomato tomato, Potato potato, Onion onion) {
		
		FinalSabji finalSabji = new FinalSabji();
	
		finalSabji.setTimeRequired(30);
		finalSabji.setWaterUsed(water.getQuantity());
		finalSabji.setOilUsed(oil.getQuantity());
		finalSabji.setGasUsed(gas.getQuantity());
		
		double cost = (oil.getQuantity()*oil.getCostPerLt()) + (salt.getQuantity()*salt.getCostPerGram())
				+(turmericPowder.getQuantity()*turmericPowder.getCostPerGram()) + 
				(chilliPowder.getQuantity()*chilliPowder.getCostPerGram()) +
				(greenChilli.getQuantity()*greenChilli.getCostPerKg()) +
				(tomato.getQuantity()*tomato.getCostPerKg()) +
				(potato.getQuantity()*potato.getCostPerKg()) +
				(onion.getQuantity()*onion.getCostPerKg());
		
		finalSabji.setTotalCost(cost);
		
		return finalSabji;
	}
}

class FinalSabji{
	private double timeRequired;
	private double waterUsed;
	private double oilUsed;
	private double gasUsed;
	private double totalCost;
	
	public FinalSabji(){
	}
	
	public FinalSabji(double timeRequired, double waterUsed, double oilUsed, double gasUsed, double totalCost) {
		super();
		this.timeRequired = timeRequired;
		this.waterUsed = waterUsed;
		this.oilUsed = oilUsed;
		this.gasUsed = gasUsed;
		this.totalCost = totalCost;
	}

	public double getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(double timeRequired) {
		this.timeRequired = timeRequired;
	}

	public double getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(double waterUsed) {
		this.waterUsed = waterUsed;
	}

	public double getOilUsed() {
		return oilUsed;
	}

	public void setOilUsed(double oilUsed) {
		this.oilUsed = oilUsed;
	}

	public double getGasUsed() {
		return gasUsed;
	}

	public void setGasUsed(double gasUsed) {
		this.gasUsed = gasUsed;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "FinalSabji [timeRequired=" + timeRequired + ", waterUsed=" + waterUsed + ", oilUsed=" + oilUsed
				+ ", gasUsed=" + gasUsed + ", totalCost=" + totalCost + "]";
	}
	
}

class Gas{
	private double quantity;
	private double costPerLt;
	
	public Gas(double quantity, double costPerLt) {
		super();
		this.quantity = quantity;
		this.costPerLt = costPerLt;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getCostPerLt() {
		return costPerLt;
	}

	public void setCostPerLt(double costPerLt) {
		this.costPerLt = costPerLt;
	}

	@Override
	public String toString() {
		return "Gas [quantity=" + quantity + ", costPerLt=" + costPerLt + "]";
	}
	
}

class Vegetables{
	
}

class Oil{
	private int quantity;
	private String brand;
	private float costPerLt;
	
	public Oil(int quantity, String brand, float costPerLt) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.costPerLt = costPerLt;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getCostPerLt() {
		return costPerLt;
	}

	public void setCostPerLt(float costPerLt) {
		this.costPerLt = costPerLt;
	}

	@Override
	public String toString() {
		return "Oil [quantity=" + quantity + ", brand=" + brand + ", costPerLt=" + costPerLt + "]";
	}
	
}

class Water{
	private String type;
	private int quantity;
	private String temperature;
	
	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	
}

class VegPowder{
	private String brand;

	public VegPowder(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "VegPowder [brand=" + brand + "]";
	}
	
}

class Salt extends VegPowder{
	private int quantity;
	private double costPerGram;
	
	public Salt(String brand, int quantity, double costPerGram) {
		super(brand);
		this.quantity = quantity;
		this.costPerGram = costPerGram;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCostPerGram() {
		return costPerGram;
	}

	public void setCostPerGram(double costPerGram) {
		this.costPerGram = costPerGram;
	}

	@Override
	public String toString() {
		return "Salt [quantity=" + quantity + ", costPerGram=" + costPerGram + "]";
	}
	
}

class TurmericPowder extends VegPowder{
	private int quantity;
	private double costPerGram;
	
	public TurmericPowder(String brand, int quantity, double costPerGram) {
		super(brand);
		this.quantity = quantity;
		this.costPerGram = costPerGram;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCostPerGram() {
		return costPerGram;
	}

	public void setCostPerGram(double costPerGram) {
		this.costPerGram = costPerGram;
	}

	@Override
	public String toString() {
		return "TurmericPowder [quantity=" + quantity + ", costPerGram=" + costPerGram + "]";
	}
	
}

class ChilliPowder extends VegPowder{
	private int quantity;
	private double costPerGram;
	
	public ChilliPowder(String brand, int quantity, double costPerGram) {
		super(brand);
		this.quantity = quantity;
		this.costPerGram = costPerGram;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCostPerGram() {
		return costPerGram;
	}

	public void setCostPerGram(double costPerGram) {
		this.costPerGram = costPerGram;
	}

	@Override
	public String toString() {
		return "ChilliPowder [quantity=" + quantity + ", costPerGram=" + costPerGram + "]";
	}
	
}

class GreenChilli extends Vegetables{
	private double quantity;
	private double costPerKg;
	
	public GreenChilli(double quantity, double costPerKg) {
		super();
		this.quantity = quantity;
		this.costPerKg = costPerKg;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getCostPerKg() {
		return costPerKg;
	}

	public void setCostPerKg(double costPerKg) {
		this.costPerKg = costPerKg;
	}

	@Override
	public String toString() {
		return "GreenChilli [quantity=" + quantity + ", costPerKg=" + costPerKg + "]";
	}
	
}

class Tomato extends Vegetables{
	private double quantity;
	private double costPerKg;
	
	public Tomato(double quantity, double costPerKg) {
		super();
		this.quantity = quantity;
		this.costPerKg = costPerKg;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getCostPerKg() {
		return costPerKg;
	}

	public void setCostPerKg(double costPerKg) {
		this.costPerKg = costPerKg;
	}

	@Override
	public String toString() {
		return "Tomato [quantity=" + quantity + ", costPerKg=" + costPerKg + "]";
	}
	
}

class Potato extends Vegetables{
	private double quantity;
	private double costPerKg;
	
	public Potato(double quantity, double costPerKg) {
		super();
		this.quantity = quantity;
		this.costPerKg = costPerKg;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getCostPerKg() {
		return costPerKg;
	}
	public void setCostPerKg(double costPerKg) {
		this.costPerKg = costPerKg;
	}
	@Override
	public String toString() {
		return "Potato [quantity=" + quantity + ", costPerKg=" + costPerKg + "]";
	}
	
}

class Onion extends Vegetables{
	private double quantity;
	private double costPerKg;
	
	public Onion(double quantity, double costPerKg) {
		super();
		this.quantity = quantity;
		this.costPerKg = costPerKg;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getCostPerKg() {
		return costPerKg;
	}

	public void setCostPerKg(double costPerKg) {
		this.costPerKg = costPerKg;
	}

	@Override
	public String toString() {
		return "Onion [quantity=" + quantity + ", costPerKg=" + costPerKg + "]";
	}
	
}