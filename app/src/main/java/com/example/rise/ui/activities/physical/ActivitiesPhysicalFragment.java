package com.example.rise.ui.activities.physical;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rise.R;

public class ActivitiesPhysicalFragment extends Fragment {

    private ActivitiesPhysicalViewModel mViewModel;

    public static ActivitiesPhysicalFragment newInstance() {
        return new ActivitiesPhysicalFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activities_physical_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ActivitiesPhysicalViewModel.class);
        // TODO: Use the ViewModel
    }

}