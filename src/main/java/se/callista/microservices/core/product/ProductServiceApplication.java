package se.callista.microservices.core.product;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.hazelcast.core.HazelcastInstance;

import se.callista.microservices.core.product.idummy.IDummyBean;
import se.callista.microservices.core.product.model.Product;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public class ProductServiceApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ProductServiceApplication.class, args);
		new SpringApplicationBuilder().profiles("member").sources(ProductServiceApplication.class).run(args);
	}

	@Bean
	public CacheManager cacheManager() {
		ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager("products");

		return cacheManager;
	}

}
