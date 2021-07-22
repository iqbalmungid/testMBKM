package com.iqbalmungid.gitsmbkmtest.ui.gallery;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.iqbalmungid.gitsmbkmtest.R;
import com.iqbalmungid.gitsmbkmtest.databinding.FragmentCekBinding;

public class GalleryFragment extends Fragment {


    //deklarasi komponen
    private EditText inputEmail;
    private Button tombolCek;
    private TextView hasil;

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cek, container, false);

        inputEmail = (EditText) view.findViewById(R.id.editEmail);
        tombolCek = (Button) view.findViewById(R.id.buttonCek);
        hasil = (TextView) view.findViewById(R.id.textHasil);

        tombolCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailValidator(inputEmail);
            }
        });

        return view;
    }

    private void emailValidator(EditText inputEmail) {
        String emailToText = inputEmail.getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]{1,20}+@[a-z]{1,10}+\\.+[id]{2}+";
        String emailPattern2 = "[a-zA-Z0-9._-]{1,20}+@[a-z]{1,10}+\\.+[co]{2}+\\.+[id]{2}+";

        if (!emailToText.isEmpty() && emailToText.matches(emailPattern) || emailToText.matches(emailPattern2)) {
            hasil.setText("Format Email Sudah Benar");
            Toast.makeText(getView().getContext(), "Email Benar !", Toast.LENGTH_SHORT).show();
        } else {
            hasil.setText("Format Email Belum Benar");
            Toast.makeText(getView().getContext(), "Email Salah !", Toast.LENGTH_SHORT).show();
        }
    }

}