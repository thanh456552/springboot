package com.example._giuaki.service;
import com.example._giuaki.entyti.ShoppingCart;
import com.example._giuaki.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCart> getAllCarts() {
        return shoppingCartRepository.findAll();
    }

    public ShoppingCart createCart(Long userId) {
        ShoppingCart newCart = new ShoppingCart(userId);
        return shoppingCartRepository.save(newCart);
    }

    public ShoppingCart getCartById(Long cartId) {
        return shoppingCartRepository.findById(cartId).orElse(null);
    }

    public void deleteCart(Long cartId) {
        shoppingCartRepository.deleteById(cartId);
    }
}
