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

import android.os.Bundle;
import android.view.Menu;
import com.example.teatime.R;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity  {
    DrawerLayout drawerLayout;
     NavigationView navigationView;
     BottomNavigationView bottomNavigationView;
     FloatingActionButton fab;
     FragmentManager fragmentManager;
    Menu menu;

    ActionBarDrawerToggle actionBarDrawerToggle;
    ImageView imageView1, imageView2;
    Toolbar toolbar;

    Animation imanim;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // menu=findViewById(R.id.nav_view);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        navigationView = findViewById(R.id.nav_view);
        drawerLayout =findViewById(R.id.drawer);
      //  imageView2 = findViewById(R.id.imageview2);imageView1 = findViewById(R.id.imageview1);
      // imanim = AnimationUtils.loadAnimation(this,R.anim.imageanim);
      // imageView1.setAnimation(imanim);
       // imageView2.setAnimation(imanim);
        actionBarDrawerToggle  = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.booking) {
                    Toast.makeText(MainActivity.this, "Home is Selected", Toast.LENGTH_SHORT).show();
                }
                return true;

                }



            });

        }


}