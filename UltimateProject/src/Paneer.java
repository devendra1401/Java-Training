
class Paneer {

	private double quantity;
	private double costPerKg;
	
	public Paneer(double quantity, double costPerKg) {
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
