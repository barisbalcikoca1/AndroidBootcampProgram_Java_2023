package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.barisbalcikoca.odev4.databinding.FragmentSayfabBinding;


public class SayfaBFragment extends Fragment {
    private FragmentSayfabBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfabBinding.inflate(inflater, container, false);

        binding.btnGitY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaBGecisY);
        });

        return binding.getRoot();
    }
}