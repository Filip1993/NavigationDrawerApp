package com.filipkesteli.navigationdrawerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNavigationDrawer;
    private Button btnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        btnNavigationDrawer = (Button) findViewById(R.id.btnNavigationDrawer);
        btnFragment = (Button) findViewById(R.id.btnFragment);
    }

    private void setupListeners() {
        btnNavigationDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentGoToNavigationDrawerActivity();
            }
        });
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intentGoToFragmentActivity();
            }
        });
    }

    private void intentGoToNavigationDrawerActivity() {
        Intent intent = new Intent(this, NavigationDrawerActivity.class);
        startActivity(intent);
    }

//    private void intentGoToFragmentActivity() {
//        Intent intent = new Intent(this, BlankFragment.class);
//        startActivity(intent);
//    }
}

