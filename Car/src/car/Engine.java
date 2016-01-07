package car;

public class Engine implements PartsInterface{

	private int EngineNo;
	private double price;
	private CranckShaft cranck;
	
	public Engine(int engineNo, double price,CranckShaft cranck) {
		
		this.EngineNo = engineNo;
		this.price = price;
		this.cranck = cranck;
	}


	public int getEngineNo() {
		return EngineNo;
	}


	public double getPrice() {
		return price+cranck.getPrice();
	}
	
	
	
}
