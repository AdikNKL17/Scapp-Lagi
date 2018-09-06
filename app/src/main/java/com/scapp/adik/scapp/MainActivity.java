package com.scapp.adik.scapp;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.scapp.adik.scapp.adapter.JadwalAdapter;
import com.scapp.adik.scapp.fragment.KemarinFragment;
import com.scapp.adik.scapp.fragment.BesokFragment;
import com.scapp.adik.scapp.fragment.TodayFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

    Toolbar toolbar;
    SearchView searchView;
    BottomNavigationView bottomNavigationView;
    List<Jadwal> jadwalList = new ArrayList<>();
    RecyclerView recyclerView;
    JadwalAdapter jadwalAdapter;

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        /*toolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);*/
        toolbar.inflateMenu(R.menu.toolbar_menu);
        /*setSupportActionBar(toolbar);*/

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Profile",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);
                /*mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

                NavigationView navigationView;
                navigationView = (NavigationView) findViewById(R.id.navigation_view);
                navigationView.setNavigationItemSelectedListener(new NavigationView.
                        OnNavigationItemSelectedListener(){
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item){
                        item.setChecked(true);
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                        return true;
                    }
                });*/
            }
        });

        toolbar.setOnMenuItemClickListener(this);



        searchView = (SearchView)findViewById(R.id.cari_makul);
        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.isFocused();
            }
        });

        /*recyclerView = (RecyclerView)findViewById(R.id.recycler);

        jadwalAdapter = new JadwalAdapter(jadwalList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(jadwalAdapter);

        dataJadwal();*/

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);
        bottomNavigationView.setSelectedItemId(R.id.hari_ini);

        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new TodayFragment()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.Fragment seletedFragment = null;

                    switch (item.getItemId()){
                        case R.id.kemarin:
                            seletedFragment = new KemarinFragment();
                            break;
                        case R.id.hari_ini:
                            seletedFragment = new TodayFragment();
                            break;
                        case R.id.besok:
                            seletedFragment = new BesokFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            seletedFragment).commit();

                    return true;
                }
            };

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_notifikasi:
                Toast.makeText(this, "Notifikasi",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, NotifikasiActivity.class);
                startActivity(intent);
                /*break;
            case R.id.action_profile:
                Toast.makeText(this, "Profile",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);*/

        }
        return true;
    }

    private void dataJadwal(){
        Jadwal jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);

    }

    private Boolean exit = false;

    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    Intent a = new Intent(Intent.ACTION_MAIN);
                    a.addCategory(Intent.CATEGORY_HOME);
                    a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(a);
                }
            }, 1000);
        }
    }

    /*public void onBackPressed(){
        finish();
    }
*/
}
