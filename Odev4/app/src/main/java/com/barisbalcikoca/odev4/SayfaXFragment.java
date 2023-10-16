package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.barisbalcikoca.odev4.databinding.FragmentSayfaxBinding;


public class SayfaXFragment extends Fragment {

    private FragmentSayfaxBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaxBinding.inflate(inflater, container, false);

        binding.btnGitY2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaXGecisY);
        });

        return binding.getRoot();
    }
}