package com.nhrepon.headline;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity {

    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    FrameLayout frameLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawerlayout);
        materialToolbar = findViewById(R.id.materialToolBar);
        frameLayout = findViewById(R.id.frameLayout);
        navigationView = findViewById(R.id.navigationBar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(Home.this, drawerLayout, materialToolbar,
                R.string.drawer_open,R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);









    }
}