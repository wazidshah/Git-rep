package car;

public class Car {

	private int EngineNo,DriveShaftNo,ChassisNo;
	private double ChassisPrice,EnginePrice,TyrePrice,DriveShaftPrice;
	
	
	
	public Car(Engine engine, DriveShaft driveshaft, Chassis chassis, Tyre tyre) 
	{

		EngineNo = engine.getEngineNo();
		DriveShaftNo = driveshaft.getDriveShaftNo();
		ChassisNo = chassis.getChassis_no();
		ChassisPrice = chassis.getPrice();
		EnginePrice = engine.getPrice();
		TyrePrice = tyre.getPrice();
		DriveShaftPrice = driveshaft.getPrice();
	}
	
	
	public double totalPrice()
	{
		double totalprice=0.0;
		
		totalprice = EnginePrice+DriveShaftPrice+TyrePrice+ChassisPrice;
		
		return totalprice;
		
	}
	
	
}
