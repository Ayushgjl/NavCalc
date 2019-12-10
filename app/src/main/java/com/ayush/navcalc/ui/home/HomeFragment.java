package com.ayush.navcalc.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ayush.navcalc.R;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private Button btnarea;
    private EditText etradius;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel =
//         ViewModelProviders.of(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        etradius=view.findViewById(R.id.etradius);
        btnarea=view.findViewById(R.id.btnarea);

        btnarea.setOnClickListener(this);
        return view;
//        final TextView textView = root.findViewById(R.id.text_home);
//         homeViewModel.getText().observe(this, new Observer<String>() {
//         @Override
//         public void onChanged(@Nullable String s) {
//         textView.setText(s);
//        }
//         });
//        return root;
    }
    @Override
    public void onClick(View v) {
        float radius=Integer.parseInt(etradius.getText().toString());
        float area=3.14f*radius*radius;
        Toast.makeText(getActivity(),"Area of Circle : " + area, Toast.LENGTH_SHORT).show();

    }
}