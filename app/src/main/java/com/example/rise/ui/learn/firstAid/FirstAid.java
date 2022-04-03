package com.example.rise.ui.learn.firstAid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rise.R;

public class FirstAid extends Fragment {

    private FirstAidViewModel mViewModel;

    public static FirstAid newInstance() {
        return new FirstAid();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_aid_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mayoclinic.org/first-aid"));
        startActivity(browserIntent);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FirstAidViewModel.class);
        // TODO: Use the ViewModel
    }

}