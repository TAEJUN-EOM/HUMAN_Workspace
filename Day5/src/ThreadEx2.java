
public class ThreadEx2 {

	public static void main(String[] args) {
		Car c = new Car(); 
		Producer producer = new Producer(c); 
		Thread tProducer = new Thread (producer);
		Customer customer = new Customer(c); 
		Thread tCustomer = new Thread (customer); 		
		Customer customer2 = new Customer(c); 
		Thread tCustomer2 = new Thread (customer); 
		tProducer.start(); 
		tCustomer.start(); 
		tCustomer2.start(); 
	}

}
