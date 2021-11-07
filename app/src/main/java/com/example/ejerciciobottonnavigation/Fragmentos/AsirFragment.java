package com.example.ejerciciobottonnavigation.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejerciciobottonnavigation.databinding.FragmentAsirBinding;

public class AsirFragment extends Fragment {

    private FragmentAsirBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAsirBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}