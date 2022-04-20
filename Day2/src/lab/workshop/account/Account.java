package lab.workshop.account;

public class Account {
	private String custId;
	private String custName;
	private String accountNumber;
	private int balance;

	public Account() {
		super();
	}	

	public Account(String custId, String custName, String accountNumber, int balance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.accountNumber = accountNumber;
		if (balance < 1) {
			System.out.println("잔액 오류입니다. : "+ balance + "원 ");
		}else {
		this.balance = balance;
		}
	}


	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void addBalance(int balance) {
		if (balance < 1) {
			System.out.println("금액 오류입니다. : "+ balance + "원 ");
		}else {
			this.balance += balance;
		}
	}

	public void substractBalance(int balance) {
		if (balance < 1) {
			System.out.println("금액 오류입니다. : "+ this.balance + "원 ");
		}else  if (this.balance < balance){
			System.out.println(" 출금 불가!! 잔고가 부족합니다. ");
		}else  {
			this.balance -= balance;
		}
	}

	public void printAccount() {
		System.out.println("======================");
		System.out.println("고객번호 : "+this.custId);
		System.out.println("고객명 : "+this.custName);
		System.out.println("계좌번호 : "+ this.accountNumber);
		System.out.println("잔액 : "+ this.balance);
		System.out.println("======================");
	}
}







