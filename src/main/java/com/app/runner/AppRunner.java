package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
      
		/*//A...save operation...
		repo.save(new Product(101,"s1",3.3));
		repo.save(new Product(102,"s2",4.4));
		repo.save(new Product(103,"s3",5.5));
		repo.save(new Product(104,"s4",6.6));
		repo.save(new Product(105,"s5",7.7));*/
		
		//B...update operation...
//		repo.save(new Product(101,"p2",6.6));
		
		//C...bulk insert
		/*List<Product> list=Arrays.asList(
              new Product(10,"s1",1.1),
              new Product(11,"s2",2.2),
              new Product(12,"s3",3.3)
				);
		repo.saveAll(list);*/
		
		//D...fetch one row
		/*Optional<Product> prod=repo.findById(10);
		if(prod.isPresent()) {
			Product p=prod.get();
			System.out.println(p);
		}else {
			System.out.println("row not found...");
		}*/

		//E...fetch all rows
		/*List<Product> list=repo.findAll();
		list.forEach(System.out::println);*/
		
		//F...delete operation...
		/*repo.deleteById(105);*/
		
		//G...delete all rows
		//repo.deleteAll();
		//repo.deleteAllInBatch();
		
		//H...check data exist..
		//  boolean b=repo.existsById(60);
		 // System.out.println("result:"+b);
		
		//I...count..
		//long l=repo.count();
		//System.out.println(l);
		
		//J...findBy(Sort)
		//repo.findAll(Sort.by(Direction.DESC,"prodCode")).forEach(System.out::println);
		
		//K...findAll(Pageable)
        //1...repo.findAll(PageRequest.of(2,3)).forEach(System.out::println);	
		/*2==pageNum and 3==pageSize..*/
       //2...repo.findAll(PageRequest.of(0, 3, Sort.by(Direction.DESC,"prodCode"))).forEach(System.out::println);
              /*first get DESC order then print page Size and page num...*/     
		//3...repo.findAll(PageRequest.of(2,3,Direction.DESC,"prodCode")).forEach(System.out::println);
		    
		//L...findAll(Example)
		//Product p=new Product();
		//p.setProdCost(2.2);
		//Example<Product> ex=Example.of(p);
		//1...repo.findAll(ex).forEach(System.out::println);
		//2...repo.findAll(ex,Sort.by(Direction.DESC,"prodCode")).forEach(System.out::println);
		//3...repo.findAll(ex,PageRequest.of(2,1)).forEach(System.out::println);
		
		//M...findByIDs
		repo.findAllById(Arrays.asList(12,14,16,18)).forEach(System.out::println);
	}
	
	

}
