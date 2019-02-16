import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> myProducts = new ArrayList <>();
	private double totalValue;
	public int getNumberOfProducts() {
		return 0;
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		myProducts.add(product);
		
	}

	public double getTotalValue() {
		// TODO Auto-generated method stub
		if(myProducts.size()>0) {
			for(Product product: myProducts) {
				totalValue = totalValue+ product.getPrice();}
			}
		return totalValue;
	}
	

}
