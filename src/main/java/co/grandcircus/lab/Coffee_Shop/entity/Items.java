package co.grandcircus.lab.Coffee_Shop.entity;

public class Items {

	// fields
	private String name;
	private String description;
	private int quantity;
	private double price;
	
	// Constructors
	public Items() {}
	
	public Items(String name, String description, int quantity, double price) {
		setName(name);
		setDescription(description);
		setQuantity(quantity);
		setPrice(price);
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
