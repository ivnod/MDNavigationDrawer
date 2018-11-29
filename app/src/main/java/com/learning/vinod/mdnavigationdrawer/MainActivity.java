package com.learning.vinod.mdnavigationdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar mToolbar;
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mNavigationView = findViewById(R.id.navigation_view);
        mNavigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open_drawer, R.string.close_drawer);
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(Gravity.START)) {
            mDrawerLayout.closeDrawer(Gravity.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id) {
            case R.id.inbox:
                Toast.makeText(this, "inbox", Toast.LENGTH_LONG).show();
                break;
            case R.id.starred:
                Toast.makeText(this, "starred", Toast.LENGTH_LONG).show();
                break;
            case R.id.sent_mail:
                Toast.makeText(this, "sent mail", Toast.LENGTH_LONG).show();
                break;
            case R.id.drafts:
                Toast.makeText(this, "drafts", Toast.LENGTH_LONG).show();
                break;
            case R.id.all_mail:
                Toast.makeText(this, "all mail", Toast.LENGTH_LONG).show();
                break;
            case R.id.spam:
                Toast.makeText(this, "spam", Toast.LENGTH_LONG).show();
                break;
            case R.id.delete:
                Toast.makeText(this, "delete", Toast.LENGTH_LONG).show();
                break;


        }
        mDrawerLayout.closeDrawer(Gravity.START);
        return true;
    }
}
