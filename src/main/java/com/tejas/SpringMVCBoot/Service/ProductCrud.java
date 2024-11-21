package com.tejas.SpringMVCBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejas.SpringMVCBoot.Model.Product;

import repository.ProductRepository;

@Service
public class ProductCrud {


	@Autowired
	private ProductRepository productRepository;



	public String insertProduct(String id,String name ,double price) {
		Product product = new Product(id, name, price);


		productRepository.save(product);

		return "Inserted Successfuly...";

}




//	public String insert(String id , String name , double price) {
//
//		boolean  flag = false;
//		for(Product p  : productList) {
//
//			if(p.getId().equals(id)) {
//				flag=true;
//
//				break;
//			}
//		}
//
//		if(flag==true) {
//
//			return "Person with this id si allready present...";
//
//		}
//		else {
//
//			productList.add(new Product(id, name, price));
//
//			return "Product added successfully...! ";
//		}
//
//
//	}
//
//
//	public String update(String id , String name , double price) {
//
//		boolean  flag = false;
//
//
//		Product product = new Product();
//		for(Product p  : productList) {
//
//			if(p.getId().equals(id)) {
//				flag=true;
//
//				product = p ;
//
//				break;
//
//
//			}
//		}
//
//		if(flag==true) {
//
//			return "Person with this id is allready present...";
//
//		}
//		else {
//
//			productList.set(productList.indexOf(product), new Product(id, name, price));
//
//			return "Product added successfully...! ";
//		}
//
//
//
//
//
//
//	}


}


















