package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.odev4.databinding.FragmentSayfaaBinding;

public class SayfaAFragment extends Fragment {

    private FragmentSayfaaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaaBinding.inflate(inflater, container, false);

        binding.btnGitB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaAGecisB);
        });

        return binding.getRoot();
    }
}