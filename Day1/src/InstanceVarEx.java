
public class InstanceVarEx {
    int num ;
	public static void main(String[] args) {
		InstanceVarEx ex = new InstanceVarEx();
		System.out.println(ex.num);
		ex.num+=100;
		System.out.println(ex.num);
		InstanceVarEx ex2 = new InstanceVarEx();
		System.out.println(ex2.num);
		ex.num-=100;
		System.out.println(ex2.num);
		ex = new InstanceVarEx();
		System.out.println(ex.num);
		ex.num+=50;
		System.out.println(ex.num);
		InstanceVarEx ex3 = new InstanceVarEx();
		System.out.println(ex3.num);
		ex.num++;
		System.out.println(ex3.num);
	}

}
