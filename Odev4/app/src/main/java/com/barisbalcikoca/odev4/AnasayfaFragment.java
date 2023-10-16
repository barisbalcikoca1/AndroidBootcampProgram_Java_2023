package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.odev4.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        binding.btnGitA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.anasayfaGecisa);
        });
        binding.btnGitX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.anasayfaGecisx);
        });

        return binding.getRoot();
    }
}