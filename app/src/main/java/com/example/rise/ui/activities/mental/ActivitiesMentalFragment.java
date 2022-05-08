package com.example.rise.ui.activities.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

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

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // The following code handles OnClick events for all cards on the support page
        // Start

        // The following code stores CardViews for each card
        CardView breathing = (CardView) view.findViewById(R.id.card_activities_mental_breathing);
        CardView exercise = (CardView) view.findViewById(R.id.card_activities_mental_exercise);

        breathing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lung.org/lung-health-diseases/wellness/breathing-exercises"));
                startActivity(browserIntent);            }
        });

        exercise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthdirect.gov.au/exercise-and-mental-health"));
                startActivity(browserIntent);            }
        });

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ActivitiesMentalViewModel.class);
        // TODO: Use the ViewModel
    }

}