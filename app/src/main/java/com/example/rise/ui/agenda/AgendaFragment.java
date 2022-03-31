package com.example.rise.ui.agenda;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rise.R;
import com.example.rise.ui.agenda.placeholder.PlaceholderContent;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * A fragment representing a list of Items.
 */
public class AgendaFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 2;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public AgendaFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static AgendaFragment newInstance(int columnCount) {
        AgendaFragment fragment = new AgendaFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_agenda_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new AgendaRecyclerViewAdapter(PlaceholderContent.ITEMS));
        }
        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void generateList() {

        /*
         * Date Information
         */


        /*
        *Stores list of events/tasks*

        Planned List {date, startTime, endTime, name, dateTime}
        Unplanned List {dueDate, dueTime, duration, name, dateTime}
         */

        ArrayList<ArrayList> plannedList = new ArrayList<>();
        ArrayList<ArrayList> unplannedList = new ArrayList<>();

        // Testing Data for Unplanned List
        ArrayList<String> uOne  = new ArrayList<>();
        uOne.add("28");
        uOne.add("1000");
        uOne.add("300");
        uOne.add("uOne");
        unplannedList.add(uOne);

        ArrayList<String> uTwo  = new ArrayList<>();
        uTwo.add("28");
        uTwo.add("1200");
        uTwo.add("200");
        uTwo.add("uTwo");
        unplannedList.add(uTwo);


        ArrayList<String> uThree  = new ArrayList<>();
        uThree.add("30");
        uThree.add("1200");
        uThree.add("200");
        uThree.add("uThree");
        unplannedList.add(uThree);

        ArrayList<String> uFour  = new ArrayList<>();
        uFour.add("28");
        uFour.add("1200");
        uFour.add("2000");
        uFour.add("uFour");
        unplannedList.add(uFour);

        // Testing Data for Planned List
        ArrayList<String> pOne  = new ArrayList<>();
        pOne.add("28");
        pOne.add("0");
        pOne.add("600");
        pOne.add("pOne");
        plannedList.add(pOne);

        ArrayList<String> pTwo  = new ArrayList<>();
        pTwo.add("28");
        pTwo.add("850");
        pTwo.add("2000");
        pTwo.add("pTwo");
        plannedList.add(pTwo);


        // Arrays for each day
        ArrayList<ArrayList> sundayList = new ArrayList<>();
        ArrayList<ArrayList> mondayList = new ArrayList<>();
        ArrayList<ArrayList> tuesdayList = new ArrayList<>();
        ArrayList<ArrayList> wednesdayList = new ArrayList<>();
        ArrayList<ArrayList> thursdayList = new ArrayList<>();
        ArrayList<ArrayList> fridayList = new ArrayList<>();
        ArrayList<ArrayList> saturdayList = new ArrayList<>();

        // Acting Date
        // int currentDate = 23;

        /*
         *Unplanned List Sorting*
         */
        System.out.println("Unsorted unplanned list: " + unplannedList);

        ArrayList<Double> unplannedDateTimeList = new ArrayList<>();

        // Creates the dateTime value
        for (int i = 0; i<unplannedList.size(); i++) {
            unplannedList.get(i).add(unplannedList.get(i).get(0) + "." + unplannedList.get(i).get(1));
            unplannedDateTimeList.add(Double.parseDouble(String.valueOf(unplannedList.get(i).get(4))));
        }

        for (int i = 0; i<unplannedList.size(); i++) {
            unplannedList.get(i).add("true");
        }

        // Sorts unplannedList
        for (int i = 1; i < unplannedDateTimeList.size(); i++) {
            double current = unplannedDateTimeList.get(i);
            ArrayList<String> currentArray = unplannedList.get(i);
            int j = i - 1;
            while (j>=0 && unplannedDateTimeList.get(j) > current) {
                try {
                    unplannedDateTimeList.set(j+1, unplannedDateTimeList.get(j));
                    unplannedList.set(j+1, unplannedList.get(j));
                } catch (Exception e) {
                    unplannedDateTimeList.add(unplannedDateTimeList.get(j+1));
                    unplannedList.add(unplannedList.get(j+1));
                } finally {
                    j--;
                }
            }
            try {
                unplannedDateTimeList.set(j+1, current);
                unplannedList.set(j+1, currentArray);
            } catch (Exception e) {
                unplannedDateTimeList.add(current);
                unplannedList.add(currentArray);
            }
        }


        System.out.println("Sorted unplanned list: " + unplannedList);
        /*
         *planned List Sorting*
         */

        System.out.println("Unsorted planned list: " + plannedList);

        ArrayList<Double> plannedDateTimeList = new ArrayList<>();

        // Creates the dateTime value
        for (int i = 0; i<plannedList.size(); i++) {
            plannedList.get(i).add(plannedList.get(i).get(0) + "." + plannedList.get(i).get(1));
            plannedDateTimeList.add(Double.parseDouble(String.valueOf(plannedList.get(i).get(4))));
        }

        for (int i = 0; i<plannedList.size(); i++) {
            plannedList.get(i).add("false");
        }

        // Sorts plannedList
        for (int i = 1; i < plannedDateTimeList.size(); i++) {
            double current = plannedDateTimeList.get(i);
            ArrayList<String> currentArray = plannedList.get(i);
            int j = i - 1;
            while (j>=0 && plannedDateTimeList.get(j) > current) {
                try {
                    plannedDateTimeList.set(j+1, plannedDateTimeList.get(j));
                    plannedList.set(j+1, plannedList.get(j));
                } catch (Exception e) {
                    plannedDateTimeList.add(plannedDateTimeList.get(j+1));
                    plannedList.add(plannedList.get(j+1));
                } finally {
                    j--;
                }
            }
            try {
                plannedDateTimeList.set(j+1, current);
                plannedList.set(j+1, currentArray);
            } catch (Exception e) {
                plannedDateTimeList.add(current);
                plannedList.add(currentArray);
            }
        }

        System.out.println("Sorted Planned List: " + plannedList);


        /*
        Create final lists
         */

        // Adds plannedList lists into their respective DAYList
        for (int i = 0; i <= 1440; i+=15) {
            for (int j = 0; j < plannedList.size(); j++) { // Testing Planned list
                // Declaring variables from ArrayList
                int date = Integer.parseInt(String.valueOf(plannedList.get(j).get(0)));
                int startTime = Integer.parseInt(String.valueOf(plannedList.get(j).get(1)));
                int duration = Integer.parseInt(String.valueOf(plannedList.get(j).get(2)));
                int endTime = startTime + duration;

                /*
                i = 15;
                startTime = 0015;
                endTime = 1000;
                 */

                LocalDate currentDate = LocalDate.now();
                Month currentMonth = currentDate.getMonth();
                /*
                LocalDate localDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), currentDate.getDayOfMonth());
                java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                String currentDay = dayOfWeek.toString();

                 */
                LocalDate taskDate = null;

                if (currentDate.getDayOfMonth() > date + 10) {
                    if (Integer.parseInt(currentDate.getMonth().toString()) == 12) {
                        // If new year
                        taskDate = LocalDate.of(currentDate.getYear() + 1, Month.JANUARY, date);
                    } else {
                        // If new month
                        taskDate = LocalDate.of(currentDate.getYear(), currentMonth.plus(1), date);
                    }
                } else {
                    taskDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), date);
                }

                String day = taskDate.getDayOfWeek().toString();


                if (!plannedList.isEmpty() && i >= startTime && i <= endTime) {
                    switch (day) {
                        case "SUNDAY":
                            sundayList.add(plannedList.get(j));
                            plannedList.remove(j);
                            break;
                        case "MONDAY":
                            mondayList.add(plannedList.get(j));
                            plannedList.remove(j);
                            break;
                        case "TUESDAY":
                            tuesdayList.add(plannedList.get(j));
                            plannedList.remove(j);
                            break;
                        case "WEDNESDAY":
                            wednesdayList.add(plannedList.get(j));
                            plannedList.remove(j);
                            break;
                        case "THURSDAY":
                            thursdayList.add(plannedList.get(j));
                            plannedList.remove(j);
                            break;
                        case "FRIDAY":
                            fridayList.add(plannedList.get(j));
                            plannedList.remove(j);
                            break;
                        case "SATURDAY":
                            saturdayList.add(plannedList.get(j));
                            plannedList.remove(j);
                            break;
                    }
                }
            }
        }

        // Creates the distance lists


        ArrayList<Integer> sundayPlannedListLengths = new ArrayList<>();
        sundayPlannedListLengths = DistanceLists.calcDistance(sundayList, sundayPlannedListLengths);

        ArrayList<Integer> mondayPlannedListLengths = new ArrayList<>();
        mondayPlannedListLengths = DistanceLists.calcDistance(mondayList, mondayPlannedListLengths);

        ArrayList<Integer> tuesdayPlannedListLengths = new ArrayList<>();
        tuesdayPlannedListLengths = DistanceLists.calcDistance(tuesdayList, tuesdayPlannedListLengths);

        ArrayList<Integer> wednesdayPlannedListLengths = new ArrayList<>();
        wednesdayPlannedListLengths = DistanceLists.calcDistance(wednesdayList, wednesdayPlannedListLengths);

        ArrayList<Integer> thursdayPlannedListLengths = new ArrayList<>();
        thursdayPlannedListLengths = DistanceLists.calcDistance(thursdayList, thursdayPlannedListLengths);

        ArrayList<Integer> fridayPlannedListLengths = new ArrayList<>();
        fridayPlannedListLengths = DistanceLists.calcDistance(fridayList, fridayPlannedListLengths);

        ArrayList<Integer> saturdayPlannedListLengths = new ArrayList<>();
        saturdayPlannedListLengths = DistanceLists.calcDistance(saturdayList, saturdayPlannedListLengths);


        // Add other lists

        int offset = 0;

        for (int i = 0; i < unplannedList.size(); i++) {
            boolean isAdded = false;
            for (int j = 0; j < mondayPlannedListLengths.size(); j++) {
                if (Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))) <= mondayPlannedListLengths.get(j)) {
                    mondayList.add(j + offset, unplannedList.get(i));
                    // offset ++;
                    mondayPlannedListLengths = DistanceLists.updateList(mondayPlannedListLengths, j, Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))));
                    isAdded = true;
                    break;
                }
            }


            if (isAdded == false) {
                for (int j = 0; j < tuesdayPlannedListLengths.size(); j++) {
                    if (Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))) <= tuesdayPlannedListLengths.get(j)) {
                        tuesdayList.add(j + offset, unplannedList.get(i));
                        // offset ++;
                        tuesdayPlannedListLengths = DistanceLists.updateList(tuesdayPlannedListLengths, j, Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))));
                        isAdded = true;
                        break;
                    }
                }
            }

            if (isAdded == false) {
                for (int j = 0; j < wednesdayPlannedListLengths.size(); j++) {
                    if (Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))) <= wednesdayPlannedListLengths.get(j)) {
                        wednesdayList.add(j + offset, unplannedList.get(i));
                        // offset ++;
                        wednesdayPlannedListLengths = DistanceLists.updateList(wednesdayPlannedListLengths, j, Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))));
                        isAdded = true;
                        break;
                    }
                }
            }

            if (isAdded == false) {
                for (int j = 0; j < thursdayPlannedListLengths.size(); j++) {
                    if (Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))) <= thursdayPlannedListLengths.get(j)) {
                        thursdayList.add(j + offset, unplannedList.get(i));
                        // offset ++;
                        thursdayPlannedListLengths = DistanceLists.updateList(thursdayPlannedListLengths, j, Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))));
                        isAdded = true;
                        break;
                    }
                }
            }

            if (isAdded == false) {
                for (int j = 0; j < fridayPlannedListLengths.size(); j++) {
                    if (Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))) <= fridayPlannedListLengths.get(j)) {
                        fridayList.add(j + offset, unplannedList.get(i));
                        // offset ++;
                        fridayPlannedListLengths = DistanceLists.updateList(fridayPlannedListLengths, j, Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))));
                        isAdded = true;
                        break;
                    }
                }
            }
            if (isAdded == false) {
                for (int j = 0; j < saturdayPlannedListLengths.size(); j++) {
                    if (Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))) <= saturdayPlannedListLengths.get(j)) {
                        saturdayList.add(j + offset, unplannedList.get(i));
                        // offset ++;
                        saturdayPlannedListLengths = DistanceLists.updateList(saturdayPlannedListLengths, j, Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))));
                        isAdded = true;
                        break;
                    }
                }
            }
            if (isAdded == false) {
                for (int j = 0; j < sundayPlannedListLengths.size(); j++) {
                    if (Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))) <= sundayPlannedListLengths.get(j)) {
                        sundayList.add(j + offset, unplannedList.get(i));
                        // offset ++;
                        sundayPlannedListLengths = DistanceLists.updateList(sundayPlannedListLengths, j, Integer.parseInt(String.valueOf(unplannedList.get(i).get(2))));
                        isAdded = true;
                        break;
                    }
                }
            }
        }
    }
}