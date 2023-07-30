class GasNotAvailableException extends RuntimeException{
	GasNotAvailableException(String msg){
		super(msg);
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