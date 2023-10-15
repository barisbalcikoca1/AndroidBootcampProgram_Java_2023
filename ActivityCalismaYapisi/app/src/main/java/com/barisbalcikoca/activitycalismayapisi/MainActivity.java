package com.barisbalcikoca.activitycalismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.barisbalcikoca.activitycalismayapisi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;//Binding sayesinde sadece bu activityde olan XML verilerine erişim sağlanır. Bu da karmaşayı azaltır.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnDetay.setOnClickListener(view -> {
            //binding.tvAnasayfa.setText("Değişiklik Yapıldı");
            Intent intent = new Intent(MainActivity.this,DetayActivity.class);
            intent.putExtra("ad","Barış");
            intent.putExtra("Soyad","Balcıkoca");
            intent.putExtra("yas",24);
            intent.putExtra("il","Eskişehir");
            startActivity(intent);
        });
    }
}