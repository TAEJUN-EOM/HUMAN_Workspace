package lab.workshop.biz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import lab.workshop.entity.Product;

public class ShoppingBiz implements IShoppingBiz {
	private HashMap<Product, Integer> basket;
	
	public ShoppingBiz() {
		basket = new HashMap<Product, Integer>();
		basket.put(new Product("사과", 1500), new Integer(6));
		basket.put(new Product("라면",1200), new Integer(3));
		basket.put(new Product("식용유", 3500), new Integer(1));
		basket.put(new Product("과자", 2400), new Integer(5));
	}

	@Override
	public void printAllProducts() {		
        System.out.println("-------------------------- ");
        System.out.println("순번   품목명   단가  구입개수");
        System.out.println("-------------------------- ");
        Set<Product> keys = basket.keySet();
        Iterator<Product> iter = keys.iterator();
        int no=1;
        while(iter.hasNext()) {
        	Product key = iter.next();
        	System.out.println(no++ +"   "+key.getName()+"   "+key.getPrice()+"   "+basket.get(key)+"개");
        }
        
        
        
        System.out.println("--------------------------- ");
	}

	@Override
	public void printPricePerProduct() {
		System.out.println("--------------------");
		int no=1;
		Set<Product> keys = basket.keySet();
        Iterator<Product> iter = keys.iterator();
        while(iter.hasNext()) {
        	Product key = iter.next();
        	System.out.println(no++ +"."+key.getName()+":"+
        			calculateTotalPriceByProduct(key, basket.get(key).intValue())+"원");
        }
		System.out.println("--------------------");

	}
	private int calculateTotalPriceByProduct(Product product, int count) {
		return product.getPrice()*count;
	}

	@Override
	public void calculateTotalPrice() {		
        int total =0;
		Set<Product> keys = basket.keySet();
        Iterator<Product> iter = keys.iterator();
        while(iter.hasNext()) {
        	Product key = iter.next();
        	total+=calculateTotalPriceByProduct(key, basket.get(key).intValue());
        }
        System.out.println("총 구입 가격 : "+total+"원");
	}

}
