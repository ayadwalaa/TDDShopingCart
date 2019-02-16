import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

//BB
public class ShoppingCart {
	private List<Product> myProducts = new ArrayList <>();
	private double totalValue;

	public int getNumberOfProducts() {
		return myProducts.size();
		}
	//
	
	public double getTotalValue() {
		// TODO Auto-generated method stub
		if(myProducts.size()>0) {
			for(Product product: myProducts) {
				totalValue = totalValue+ product.getTotalPrice();}
			}
		return totalValue;
	}
	//
	

	public void addProduct(Product product) {
		myProducts.add(product);
	}
	
	}

