class VegetablesNotAvailableException extends Exception {
	VegetablesNotAvailableException(String msg){
		super(msg);
	}
}

class Vegetables{
	
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