package com.iqbalmungid.gitsmbkmtest.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.iqbalmungid.gitsmbkmtest.R;

public class HomeFragment extends Fragment {

    //deklarasi komponen
    private EditText inputAngka;
    private Button tombolResult;
    private TextView hasilnya;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hello, container, false);

        inputAngka = (EditText) view.findViewById(R.id.nomer);
        tombolResult = (Button) view.findViewById(R.id.butHasil);
        hasilnya = (TextView) view.findViewById(R.id.result);


        tombolResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outHasil(inputAngka);
            }
        });


        return view;
    }

    private void outHasil(EditText inputAngka) {
        String bil = inputAngka.getText().toString();
        int bila = Integer.parseInt(bil);
        String h;
        String w;
        String hw;

        if(bila%3==0 && bila%5==0){
            hw = "Hello World";
            hasilnya.setText(hw);
        } else if(bila%5==0){
            w = "World";
            hasilnya.setText(w);
        } else if(bila%3==0){
            h = "Hello";
            hasilnya.setText(h);
        } else {
            hasilnya.setText(" ");
            Toast.makeText(getView().getContext(), "Tidak habis dibagi 3 atau 5", Toast.LENGTH_SHORT).show();
        }


    }

}