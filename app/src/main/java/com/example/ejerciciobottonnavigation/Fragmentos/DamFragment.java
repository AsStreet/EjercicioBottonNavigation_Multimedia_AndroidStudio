package com.example.ejerciciobottonnavigation.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejerciciobottonnavigation.databinding.FragmentDamBinding;

public class DamFragment extends Fragment {

    private FragmentDamBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDamBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}