package com.example.teatime.model;

public class CartItems {
    private String itemName;
    private int quantity;
    private double price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getDouble() {
        return price;
    }

    public void setDouble(double price) {
        this.price = price;
    }

    public CartItems(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;

    }

    public void remove(CartItems cartItems) {

    }

    public void add(CartItems cartItems) {

    }
}
