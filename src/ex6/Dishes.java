package ex6;

public class Dishes {
	private int id;
	private String name;
	private int num;
	private double price;
	
	public Dishes(int id, String name, double price, int num){
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.num = num;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "dish ID: "+id+"\tName: "+name+"\tPrice: "+price+"\tNumber: "+num;
	}
}
