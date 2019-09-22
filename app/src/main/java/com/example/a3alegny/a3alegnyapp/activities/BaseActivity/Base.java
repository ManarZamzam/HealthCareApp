package com.example.a3alegny.a3alegnyapp.activities.BaseActivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.a3alegny.a3alegnyapp.Fragments.BottomNavigation.HomeActivity;
import com.example.a3alegny.a3alegnyapp.Fragments.BottomNavigation.Notification;
import com.example.a3alegny.a3alegnyapp.Fragments.BottomNavigation.Profile;
import com.example.a3alegny.a3alegnyapp.Fragments.BottomNavigation.Search;
import com.example.a3alegny.a3alegnyapp.Fragments.DrawerFragments.Cart;
import com.example.a3alegny.a3alegnyapp.Fragments.DrawerFragments.Discounts;
import com.example.a3alegny.a3alegnyapp.Fragments.DrawerFragments.Settings;
import com.example.a3alegny.a3alegnyapp.Fragments.DrawerFragments.YourBooking;
import com.example.a3alegny.a3alegnyapp.R;


public class Base extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Fragment fragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       // toolbar.setTitle();



        displayFragment(new HomeActivity());


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
       navigationView.setNavigationItemSelectedListener(this);


        BottomNavigationView Bottom_navigationView = findViewById(R.id.bottom_nav);
     onBottomNavigationItemSelected(Bottom_navigationView);

    }


    private void displayFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.relativeLayout, fragment)
                .commit();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_YourBooking) {

            fragment= new YourBooking();

        } else if (id == R.id.nav_Cart) {

            fragment= new Cart();

        } else if (id == R.id.nav_discounts) {


            fragment= new Discounts();

        } else if (id == R.id.nav_Settings) {

            fragment= new Settings();



        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        displayFragment(fragment);


        return true;

    }

    public boolean onBottomNavigationItemSelected( BottomNavigationView bottomNavigationView) {

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            int Item_Id=menuItem.getItemId();

                switch(Item_Id){
                    case R.id.menu_home:
                        fragment = new HomeActivity();
                        break;
                    case R.id.menu_search:
                        fragment = new Search();
                        break;
                    case R.id.menu_notify:
                        fragment= new Notification();
                        break;
                    case R.id.menu_settings:
                        fragment = new Profile();


                        break;
                }

                if(fragment != null){
                    displayFragment(fragment);
                }

                return false;
            }
        });


        return false;

    }












}







