package lab.workshop.biz;

import java.util.ArrayList;

import lab.workshop.entity.Customer;
import lab.workshop.util.CustomerUtil;

public class CustomerBiz implements ICustomerBiz {
	private ArrayList<Customer> customers ;
	@Override
	public void initializeCustomer() {
		customers  = new ArrayList<Customer>();
		insertCustomer(new Customer("Lee", 28, "010-5678-1234")  ) ;
		insertCustomer(new Customer("Park", 31, "010-4567-9876")  ) ;
		insertCustomer(new Customer("Choi", 25, "010-1111-2222")   ) ;
	}

	@Override
	public void printAllCustomer() {
		System.out.println("------------------- �� ���� --------------------");
		 for (int i=0;i<customers.size();i++) {
			 Customer c = customers.get(i);
			 System.out.printf("%1$d.[�̸�]%2$-6s[����]%3$-6s[��ȭ��ȣ]%4$-15s\n",
					 (i+1), c.getName(), c.getAge(), c.getPhone());
		 }
		 System.out.println("-----------------------------------------------");
	}
	@Override
	public void insertCustomer(Customer customer) {
		customers.add(customer);
	}

	@Override
	public void insertCustomer() {		 
		 System.out.println("-------------------------- ");
		 System.out.println("���ο� �� ������ �߰��մϴ�");
		 System.out.println("���ο� ���� ������ �Է��ϼ���");
		 System.out.println("-------------------------- ");
		 System.out.print(">�̸� :");
		 String name = CustomerUtil.getUserInput();
		 System.out.print(">���� :");
		 int age = Integer.parseInt(CustomerUtil.getUserInput());
		 System.out.print(">��ȭ��ȣ :");
		 String phone = CustomerUtil.getUserInput();
		 customers.add(new Customer(name, age, phone));
		 System.out.println("@�� ������ �߰��Ͽ����ϴ�. ");
		 System.out.println("-------------------------- ");
	}

	@Override
	public void deleteCustomer() {
		System.out.println("-------------------------- ");
		 System.out.println("�� ������ �����մϴ�");
		 System.out.println("������ ���� ������ �Է��ϼ���");
		 System.out.println("-------------------------- ");
		 System.out.print(">��ȣ :");
		 int no = Integer.parseInt(CustomerUtil.getUserInput());
		 customers.remove(no-1); //ArrayList�� ����� ������ȣ�� 0���� �����ϹǷ�
		 System.out.println("@"+no+"�� �� ������ �����Ͽ����ϴ�.");
		 System.out.println("-------------------------- ");

	}

}
