package com.barisbalcikoca.activitycalismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.barisbalcikoca.activitycalismayapisi.databinding.ActivityDetayBinding;

public class DetayActivity extends AppCompatActivity {
    private ActivityDetayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String gelenAd = getIntent().getStringExtra("ad");
        String gelenSoyad = getIntent().getStringExtra("Soyad");
        //String dışında her primitiv için defaultValue tanımlanmak zorunda
        int gelenYas = getIntent().getIntExtra("yas",0);
        String gelenIl = getIntent().getStringExtra("il");

        binding.tvDetay.setText("Ad : "+gelenAd+"\nSoyad : "+gelenSoyad+"\nYaş : "+gelenYas+"\nİl : "+gelenIl);
    }
}