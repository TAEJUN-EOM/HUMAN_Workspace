package lab.workshop.biz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import lab.workshop.entity.Product;

public class ShoppingBiz implements IShoppingBiz {
	private HashMap<Product, Integer> basket;
	
	public ShoppingBiz() {
		basket = new HashMap<Product, Integer>();
		basket.put(new Product("���", 1500), new Integer(6));
		basket.put(new Product("���",1200), new Integer(3));
		basket.put(new Product("�Ŀ���", 3500), new Integer(1));
		basket.put(new Product("����", 2400), new Integer(5));
	}

	@Override
	public void printAllProducts() {		
        System.out.println("-------------------------- ");
        System.out.println("����   ǰ���   �ܰ�  ���԰���");
        System.out.println("-------------------------- ");
        Set<Product> keys = basket.keySet();
        Iterator<Product> iter = keys.iterator();
        int no=1;
        while(iter.hasNext()) {
        	Product key = iter.next();
        	System.out.println(no++ +"   "+key.getName()+"   "+key.getPrice()+"   "+basket.get(key)+"��");
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
        			calculateTotalPriceByProduct(key, basket.get(key).intValue())+"��");
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
        System.out.println("�� ���� ���� : "+total+"��");
	}

}
