class PaneerSabji extends Thread{
	private long timeRequired;
	private double waterUsed;
	private double oilUsed;
	private double gasUsed;
	private double totalCost;
	boolean oilAvailable = true;
	boolean vegPowderAvailable = true;
	boolean vegtablesAvailable = true;
	
	public PaneerSabji() throws OilNotAvailablException, VegPowderNotAvailableException, VegetablesNotAvailableException{
		
		double value = Math.random()%10;
		
		if(value<0.09) {
			oilAvailable = false;
		}
		if(oilAvailable == true) {
			System.out.println("Oil Available...");
		}
		else {
			throw new OilNotAvailablException("Oil is not Available..."+value);
		}
		
		if(value<0.11) {
			vegPowderAvailable = false;
		}
		if(vegPowderAvailable == true) {
			System.out.println("All veg powders are available...");
		}
		else {
			throw new VegPowderNotAvailableException("Veg Powders are not available...");
		}
		
		if(value<0.15) {
			vegtablesAvailable = false;
		}
		if(vegtablesAvailable == true) {
			System.out.println("Vegatables are Available...\n");
		}
		else {
			throw new VegetablesNotAvailableException("Vegetables are not Available...");
		}
		
	}
	
	public PaneerSabji(long timeRequired, double waterUsed, double oilUsed, double gasUsed, double totalCost) {
		super();
		this.timeRequired = timeRequired;
		this.waterUsed = waterUsed;
		this.oilUsed = oilUsed;
		this.gasUsed = gasUsed;
		this.totalCost = totalCost;
	}
	
	public void run() {
		for(int i=1;i<=timeRequired;i++) {
			System.out.println("PaneerSabji is being prepared..."+i+"\n");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public double getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(long timeRequired) {
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
		return "PaneerSabji [timeRequired=" + timeRequired + ", waterUsed=" + waterUsed + ", oilUsed=" + oilUsed
				+ ", gasUsed=" + gasUsed + ", totalCost=" + totalCost + "]\n";
	}
	
}
