package com.barisbalcikoca.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        binding.btnDetay.setOnClickListener(view -> {
            //binding.tvAnasayfa.setText("Merhaba Anasayfa");

            //Veri gönderecek taraf Directions alır.
            Urunler urun = new Urunler(100,"Laptop");
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(urun);
            gecis.setAd("Barış");
            gecis.setYas(24);
            gecis.setBoy(186);
            gecis.setBekar(true);

            Navigation.findNavController(view).navigate(gecis);//Navigate içerisine oluşturduğumuz gecis ismi ile gideriz.

        });
        //BottomSheet gösterilmesi
        binding.btnGoster.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.bottomSheetGecis);
        });

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        //SAYFA İLK YÜKLENDİĞİ ANDA BURASI ÇALIŞIR.
        super.onCreate(savedInstanceState);
        Log.e("Yaşam Döngüsü","onCreate");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Yaşam Döngüsü","onResume");
        //Sayfa göründüğünde ve sayfaya dönüldüğünde çalışır.
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Yaşam Döngüsü","onPause");
        //Sayfadan ayrıldığımızda
    }

}