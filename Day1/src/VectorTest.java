import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5); //initalCapacity, incrementCapacity
		System.out.println("::::::::::::Vector������:::::::::::::");
		System.out.println("capacity : "+v.capacity ());
		System.out.println("size : "+v.size ());
		v.add("K3");
        v.add("K5");
        v.add("K7");
        v.add("K3");
        System.out.println(":::::::::::::��� �߰���::::::::::::::");
        System.out.println("capacity : "+v.capacity ());
		System.out.println("size : "+v.size ());
	}

}
