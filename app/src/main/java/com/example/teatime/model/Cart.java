package com.example.teatime.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItems> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public List<CartItems> getCartItems() {
        return cartItems;
    }

    public void addToCart(CartItems cartItems) {
        cartItems.add(cartItems);
    }

    public void removeFromCart(CartItems cartItems) {
        cartItems.remove(cartItems);
    }

}
