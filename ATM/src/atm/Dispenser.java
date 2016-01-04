package atm;

public class Dispenser 
{

	private double AtmCash =30000.00 ,withdrawCash,balance;

	public void setAtmCash(double atmCash) {
		AtmCash = atmCash;
	}

	
	
	public double getAtmCash() {
		return AtmCash;
	}



	Account a = new Account();
	
	
	public Dispenser(double withdrawCash,double balance) {
		this.withdrawCash = withdrawCash;
		this.balance=balance;
		if(checking()==true)
		{
			System.out.println("Transaction Success..");
		}
	}
	
	
	protected boolean checking()
	{
		if(withdrawCash < AtmCash)
		{
			
			if(withdrawCash < balance)
			{
				//System.out.println("Dukor is back");
				
				a.setBalance(balance - withdrawCash);
				setAtmCash(AtmCash - withdrawCash);
				return true;

			}
			else
			{
				
				return false;
			}
		}
		else
		{
			
			return false;
		}
	}
}
