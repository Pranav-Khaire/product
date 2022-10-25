package com.example.product.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/api")

public class ProductController {
	 @Autowired
     ProductService proService;

	 
	 @RequestMapping(value="/product", method=RequestMethod.POST)
	 public Product createProduct(@RequestBody Product pro) {
	     return proService.createProduct(pro);
	 }
	 
	 
	 @RequestMapping(value="/product", method=RequestMethod.GET)
	 public List<Product> readProduct() {
	     return proService.getProduct();
	 }

	 @RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)
	 public Product readProduct(@PathVariable(value = "productId") Long id, @RequestBody Product productDetails) {
	     return proService.updateProduct(id, productDetails);
	 }

	 @RequestMapping(value="/product/{productId}", method=RequestMethod.DELETE)
	 public void deleteProduct(@PathVariable(value = "productId") Long id) {
	     proService.deleteProduct(id);
	 }


}


