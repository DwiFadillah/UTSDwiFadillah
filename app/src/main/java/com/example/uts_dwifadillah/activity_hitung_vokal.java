package com.example.uts_dwifadillah;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_hitung_vokal extends Fragment implements OnClickListener {

    EditText et;
    TextView tv;
    Button btn_hitung;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_hitung_vokal, container, false);
        et = v.findViewById(R.id.editText);
        tv = v.findViewById(R.id.text_jumlah);
        btn_hitung = v.findViewById(R.id.btn_hitung);

        btn_hitung.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String teks = et.getText().toString();
                String[] listVokal = {"A", "E", "I", "O", "U"};

                int jumlahVokal = 0;
                int i, j;
                boolean vokal;

                for (i = 0; i < teks.length(); i++) {
                    int keyCode = teks.charAt(i);
                    if (((keyCode >= 65) && (keyCode <= 90)) || ((keyCode >= 97) && (keyCode <= 122))) {
                        vokal = false;
                        j = 0;
                        while ((j < listVokal.length) && !vokal) {
                            if (teks.substring(i, i + 1).equalsIgnoreCase(listVokal[j++])) {
                                vokal = true;
                            }
                        }
                        if (vokal) {
                            jumlahVokal++;
                        }
                    }
                }
                tv.setText(Integer.toString(jumlahVokal));
            }
        });
        return v;
    }

    @Override
    public void onClick(View view) {

    }
}