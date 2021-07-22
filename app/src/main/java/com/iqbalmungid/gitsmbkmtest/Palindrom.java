package com.iqbalmungid.gitsmbkmtest;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.iqbalmungid.gitsmbkmtest.R;
import com.iqbalmungid.gitsmbkmtest.databinding.FragmentWaktuBinding;

public class Palindrom extends Fragment {

    //deklarasi komponen
    private EditText inputPal;
    private Button tombolPal;
    private TextView hasilPal;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_palindrom, container, false);

        inputPal = (EditText) view.findViewById(R.id.inPal);
        tombolPal = (Button) view.findViewById(R.id.hasilPal);
        hasilPal = (TextView) view.findViewById(R.id.txtPal);

        tombolPal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekPal(inputPal);
            }
        });

        return view;
    }

    private void cekPal(EditText inputPal) {
        String txtAsli = inputPal.getText().toString();
        String txtPalin = "";
        int panjang = txtAsli.length();
        for (int index = panjang -1; index>=0; index--){
            txtPalin = txtPalin + txtAsli.charAt(index);
        }
        if (txtAsli.equals(txtPalin)){
            hasilPal.setText("Kata merupakan Palindrom");
        } else {
            hasilPal.setText("Kata bukan Palindrom");
        }

    }

}