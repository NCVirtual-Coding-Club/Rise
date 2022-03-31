package com.example.rise.ui.agenda;

import java.util.ArrayList;

public class DistanceLists {

    public static ArrayList<Integer> calcDistance(ArrayList<ArrayList> array, ArrayList<Integer> distanceList) {
        // ArrayList<Integer> distanceList = new ArrayList<Integer>();


        if (!array.isEmpty()) {
            for (int i = 0; i <array.size(); i++) {
                int distance;

                if (array.get(i).get(5) == "false") { // TODO: Add FALSE
                    if (i == array.size() - 1 || distanceList.isEmpty()) { // If at end of array

                        if (distanceList.isEmpty()) {
                            distance = Integer.parseInt(String.valueOf(array.get(i).get(1)));
                            distanceList.add(distance);
                            if (array.size() > 1) {
                                distance = Integer.parseInt(String.valueOf(array.get(i + 1).get(1))) - Integer.parseInt(String.valueOf(array.get(i).get(2)));
                                distanceList.add(distance);
                            }

                        }

                        if (i == array.size() - 1) {
                            distance = Integer.parseInt(String.valueOf(array.get(i).get(2)));
                            distanceList.add(1440 - distance);
                        }


                    } else if (array.get(i).get(5) == "true"){
                        distance = Integer.parseInt(String.valueOf(array.get(i + 1).get(1))) - Integer.parseInt(String.valueOf(array.get(i).get(2)));
                        distanceList.add(distance);
                    }
                } else if (array.get(i).get(5) == "true"){
                    distanceList.set(i, distanceList.get(i) - Integer.parseInt(String.valueOf(array.get(i).get(2))));

                }
            }

        } else {
            distanceList.add(1440);
            return distanceList;
        }



        /*
        for (int i = 0; i < array.size(); i++) {
            int distance;
            if (i == 0) {
                distance = Integer.parseInt(String.valueOf(array.get(i).get(1)));
            } else if (i == array.size()-1) {
                distance = 2400 - Integer.parseInt(String.valueOf(array.get(i).get(2)));
            } else {
                distance = Integer.parseInt(String.valueOf(array.get(i + 1).get(2))) - Integer.parseInt(String.valueOf(array.get(i).get(1)));
            }
            distanceList.add(distance);
        }
        if (array.size() == 2) {
            distanceList.add(1, Integer.parseInt(String.valueOf(array.get(1).get(1))) - Integer.parseInt(String.valueOf(array.get(0).get(2))));
        }

         */

        return distanceList;
    }

    public static ArrayList<Integer> updateList(ArrayList<Integer> distanceList, int j, int duration) {
        distanceList.set(j, distanceList.get(j) - duration);


        return distanceList;
    }

}