package com.example._giuaki.controller;
import com.example._giuaki.entyti.ShoppingCart;
import com.example._giuaki.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping
    public List<ShoppingCart> getAllCarts() {
        return shoppingCartService.getAllCarts();
    }

    @PostMapping
    public ShoppingCart createCart(@RequestParam Long userId) {
        return shoppingCartService.createCart(userId);
    }

    @GetMapping("/{cartId}")
    public ResponseEntity<ShoppingCart> getCartById(@PathVariable Long cartId) {
        ShoppingCart cart = shoppingCartService.getCartById(cartId);
        if (cart != null) {
            return ResponseEntity.ok(cart);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{cartId}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long cartId) {
        shoppingCartService.deleteCart(cartId);
        return ResponseEntity.noContent().build();
    }
}
