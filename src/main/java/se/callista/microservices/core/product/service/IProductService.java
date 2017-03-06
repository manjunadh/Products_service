package se.callista.microservices.core.product.service;

import java.util.Collection;

import se.callista.microservices.core.product.model.Product;

public interface IProductService {
	Collection<Product> getAllProducts();

	Product getProduct(String id);

	void addProduct(Product product);

	void updateProduct(String id, Product product);

	void deleteProduct(String id);

	void evictCache();
}
