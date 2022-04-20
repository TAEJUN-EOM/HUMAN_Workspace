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
		System.out.println("------------------- 고객 정보 --------------------");
		 for (int i=0;i<customers.size();i++) {
			 Customer c = customers.get(i);
			 System.out.printf("%1$d.[이름]%2$-6s[나이]%3$-6s[전화번호]%4$-15s\n",
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
		 System.out.println("새로운 고객 정보를 추가합니다");
		 System.out.println("새로운 고객의 정보를 입력하세요");
		 System.out.println("-------------------------- ");
		 System.out.print(">이름 :");
		 String name = CustomerUtil.getUserInput();
		 System.out.print(">나이 :");
		 int age = Integer.parseInt(CustomerUtil.getUserInput());
		 System.out.print(">전화번호 :");
		 String phone = CustomerUtil.getUserInput();
		 customers.add(new Customer(name, age, phone));
		 System.out.println("@고객 정보를 추가하였습니다. ");
		 System.out.println("-------------------------- ");
	}

	@Override
	public void deleteCustomer() {
		System.out.println("-------------------------- ");
		 System.out.println("고객 정보를 삭제합니다");
		 System.out.println("삭제할 고객의 정보를 입력하세요");
		 System.out.println("-------------------------- ");
		 System.out.print(">번호 :");
		 int no = Integer.parseInt(CustomerUtil.getUserInput());
		 customers.remove(no-1); //ArrayList에 저장된 순서번호는 0부터 시작하므로
		 System.out.println("@"+no+"번 고객 정보를 삭제하였습니다.");
		 System.out.println("-------------------------- ");

	}

}
