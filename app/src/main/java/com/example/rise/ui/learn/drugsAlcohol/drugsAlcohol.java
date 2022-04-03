package com.example.rise.ui.learn.drugsAlcohol;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rise.R;

public class drugsAlcohol extends Fragment {

    private DrugsAlcoholViewModel mViewModel;

    public static drugsAlcohol newInstance() {
        return new drugsAlcohol();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.drugs_alcohol_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DrugsAlcoholViewModel.class);
        // TODO: Use the ViewModel
    }

}