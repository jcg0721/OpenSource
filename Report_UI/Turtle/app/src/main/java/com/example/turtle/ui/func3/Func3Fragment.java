package com.example.turtle.ui.func3;

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

public class Func3Fragment extends Fragment {

    private Func3ViewModel func3ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        func3ViewModel =
                ViewModelProviders.of(this).get(Func3ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_func3, container, false);
        return root;
    }
}
