package ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
	public static void main(String args[]) {
		McDonald m = new McDonald();
		Random r = new Random();
		
		for(int i = 0; i<20; i++) {
			List<Integer> dishes_id = new ArrayList<Integer>();
			dishes_id.add(r.nextInt(5));
			dishes_id.add(r.nextInt(5));
			
			final Order order = new Order(i,"consumer "+i,dishes_id);
			
			new Thread() {
				public void run() {
					try {
						m.addOrder(order);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
}
