package com.example.rise.ui.home;

import static com.example.rise.R.id.text_home_greetingWelcomeText;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rise.databinding.FragmentHomeBinding;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        System.out.println("Test");


        // Start: Controls the Welcome Message on the text_home_greetingWelcomeText TextView

        // gets hour using java.time
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH");
        int date = Integer.parseInt(myDateObj.format(myFormatObj));

        // gets user's name
        TextView welcomeText = null;
        String userSName = new String("Jonathan");
        welcomeText = (TextView) view.findViewById(text_home_greetingWelcomeText);

        // if there is no name
        if (userSName == null) {
            userSName = "";
        }

        // sets text based on hour
        if (date < 12) {
            welcomeText.setText("Good Morning " + userSName);
        } else if (date < 18) {
            welcomeText.setText("Good Afternoon " + userSName);
        } else {
            welcomeText.setText("Good Evening " + userSName);
        }
        // End

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}