package com.example.rise.ui.learn;

import static com.example.rise.R.id.card_learn_aid;
import static com.example.rise.R.id.card_learn_drugs;
import static com.example.rise.R.id.card_learn_living;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.rise.R;
import com.example.rise.databinding.FragmentLearnBinding;

public class LearnFragment extends Fragment {

    private LearnViewModel learnViewModel;
    private FragmentLearnBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        learnViewModel =
                new ViewModelProvider(this).get(LearnViewModel.class);

        binding = FragmentLearnBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CardView drugsAlcohol = (CardView) view.findViewById(card_learn_drugs);
        drugsAlcohol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_learn_to_drugsAlcohol);
            }
        });

        CardView firstAid = (CardView) view.findViewById(card_learn_aid);
        firstAid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_learn_to_firstAid2);
            }
        });

        CardView other = (CardView) view.findViewById(card_learn_living);
        other.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/e/2PACX-1vTtL6NWKUNDsru6nVP20psm648sMHVIgmdwVHxSkMWbxDeCuxbIMuUOAb7SxUL96HKhVgpTCvTJlXlS/pub"));
                startActivity(browserIntent);            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}