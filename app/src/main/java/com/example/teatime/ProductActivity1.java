package com.example.teatime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teatime.model.Cart;
import com.example.teatime.model.CartItems;

public class ProductActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product1);
         Cart cart;



            cart = new Cart();

            Button addToCartButton = findViewById(R.id.addTocart);
            addToCartButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Assume you have a Product object representing the current product
                    CartItems cartItems = new CartItems("Green tea",1,999);

                    // Add the product to the cart
                    cart.addToCart(cartItems);
                }
            });
        }
    }



