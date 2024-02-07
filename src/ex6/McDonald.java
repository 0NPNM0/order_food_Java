package ex6;

import java.util.HashMap;
import java.util.Map;

public class McDonald {
	Map<Integer, Dishes> map = new HashMap();
	
	public McDonald() {
		map.put(0, new Dishes(0,"bigMAC hamburger",54.00,5));
		map.put(1, new Dishes(1,"mushroom anges",50.50,5));
		map.put(2, new Dishes(2,"cheese anges",46.00,5));
		map.put(3, new Dishes(3,"fried chicken",20.00,5));
		map.put(4, new Dishes(4,"small chips",9.00,5));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Dishes dishes:map.values()) {
			sb.append(dishes.toString()+"\r\n");
		}
		return sb.toString();
	}
	
	public synchronized void addOrder(Order order)throws InterruptedException {
		boolean flag;
		
		do {
			flag = true;
			for(int id: order.getDishesId()) {
				Dishes dishes = map.get(id);
				if(dishes.getNum() == 0) {
					flag = false;
				}
			}
			
			if(!flag) {
				System.out.println(Thread.currentThread().getName()+"The food you ordered had been sold out, please wait");
				System.out.println(order);
				wait();
			}
		}while(!flag);
		
		System.out.print(Thread.currentThread().getName());
		
		for(int id:order.getDishesId()) {
			Dishes dishes = map.get(id);
			if(dishes.getNum()>0) {
				dishes.setNum(dishes.getNum()-1);
				System.out.print("\tDishes ID: "+dishes.getId()+" \tName: "+dishes.getName());
			}
		}
		
		System.out.println();
		System.out.println(this);//toString()
		notify();
	}
}
