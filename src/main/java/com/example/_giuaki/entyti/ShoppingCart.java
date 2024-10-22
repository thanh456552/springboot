package com.example._giuaki.entyti;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;

@Entity
@Table(name = "ShoppingCart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    private Long userId;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    public ShoppingCart() {
    }

    public ShoppingCart(Long userId) {
    }

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    // Getter và Setter
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
