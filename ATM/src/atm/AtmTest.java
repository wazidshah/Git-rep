package atm;



public class AtmTest {

	public static void main(String[] args) {
		Account acc = new Account(20000,256,1234);

		DebitCard d = new DebitCard(1234,256);
		
		
		
		CardReader c =new CardReader(d,acc);
		
		//if(c.isCorrectCard() == true)
		//{
		Dispenser di = new Dispenser(1000,acc.getBalance());
		System.out.println(acc.getCardno() +" "+ d.getCardno() +" "+acc.getPin()+" "+d.getPin());
		
		System.out .println(di.checking() +" "+ acc.getBalance() +" "+c.isCorrectCard()+" "+di.getAtmCash());
		//}
		
		

		
	}

}
