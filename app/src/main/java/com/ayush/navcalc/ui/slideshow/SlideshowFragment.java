package com.ayush.navcalc.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ayush.navcalc.R;


public class SlideshowFragment extends Fragment implements View.OnClickListener {
    private Button btnSwap;
    private EditText etFirst,etSecond;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        slideshowViewModel =
//                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);

        etFirst=view.findViewById(R.id.etFirst);
        etSecond=view.findViewById(R.id.etSecond);
        btnSwap=view.findViewById(R.id.btnSwap);

        btnSwap.setOnClickListener(this);
        return view;
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        slideshowViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(etFirst.getText().toString());
        int second=Integer.parseInt(etSecond.getText().toString());

        etFirst.setText(Integer.toString(second));
        etSecond.setText(Integer.toString(first));

    }
}