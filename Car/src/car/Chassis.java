package car;

public class Chassis {

	private int chassis_no;
	private double price;
	private CarbonTub tub;
	
	
	public Chassis(int chassis_no, double price,CarbonTub tub) {
		this.chassis_no = chassis_no;
		this.price = price;
		this.tub = tub;
	}

	public int getChassis_no() {
		return chassis_no;
	}

	

	public double getPrice() {
		return price + tub.getPrice();
	}

	
	
	
}
