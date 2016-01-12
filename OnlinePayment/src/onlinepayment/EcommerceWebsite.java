package onlinepayment;

public class EcommerceWebsite {

	private PaymentMethod p=null;
	public void choosePayment(String type)
	{
		if(type=="cc")
		{
			 p = new CreditCardPayment();
		}
		else if(type=="cod")
		{
			 p = new CashOnDilevery();
		}
		else if (type=="dc")
		{
			 p = new DebitCardPayment();
		}
		
	}
	
	public void makePayment(double price)
	{
		p.Makepayment(price);
	}
	
}
