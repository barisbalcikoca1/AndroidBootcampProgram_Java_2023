package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.barisbalcikoca.odev4.databinding.FragmentSayfayBinding;


public class SayfaYFragment extends Fragment {

    private FragmentSayfayBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfayBinding.inflate(inflater, container, false);

        OnBackPressedCallback geriTusu = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(binding.textView5).navigate(R.id.sayfaYGecisAnasayfa);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),geriTusu);

        return binding.getRoot();
    }
}