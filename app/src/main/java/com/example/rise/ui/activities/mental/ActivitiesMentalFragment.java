package com.example.rise.ui.activities.mental;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rise.R;

public class ActivitiesMentalFragment extends Fragment {

    private ActivitiesMentalViewModel mViewModel;

    public static ActivitiesMentalFragment newInstance() {
        return new ActivitiesMentalFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activities_mental_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ActivitiesMentalViewModel.class);
        // TODO: Use the ViewModel
    }

}