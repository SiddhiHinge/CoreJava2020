package Day3.Assignments3;

public class bankAccount {
	
	private String accHolderName;
	private String acctype;
	private double Amount;
	
	public bankAccount() {
		System.out.println("Your Account is created !");
	}
	
	public bankAccount(String accHolderName, String acctype, double Amount) {
		this();
		this.accHolderName = accHolderName;
		this.acctype = acctype;
		this.Amount = Amount;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double Amount) {
		this.Amount = Amount;
	}

	@Override
	public String toString() {
		return "Account Holder Name : " + accHolderName + "\nAccount Type : " + acctype + "\nAmount : " + Amount;
	}
	
}
