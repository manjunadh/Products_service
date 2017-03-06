package se.callista.microservices.core.product.idummy;

import java.util.List;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import se.callista.microservices.core.product.model.Product;

public interface IDummyBean {

	@Cacheable("product") // (1)
	List<Product> getProduct();

	@CachePut(value = "product", key = "#product + 1") // (2)
	List<Product> setProduct(String city);

	

}
