package car;

public class Tyre {

	private double price;
	private TyreRubber rubber;
	
	public Tyre(double price,TyreRubber rubber) {
		
		this.price = price;
		this.rubber = rubber;
	}

	public double getPrice() {
		return price+rubber.getPrice();
	}
	
	
}
