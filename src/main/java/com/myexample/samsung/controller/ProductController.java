package com.myexample.samsung.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myexample.samsung.model.Product;

// 
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	
	
	@GetMapping(value = "/api/getconfigdetails1", produces = MediaType.APPLICATION_JSON_VALUE)   

	public ResponseEntity<List<Product>> getProducts1() 
	//  public List<Product> getProducts(@RequestParam String[] values ) 

    {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Dell","4G-i3",true));
		productList.add(new Product(1,"HP","4G-i7",true));	//	return new ResponseEntity<>(productList, HttpStatus.OK);
		
		return new ResponseEntity<>(productList, HttpStatus.OK);

		
		
    }

}
