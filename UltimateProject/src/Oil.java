class OilNotAvailablException extends Exception{
	OilNotAvailablException(String msg){
		super(msg);
	}
}

class Oil{
	private double quantity;
	private String brand;
	private double costPerLt;
	
	public Oil(double quantity, String brand, double costPerLt) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.costPerLt = costPerLt;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCostPerLt() {
		return costPerLt;
	}

	public void setCostPerLt(double costPerLt) {
		this.costPerLt = costPerLt;
	}

	@Override
	public String toString() {
		return "Oil [quantity=" + quantity + ", brand=" + brand + ", costPerLt=" + costPerLt + "]";
	}
	
}