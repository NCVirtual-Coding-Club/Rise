package com.example.rise.ui.agenda;

import static com.example.rise.R.id.home_alertCovid19_learnMore;
import static com.example.rise.R.id.text_home_greetingWelcomeText;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.rise.databinding.FragmentActivitiesBinding;
import com.example.rise.databinding.FragmentAgendaBinding;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AgendaFragment extends Fragment {

    private AgendaViewModel agendaViewModel;
    private FragmentAgendaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        agendaViewModel =
                new ViewModelProvider(this).get(AgendaViewModel.class);

        binding = FragmentAgendaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        agendaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        updateList();


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void updateList() {
        // Get Input from database

        /*
        Hey developer, this is a note. First of all, you must be having a great time right now, jk, I know, but you got this. Okay, let's get to work. Here is the documentation you will need to import the data from the database.

        ArrayList<String> masterList = new ArrayList<>();

        for each row
            add a new list for each row to masterlist


        Than use a switch to add to each day list
         */

        // I have no idea what I am doing lists
        ArrayList<ArrayList> plannedList = new ArrayList<>();
        ArrayList<ArrayList> unplannedList = new ArrayList<>();

        int[] timeTable = {0, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 2000, 2100, 2200, 2300, 2400};

        // Lists will be {planned/event, date and time, duration, importance}
        ArrayList<ArrayList> sundayList = new ArrayList<>();
        ArrayList<ArrayList> mondayList = new ArrayList<>();
        ArrayList<ArrayList> tuesdayList = new ArrayList<>();
        ArrayList<ArrayList> wednesdayList = new ArrayList<>();
        ArrayList<ArrayList> thursdayList = new ArrayList<>();
        ArrayList<ArrayList> fridayList = new ArrayList<>();
        ArrayList<ArrayList> saturdayList = new ArrayList<>();

        int dayOfTheWeek;

        // Test Data
        ArrayList<String> testArrayList  = new ArrayList<>();
        testArrayList.add("eventType");
        testArrayList.add("monday");
        testArrayList.add("5:00");
        testArrayList.add("2");
        sundayList.add(testArrayList);
        mondayList.add(testArrayList);
        tuesdayList.add(testArrayList);
        wednesdayList.add(testArrayList);
        thursdayList.add(testArrayList);
        fridayList.add(testArrayList);
        saturdayList.add(testArrayList);

        // Sorting Data
        for (int i : timeTable) { // For each

        }

        /*
        Check Planned List first
         */

        while (true) {


        }


        // Generate Agenda


    }
}