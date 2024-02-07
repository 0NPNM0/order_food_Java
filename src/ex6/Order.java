package ex6;

import java.util.List;

public class Order {
	private int id;
	private String consumer;
	private List<Integer> dishes_id;
	
	public Order(int id, String consumer, List<Integer> dishes_id) {
		super();
		this.id = id;
		this.consumer = consumer;
		this.dishes_id = dishes_id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getConsumer() {
		return consumer;
	}
	
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	
	public List<Integer> getDishesId(){
		return dishes_id;
	}
	
	public void setDishedId(List<Integer> dishes_id) {
		this.dishes_id = dishes_id;
	}
	
	public String toString() {
		return "Order ID: "+id+"\tName: "+consumer+"\tDishes ID: "+dishes_id.toString();
	}
}
