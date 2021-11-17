package com.example.springmvc.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springmvc.model.Category;
import com.example.springmvc.model.Product;
import com.example.springmvc.model.Unit;
import com.example.springmvc.repository.CategoryRepository;
import com.example.springmvc.repository.ProductRepository;
import com.example.springmvc.repository.UnitRepository;

@Component
public class DataLoader implements CommandLineRunner{

	private ProductRepository productRepository;
	private UnitRepository unitRepository;
	private CategoryRepository categoryRepository;
	
	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Autowired
	public void setUnitRepository(UnitRepository unitRepository) {
		this.unitRepository = unitRepository;
	}
	
	@Autowired
	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category category1 = new Category();
		category1.setName("BARS");
		categoryRepository.save(category1);
		
		Category category2 = new Category();
		category2.setName("DAIRY PRODUCTS");
		categoryRepository.save(category2);
		
		Category category3 = new Category();
		category3.setName("VEGETABLES");
		categoryRepository.save(category3);
		
		Unit unit1 = new Unit();
		unit1.setName("Kilogram");
		unit1.setUnit("kg");
		unitRepository.save(unit1);
		
		Unit unit2 = new Unit();
		unit2.setName("Gram");
		unit2.setUnit("g");
		unitRepository.save(unit2);
		
		Unit unit3 = new Unit();
		unit3.setName("Pieces");
		unit3.setUnit("pcs");
		unitRepository.save(unit3);
		
		Product product1 = new Product();
        product1.setName("Milky Bar");
        product1.setDescription("Milky Bar with chocolate and hazelnut");
        product1.setType("CANDIES");
        product1.setCategory(category1);
        product1.setPrice(1.99);
        product1.setAmount(3);
        product1.setBarcode("1234567891234");
        product1.setUnit(unit3);
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Almond Bar");
        product2.setDescription("Almond Bar with chocolate and honey");
        product2.setType("CANDIES");
        product2.setCategory(category1);
        product2.setPrice(2.99);
        product2.setAmount(4);
        product2.setBarcode("1234567891234");
        product2.setUnit(unit3);
        productRepository.save(product2);
        
	}
}
