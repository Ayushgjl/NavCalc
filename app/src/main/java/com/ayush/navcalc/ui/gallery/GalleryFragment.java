package com.ayush.navcalc.ui.gallery;

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


public class GalleryFragment extends Fragment implements View.OnClickListener {
    private Button btnPal;
    private EditText etPal;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //  galleryViewModel =
        //  ViewModelProviders.of(this).get(GalleryViewModel.class);
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        etPal=view.findViewById(R.id.etPal);
        btnPal=view.findViewById(R.id.btnPal);

        btnPal.setOnClickListener(this);
        return view;
        // final TextView textView = root.findViewById(R.id.text_gallery);
        // galleryViewModel.getText().observe(this, new Observer<String>() {
        // @Override
        // public void onChanged(@Nullable String s) {
        //   textView.setText(s);
        //  }
        //  });
        // return root;
    }

    @Override
    public void onClick(View v) {
        int pal=Integer.parseInt(etPal.getText().toString());

        Palindrome palindrome=new Palindrome();
        int result=palindrome.reverse(pal);

        if (result==pal)
        {
            Toast.makeText(getActivity(),pal + " is palindrome",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getActivity(),pal + " is not palindrome",Toast.LENGTH_SHORT).show();
        }

    }
}