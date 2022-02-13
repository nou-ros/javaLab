class Bank{
	private long curBalance = 0;
	long bankID;
	String name;
	
	public long getBalance(long id){
		if(this.bankID == id){
			return curBalance;
		}
		return -1;
	}

	public void setBalance(long balance, long id){
		if(this.bankID == id){
			curBalance = curBalance + balance;
		}
	}
}


public class DataHiding{
	public static void main(String args[]){
		Bank obj = new Bank();
		obj.bankID = 12345;
		obj.name = "hello";
		obj.setBalance(10000, 12345);
		long balance = obj.getBalance(12345);

		System.out.println("User name: " + obj.name);
		System.out.println("Bank ID: " + obj.bankID);
		System.out.println("Current Balance " + balance);
	}
}
