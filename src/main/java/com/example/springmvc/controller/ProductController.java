package com.example.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springmvc.model.Product;
import com.example.springmvc.model.Unit;
import com.example.springmvc.repository.ProductRepository;
import com.example.springmvc.repository.UnitRepository;
import com.example.springmvc.repository.CategoryRepository;

@Controller
public class ProductController {

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
	
	@RequestMapping(path="/")
	public String index() {
		
		return "index";
	}

	@RequestMapping(path="/products/add", method=RequestMethod.GET)
	public String createProduct(Model model) {
		
		model.addAttribute("product", new Product());
		model.addAttribute("units", this.unitRepository.findAll());
		model.addAttribute("categories", this.categoryRepository.findAll());
		
		return "edit";
	}
	
	@RequestMapping(path="products", method=RequestMethod.POST)
	public String saveProduct(Product product) {
		this.productRepository.save(product);
		
		return "redirect:/products";
	}
	
	@RequestMapping(path="/products", method=RequestMethod.GET)
	public String getAllProducts(Model model) {
		
		model.addAttribute("products", productRepository.findAll());
		
		return "products";
	}
	
	@RequestMapping(path = "/products/edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model, @PathVariable(value = "id") String id) {
        model.addAttribute("product", productRepository.findById(id).orElse(null));
        model.addAttribute("units", this.unitRepository.findAll());
        model.addAttribute("categories", this.categoryRepository.findAll());
        
        return "edit";
    }
	
	@RequestMapping(path = "/products/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable(value = "id") String id) {

		try {
        	Product foundProduct = productRepository.findById(id).orElse(null);
            productRepository.delete(foundProduct);
        } catch (Exception e) {
            
        }
		
        return "redirect:/products";
    }
}
