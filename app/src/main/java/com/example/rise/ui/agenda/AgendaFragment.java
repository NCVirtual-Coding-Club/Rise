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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class AgendaFragment extends Fragment {

    private AgendaViewModel agendaViewModel;
    private FragmentAgendaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        agendaViewModel =
                new ViewModelProvider(this).get(AgendaViewModel.class);

        binding = FragmentAgendaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // updateList();


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
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

        // Planned List {date, startTime, endTime, name}
        // Implanned List {dueDate, dueTime, duration, name}

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
        testArrayList.add("30");
        testArrayList.add("eventType");
        testArrayList.add("0500");
        testArrayList.add("2");
        unplannedList.add(testArrayList);

        ArrayList<String> testArrayListTwo  = new ArrayList<>();
        testArrayListTwo.add("30");
        testArrayListTwo.add("eventType");
        testArrayListTwo.add("2200");
        testArrayListTwo.add("2");
        unplannedList.add(testArrayListTwo);

        ArrayList<String> testArrayListThree  = new ArrayList<>();
        testArrayListThree.add("42069");
        testArrayListThree.add("eventType");
        testArrayListThree.add("2400");
        testArrayListThree.add("2");
        unplannedList.add(testArrayListThree);

        ArrayList<String> testArrayListFour  = new ArrayList<>();
        testArrayListFour.add("monday");
        testArrayListFour.add("0");
        testArrayListFour.add("500");
        testArrayListFour.add("test");
        plannedList.add(testArrayListFour);






        int currentDate = 23;
        ArrayList<Double> daysUntil  = new ArrayList<>();
        int unplannedListLength = unplannedList.size();

        for (int i = 0; i<unplannedListLength; i++) {
            unplannedList.get(i).set(0, unplannedList.get(i).get(0) + "." + unplannedList.get(i).get(2));
        }

        // Creates an array that stores the time until the due date
        for (int i = 0; i<unplannedListLength; i++) {
            double currentDueDate = Double.parseDouble(String.valueOf(unplannedList.get(i).get(0))) - currentDate;
            daysUntil.add(currentDueDate);
        }

        System.out.println("Old: " + daysUntil);
        System.out.println("Old: " + unplannedList);
        int daysUntilLength = daysUntil.size();

        for (int i = 1; i < daysUntilLength; i++) {
            double current = Double.parseDouble(String.valueOf(daysUntil.get(i)));
            ArrayList<String> currentArray = unplannedList.get(i);
            int j = i -1;
            while (j>= 0 && Double.parseDouble(String.valueOf(daysUntil.get(j))) > current) {
                try {
                    daysUntil.set(j+1, daysUntil.get(j));
                    unplannedList.set(j+1, unplannedList.get(j));
                } catch (Exception e) {
                    daysUntil.add(daysUntil.get(j+1));
                    unplannedList.add(unplannedList.get(j+1));
                } finally {
                    j--;
                }
            }
            try {
                daysUntil.set(j+1, current);
                unplannedList.set(j+1, currentArray);
            } catch (Exception e) {
                daysUntil.add(current);
                unplannedList.add(currentArray);
            }
        }

        System.out.println("New: " + daysUntil);
        System.out.println("New: " + unplannedList);

        int plannedListLength = plannedList.size();
        int unplanneListCounter = 0;

        // Step 2


        for (int i = 0; i <= 2400; i+= 15) {
            boolean foundPlanned = false;
            for (int c = 0; c < plannedListLength; c++) {
                if (!plannedList.isEmpty() && plannedList.get(c).get(0) == "monday" && i >= Integer.parseInt(String.valueOf(plannedList.get(c).get(1))) && i <= Integer.parseInt(String.valueOf(plannedList.get(c).get(2)))) {
                    mondayList.add(plannedList.get(c));
                    plannedList.remove(c);
                    foundPlanned = true;
                }

            }
            if (!foundPlanned) {
                try {
                    mondayList.add(unplannedList.get(unplanneListCounter));
                    unplanneListCounter ++;
                } catch (Exception e) {
                    System.out.println("FUCK");
                }

            }

        }


        System.out.println(mondayList);

    }

}