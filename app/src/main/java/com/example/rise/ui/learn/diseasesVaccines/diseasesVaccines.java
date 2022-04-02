package com.example.rise.ui.learn.diseasesVaccines;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rise.R;

public class diseasesVaccines extends Fragment {

    private DiseasesVaccinesViewModel mViewModel;

    public static diseasesVaccines newInstance() {
        return new diseasesVaccines();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.diseases_vaccines_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DiseasesVaccinesViewModel.class);
        // TODO: Use the ViewModel
    }

}