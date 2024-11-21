package com.tejas.SpringMVCBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.SpringMVCBoot.Service.ProductCrud;

@RestController
public class ProductController {


	@Autowired
	ProductCrud productCrud;


	@GetMapping("entry")
	public String getInfo() {


		return "Hello";
	}

	@PostMapping("insert")
	public String  insertProduct(@RequestParam String id , @RequestParam String name,@RequestParam double price){


		return productCrud.insertProduct(id ,name, price);
	}



}









