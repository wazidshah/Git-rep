package car;

public class CarTest {

	public static void main(String[] args) {
		
		CranckShaft cr = new CranckShaft(2);
		CarbonTub ct = new CarbonTub(1);
		TyreRubber tr = new TyreRubber(1);
		
		Chassis ch = new Chassis(1534, 3,ct);
		Tyre t = new Tyre(1,tr);
		DriveShaft d = new DriveShaft(478956, 3);
		Engine e = new Engine(02356, 1,cr);
		
		
		Car c = new Car(e, d, ch, t);
		
		System.out.println("Total price of the car is :"+c.totalPrice() +"$");
	}

}
