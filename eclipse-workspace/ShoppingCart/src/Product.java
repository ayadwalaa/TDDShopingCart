
public class Product {
	private String productName;
	private int quantity;
	private double totalPrice;
	
public Product(String Name, int amount, double price) {
	this.productName = Name;
	this.quantity = amount;
	this.totalPrice = price;
}
public void setProductName(String Name) {
	this.productName=Name;
}
public String getProductName() {
	return this.productName;
}
public void setQuantity(int amount) {
	this.quantity = amount;
}
public int getQuantity() {
	return this.quantity;
}
public void setPrice(double price) {
	this.totalPrice = price;
}
public double getPrice() {
	return this.totalPrice;
}
}
