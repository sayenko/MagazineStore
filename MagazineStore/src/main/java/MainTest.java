import java.time.Instant;
import java.util.Date;

import ua.com.magazine_store.domain.Bucket;
import ua.com.magazine_store.domain.Product;
import ua.com.magazine_store.domain.User;
import ua.com.magazine_store.service.BucketService;
import ua.com.magazine_store.service.ProductService;
import ua.com.magazine_store.service.UserService;
import ua.com.magazine_store.service.impl.BucketServiceImpl;
import ua.com.magazine_store.service.impl.ProductServiceImpl;
import ua.com.magazine_store.service.impl.UserServiceImpl;

public class MainTest {
	
	public static void main(String[] args) {
		
		System.out.println("\n--------------User implemintation--------------\n");
		
		UserService userService = new UserServiceImpl();
		userService.create(new User("test1@test", "test1", "test1", "test1"));
		userService.create(new User("test2@test", "test2", "test2", "test2"));
		userService.create(new User("test3@test", "test3", "test3", "test3"));
		userService.create(new User("test4@test", "test4", "test4", "test4"));
		userService.create(new User("test5@test", "test5", "test5", "test5"));
		userService.create(new User("test6@test", "test6", "test6", "test6"));
		userService.update(new User(1, "test@email", "testFirstName", "testLastName", "testRole"));
		userService.delete(3);
		System.out.println(userService.read(2));
		System.out.println("-----------------------------------------------");
		userService.readAll().forEach(System.out::println);		
		
		System.out.println("\n------------Product implemintation-------------\n");
		
		ProductService productService = new ProductServiceImpl();
		productService.create(new Product("test1", "test1", 150.50));
		productService.create(new Product("test2", "test2", 250.50));
		productService.create(new Product("test3", "test3", 350.50));
		productService.create(new Product("test4", "test4", 150.50));
		productService.create(new Product("test5", "test5", 250.50));
		productService.create(new Product("test6", "test6", 350.50));
		productService.update(new Product(1, "testName", "testDescription", 160.25));
		productService.delete(3);
		System.out.println(productService.read(2));
		System.out.println("-----------------------------------------------");
		productService.readAll().forEach(System.out::println);
		
		System.out.println("\n-------------Bucket implemintation-------------\n");
		
		BucketService bucketService = new BucketServiceImpl();
		bucketService.create(new Bucket(1, 1, Date.from(Instant.now())));
		bucketService.create(new Bucket(2, 2, Date.from(Instant.now())));
		bucketService.create(new Bucket(5, 6, Date.from(Instant.now())));
		bucketService.create(new Bucket(6, 5, Date.from(Instant.now())));
		bucketService.create(new Bucket(4, 6, Date.from(Instant.now())));
		bucketService.create(new Bucket(2, 2, Date.from(Instant.now())));		
		bucketService.delete(3);
		System.out.println(bucketService.read(2));
		System.out.println("-----------------------------------------------");
		bucketService.readAll().forEach(System.out::println);
	}
}
