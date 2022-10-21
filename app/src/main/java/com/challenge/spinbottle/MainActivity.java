package com.challenge.spinbottle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.guide.mehdilibrary.databinding.ActivityMainBinding;
import com.proads.customads.InitListener;
import com.proads.customads.MyCustomAds;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MyCustomAds.InitSdk(this, "https://api.npoint.io/d3b7df6b8fa6678a6f79", new InitListener() {
            @Override
            public void OnInitialized(Activity activity) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }

            @Override
            public void OnFailed(String Error) {

            }
        });
    }
}