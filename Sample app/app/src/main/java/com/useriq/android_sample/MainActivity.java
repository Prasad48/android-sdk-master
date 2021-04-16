package com.useriq.android_sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.useriq.sdk.UserIQSDK;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserIQSDK.User user = new UserIQSDK.UserBuilder()
                .setId("101")
                .setAccountId("1")
                .setAccountName("Palkesh")
                .setName("Palkesh")
                .setEmail("palkesh@useriq.com")
                .addParams("location", "Bengaluru")
                .build();
        UserIQSDK.setUser(user);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.button_one).setOnClickListener(this);
        findViewById(R.id.button_two).setOnClickListener(this);
        findViewById(R.id.button_three).setOnClickListener(this);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "A Tap event is fired", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_one:
                startActivity(new Intent(MainActivity.this, ActivityOne.class));
                break;
            case R.id.button_two:
                startActivity(new Intent(MainActivity.this, ActivityTwo.class));
                break;
            case R.id.button_three:
                startActivity(new Intent(MainActivity.this, ActivityThree.class));
        }
    }
}
