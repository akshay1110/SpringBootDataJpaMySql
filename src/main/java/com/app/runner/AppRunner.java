package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
      
		/*//save operation...
		repo.save(new Product(101,"s1",3.3));
		repo.save(new Product(102,"s2",4.4));
		repo.save(new Product(103,"s3",5.5));
		repo.save(new Product(104,"s4",6.6));
		repo.save(new Product(105,"s5",7.7));*/
		
		//update operation...
//		repo.save(new Product(101,"p2",6.6));
		
		/*//bulk insert
		List<Product> list=Arrays.asList(
              new Product(10,"s1",1.1),
              new Product(11,"s2",2.2),
              new Product(12,"s3",3.3)
				);
		repo.saveAll(list);*/
		
		//fetch one row
		/*Optional<Product> prod=repo.findById(10);
		if(prod.isPresent()) {
			Product p=prod.get();
			System.out.println(p);
		}else {
			System.out.println("row not found...");
		}*/

		//fetch all rows
		/*List<Product> list=repo.findAll();
		list.forEach(System.out::println);*/
		
		//delete operation...
		/*repo.deleteById(105);*/
		
		//delete all rows
		//repo.deleteAll();
		repo.deleteAllInBatch();
	}
	
	

}
