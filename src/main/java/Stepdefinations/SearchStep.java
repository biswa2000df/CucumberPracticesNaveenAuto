package Stepdefinations;





import org.testng.Assert;

import AmazonImpleamentation.Product;
import AmazonImpleamentation.Search;
import io.cucumber.java.en.*;

public class SearchStep {
	
	Product product;
	Search search;

	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1: I am on search page");
	}

	@When("i search for the product with name {string} and price {int}")
	public void i_search_for_the_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with the name :" + productName + " price: " + price);
		
		product=new Product(productName, price);
		
	}

	@Then("Product with name {string} should be Displayed.")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: product " + productName + " is displayed");
		
		search=new Search();
		String name = search.displayProduct(product);
		System.out.println("The Product name is = "+name);
		
		Assert.assertEquals(productName,name);
	}

}
