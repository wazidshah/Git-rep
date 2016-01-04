package atm;

public class CardReader {

	private int pin,cardno;
	protected boolean CorrectCard;
	
	Account a = new Account();
	private int accCardNo,accPinNo;
	
	
	
	public CardReader(DebitCard d, Account a) {
		this.pin = d.getPin();
		this.cardno = d.getCardno();
		this.accCardNo=a.getCardno();
		this.accPinNo=a.getPin();
		System.out.println(accCardNo);
		if(accCardNo==cardno)
		{
			if(accPinNo==pin)
			{
				CorrectCard = true;
			}
		}
	}
	
	
	public boolean isCorrectCard() {
		return CorrectCard;
	}

	
	
}
