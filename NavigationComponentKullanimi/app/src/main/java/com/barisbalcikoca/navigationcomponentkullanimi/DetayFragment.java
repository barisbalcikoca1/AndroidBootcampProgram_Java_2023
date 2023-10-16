package com.barisbalcikoca.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.navigationcomponentkullanimi.databinding.FragmentDetayBinding;
import com.google.android.material.snackbar.Snackbar;


public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetayBinding.inflate(inflater, container, false);


        //Veri alacak fragment Sınıf isminin sonuna ARGS gelerek bu işlemi yapar. Bundle ile verilere ulaşırız.
        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        String gelenAd = bundle.getAd();
        int gelenYas = bundle.getYas();
        float gelenBoy = bundle.getBoy();
        boolean gelenDurum = bundle.getBekar();

        Urunler gelenUrun = bundle.getUrun();

        binding.tvBilgi.setText(gelenAd + gelenYas + gelenBoy + gelenDurum+ "- "+gelenUrun.getAd()+" -"+gelenUrun.getId());


        //Geri tuşunun aktifliğinin kaldırılması ve Sncakbar ile Evet tıklandığı zaman Geri tuşunun çalışması için kod blokları.
        OnBackPressedCallback geriTusu = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Snackbar.make(binding.tvBilgi,"Geri Dönmek İstiyor Musun?",Snackbar.LENGTH_SHORT)
                        .setAction("Evet",view -> {
                            setEnabled(false);
                            requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        }).show();

            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),geriTusu);

        return binding.getRoot();
    }
}