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

public class Reverse extends Fragment {

    //deklarasi komponen
    private EditText editKata;
    private Button tombolnya;
    private TextView hasilKata;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reverse, container, false);

        editKata = (EditText) view.findViewById(R.id.kata);
        tombolnya = (Button) view.findViewById(R.id.btnHasil);
        hasilKata = (TextView) view.findViewById(R.id.txtHasil);

        tombolnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                balikKata(editKata);
            }
        });

        return view;
    }

    private void balikKata(EditText editKata) {
        String kataTxt = editKata.getText().toString();
        StringBuffer buff = new StringBuffer(kataTxt);
        buff.reverse();

        hasilKata.setText(buff);
    }

}