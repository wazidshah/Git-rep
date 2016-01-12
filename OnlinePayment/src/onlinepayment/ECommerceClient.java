package onlinepayment;

public class ECommerceClient {

	
	public static void main(String []args){
		
		Item i = new Item(20);
		EcommerceWebsite flipkart = new EcommerceWebsite();
		
		flipkart.choosePayment("cc");
		
		flipkart.makePayment(i.getPrice());
		
		
	}
	
}
