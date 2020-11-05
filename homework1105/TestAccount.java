import java.util.Date;

public class AccountTest {
	
	int id=0;
	double balance=0;
	double annualInteresRate=0;
	java.util.Date dateCreated;

	public AccountTest(){
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
	}

	public AccountTest(int id, double balance){
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
		this.id=id;
		this.balance=balance;
	}

	public int getId(){
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnualInterestRate() {
		return annualInteresRate;
	}

	public void setId(int id){
		this.id=id;
	}

	public void setBalance(double balance) {
		this.balance=balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInteresRate=annualInterestRate;
	}

	public String getDateCreated(){
		return dateCreated.toString();
		}

	public double getMonthlyInterestRate() {
		return annualInteresRate/12;
	}

	public double withDraw(double withdraw) {
		return this.balance=this.balance-withdraw;
	}

	public double deposit(double deposit) {
		return this.balance=this.balance+deposit;
	}

	public static void main(String[] args) {
		
		Account BankAccount=new Account( 1122, 20000 );
	    System.out.println("ID: "+ BankAccount.getId());
	    System.out.println("Initial Balance: "+BankAccount.getBalance()+"$");
		
	    BankAccount.setAnnualInterestRate(4.5/100);
		
		BankAccount.withDraw(2500);
		
		BankAccount.deposit(3000);

		System.out.println("Balance："+BankAccount.getBalance()+"$");
		System.out.println("MonthlyInterest："+BankAccount.getMonthlyInterestRate()*100+"%");   
		System.out.println("The time when the account is opened："+BankAccount.getDateCreated());

	}
}
