package com.example.teatime;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.example.teatime.R;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ProfileFragment profileFragment;
    private LinearLayout mainLayout;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    BottomNavigationView bottomNavigationView;
    FloatingActionButton fab;
    FragmentManager fragmentManager;
    Menu menu;

    ActionBarDrawerToggle actionBarDrawerToggle;
    RecyclerView recyclerView;
    ImageView imageView1, imageView2;
    Toolbar toolbar;
    HomeFragment homeFragment;
    Button button;

    Animation imanim;


    ActionBarDrawerToggle drawerToggle;


    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    if (item.getItemId() == R.id.bottom_home) {
                        // Action for Item 1
                        loadFragment(new HomeFragment());
                        return true;
                    }
                    if (item.getItemId() == R.id.bottom_profile) {
                        // Action for Item 1
                        loadFragment(new ProfileFragment());
                        return true;

                    }
                    if (item.getItemId() == R.id.bottom_cart) {
                        // Action for Item 1
                        loadFragment(new CartFragment());
                        return true;
                    }
                    if (item.getItemId() == R.id.bottom_menu) {
                        // Action for Item 1
                        loadFragment(new MenuFragmnet());
                        return true;
                    } else {
                        // Default action or handle additional items
                        return false;
                    }
                }
            };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        // Load the initial fragment
        loadFragment(new HomeFragment());
    }



    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle ActionBarDrawerToggle clicks here
        MainActivity drawerToggle = null;
        if (drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}

