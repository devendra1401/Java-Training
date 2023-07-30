class VegPowderNotAvailableException extends Exception{
	VegPowderNotAvailableException(String msg){
		super(msg);
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
	private double quantity;
	private double costPerGram;
	
	public Salt(String brand, double quantity, double costPerGram) {
		super(brand);
		this.quantity = quantity;
		this.costPerGram = costPerGram;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
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
	private double quantity;
	private double costPerGram;
	
	public TurmericPowder(String brand, double quantity, double costPerGram) {
		super(brand);
		this.quantity = quantity;
		this.costPerGram = costPerGram;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
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
	private double quantity;
	private double costPerGram;
	
	public ChilliPowder(String brand, double quantity, double costPerGram) {
		super(brand);
		this.quantity = quantity;
		this.costPerGram = costPerGram;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
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