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
			System.out.println("�ܾ� �����Դϴ�. : "+ balance + "�� ");
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
			System.out.println("�ݾ� �����Դϴ�. : "+ balance + "�� ");
		}else {
			this.balance += balance;
		}
	}

	public void substractBalance(int balance) {
		if (balance < 1) {
			System.out.println("�ݾ� �����Դϴ�. : "+ this.balance + "�� ");
		}else  if (this.balance < balance){
			System.out.println(" ��� �Ұ�!! �ܰ� �����մϴ�. ");
		}else  {
			this.balance -= balance;
		}
	}

	public void printAccount() {
		System.out.println("======================");
		System.out.println("����ȣ : "+this.custId);
		System.out.println("���� : "+this.custName);
		System.out.println("���¹�ȣ : "+ this.accountNumber);
		System.out.println("�ܾ� : "+ this.balance);
		System.out.println("======================");
	}
}







