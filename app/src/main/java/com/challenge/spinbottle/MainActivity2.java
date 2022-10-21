package com.challenge.spinbottle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.guide.mehdilibrary.databinding.ActivityMain2Binding;
import com.proads.customads.CustomInterstitialListener;
import com.proads.customads.MyCustomAds;
import com.proads.customads.RewardListener;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MyCustomAds.ShowBanner(this,binding.Banner);
        MyCustomAds.ShowNative(this,binding.Native);
        binding.Interstitial.setOnClickListener(view -> {
            MyCustomAds.ShowInterstitial(this, new CustomInterstitialListener() {
                @Override
                public void OnAdClosed() {
                    Toast.makeText(MainActivity2.this, "ad closed", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void OnShowError(String error) {
                    Toast.makeText(MainActivity2.this, "ad error "+ error, Toast.LENGTH_SHORT).show();

                }

                @Override
                public void OnInterstitialNotLoaded() {
                    Toast.makeText(MainActivity2.this, "ad not loaded", Toast.LENGTH_SHORT).show();

                }
            });
        });

        binding.Reward.setOnClickListener(view -> {
            MyCustomAds.ShowReward(this, new RewardListener() {
                @Override
                public void OnReward() {
                    Toast.makeText(MainActivity2.this, "reward earned", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void OnClose() {
                    Toast.makeText(MainActivity2.this, "ad closed", Toast.LENGTH_SHORT).show();

                }

                @Override
                public void OnError(String error) {
                    Toast.makeText(MainActivity2.this, "ad error "+error, Toast.LENGTH_SHORT).show();

                }
            });
        });
    }
}