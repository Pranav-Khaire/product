package com.example.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import java.util.List;

@Service
public class ProductService {

	  @Autowired
      ProductRepository proRepository;    



//CREATE 
public Product createProduct(Product pro) {
 return proRepository.save(pro);
}

//READ
public List<Product> getProduct() {
 return proRepository.findAll();
}

//DELETE
public void deleteProduct(Long productId) {
 proRepository.deleteById(productId);
}


//UPDATE
public Product updateProduct(Long productId, Product productDetails) {
     Product pro = proRepository.findById(productId).get();
    pro.setProductId(productDetails.getProductid());
     pro.setName(productDetails.getName());
     pro.setProducttype(productDetails.getProducttype());
     pro.setCategory(productDetails.getCategory());
     pro.setPrice(productDetails.getPrice());
     
     return proRepository.save(pro);                                
}



}
