package com.barisbalcikoca.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.navigationcomponentkullanimi.databinding.FragmentAyarlarBinding;

public class AyarlarFragment extends Fragment {

    private  FragmentAyarlarBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAyarlarBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }
}