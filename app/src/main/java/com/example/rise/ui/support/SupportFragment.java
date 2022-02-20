package com.example.rise.ui.support;

import static com.example.rise.R.id.card_support_emergency;
import static com.example.rise.R.id.card_support_substance;
import static com.example.rise.R.id.card_support_suicide;

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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.rise.databinding.FragmentSupportBinding;

public class SupportFragment extends Fragment {

    private SupportViewModel supportViewModel;
    private FragmentSupportBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        supportViewModel =
                new ViewModelProvider(this).get(SupportViewModel.class);

        binding = FragmentSupportBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // final TextView textView = binding.textNotifications;
        supportViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                // textView.setText(s);
            }
        });
        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // The following code handles OnClick events for all cards on the support page
        // Start

        // The following code stores CardViews for each card
        CardView card_suicide = (CardView) view.findViewById(card_support_suicide);
        CardView card_substance = (CardView) view.findViewById(card_support_substance);
        CardView card_emergency = (CardView) view.findViewById(card_support_emergency); // creating a CardView and assigning a value.

        // Phone numbers
        String phoneNumberSuicide = "8002738255";
        String phoneNumberSubstance = "8777264727";
        String phoneNumberEmergency = "911";

        // On Click (Suicide) . . . call number
        card_suicide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumberSuicide)); // This should not be needed (in theory) as the application should already have the number.
                startActivity(intent);
            }
        });

        // On Click (Substance) . . . call number
        card_substance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumberSubstance)); // This should not be needed (in theory) as the application should already have the number.
                startActivity(intent);
            }
        });

        // On Click (Emergency) . . . call number
        card_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumberEmergency)); // This should not be needed (in theory) as the application should already have the number.
                startActivity(intent);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}