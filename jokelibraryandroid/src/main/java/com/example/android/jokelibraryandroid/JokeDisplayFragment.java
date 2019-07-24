package com.example.android.jokelibraryandroid;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Objects;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeDisplayFragment extends Fragment {

    private static final String JOKE_EXTRA = "Joke";

    public JokeDisplayFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.joke_fragment, container, false);
        String joke = (getActivity()).getIntent().getStringExtra(JOKE_EXTRA);
        TextView textView = view.findViewById(R.id.joke);
        textView.setText(joke);
        return view;
    }
}
