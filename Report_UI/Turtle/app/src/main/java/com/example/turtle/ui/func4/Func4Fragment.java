package com.example.turtle.ui.func4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.turtle.R;

public class Func4Fragment extends Fragment {

    private Func4ViewModel func4ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        func4ViewModel =
                ViewModelProviders.of(this).get(Func4ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_func4, container, false);
        return root;
    }
}
