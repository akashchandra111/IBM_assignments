import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.service.ProductService;

@TestInstance(Lifecycle.PER_CLASS)
class ProductTest {
	
	static ProductService service;
	static Product product;
	
	@BeforeAll
	void initializeAll()	{
		service = new ProductService();
		
		product.setId(1001);
		product.setName("iPhone");
		product.setCategory("Electronics");
		product.setDescription("Mobile Phone");
		product.setPrice(35000);
	}

//	@Test
//	@DisplayName("Check getting product service")
//	void getProductDetails() {
//		if(service.getProductDetails(1002) != null)
//	}
	
	@Test
	void testProduct()	{
		assertAll(
			()-> assertEquals(1001, product.getId(), "id failed!"),
			()-> assertEquals("iPhone", product.getName(), "name failed!"),
			()-> assertEquals("Electronics", product.getCategory(), "category failed!"),
			()-> assertEquals("Mobile Phone", product.getDescription(), "description failed!"),
			()-> assertEquals(35000, product.getPrice(), "price failed!")
		);
	}
	
	@Test
	void testService()	{
		assertAll(
			()-> assertEquals(product, service.getProductDetails(product.getId()), "product not found!"),
			()-> assertEquals(false, service.setProductDetails(product), "product was not found!"),
			()-> assertEquals(true, service.verifyProductId(product.getId()), "product id not found!")
		);
	}

// No need we are ultimately using service layer
//	@Test
//	void testDAO()	{
//		assertAll(
//			()-> assertEquals(product, )
//		);
//	}

}
