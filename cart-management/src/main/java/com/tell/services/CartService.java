package com.tell.services;

import java.util.List;
import java.util.Optional;

import com.tell.model.Cart;
public interface CartService {
	
	public Cart save( Cart cart);
	 public Optional<Cart> getCartById(int id);
	 public String updateCart( Cart cart, int id);
	public List<Cart>getAllCarts();
	public Cart additemtocart( Cart cart);
}
