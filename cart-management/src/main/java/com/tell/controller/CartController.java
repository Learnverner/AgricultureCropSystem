package com.tell.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tell.model.Cart;
import com.tell.services.CartService;


@RestController
@RequestMapping("/api/cart")
public class CartController {
	
 @Autowired
 CartService cartService;
 
//save the cartdetails
 @PostMapping("/additemtocart")
	public Cart additemtocart(@RequestBody Cart cart) {
		
		return cartService.additemtocart(cart);
	}
 @GetMapping("/getcartbyid/{cartId}")
 public Optional<Cart> getCartById(@PathVariable int id) {
	 return cartService.getCartById(id);
 }
 
 
 @PutMapping("/updatecart")
 public String updateCart(@RequestBody Cart cart, @PathVariable int id) {
	 cartService.getCartById(id);
	 cartService.updateCart(cart,id);
		return "Update cropdetails with id: "+id;
 }
 
 
 @GetMapping("/getallcarts")
	public List<Cart> getAll(){
		return cartService.getAllCarts();
	}
 

 
 
 
}	

