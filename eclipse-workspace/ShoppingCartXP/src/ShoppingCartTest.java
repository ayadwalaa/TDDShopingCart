import static org.junit.jupiter.api.Assertions.*;
//import org.junit.Assert;
//import org.junit.Test;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ShoppingCartTest {

	@Test
	void CreateEmptyCart() {
		ShoppingCart cart= new ShoppingCart();
		Assert.assertEquals(0, cart.getNumberOfProducts());
	}
	@Test
	void AddSingleProduct() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product ("Java Book", 1, 127.0);
		cart.addProduct(product);
		Assert.assertEquals(1, cart.getNumberOfProducts());
		Assert.assertEquals(127.0, cart.getTotalValue());
	}
   @Test
	void AddOthers() {
		ShoppingCart cart = new ShoppingCart();
		Product product1= new Product("Java Book",1,127.0);
		Product product2 = new Product("Web Book", 1, 100.0);
		cart.addProduct(product2);
		cart.addProduct(product1);
		Assert.assertEquals(2, cart.getNumberOfProducts());
		Assert.assertEquals(227.0, cart.getTotalValue());
		
	}

}
