package com.example.turtle.ui.func2;

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

public class Func2Fragment extends Fragment {

    private Func2ViewModel func2ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        func2ViewModel =
                ViewModelProviders.of(this).get(Func2ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_func2, container, false);
        return root;
    }
}
