package com.example.uts_dwifadillah;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class activity_alert extends Fragment implements OnClickListener {
    private String[] items = {"Short", "Long"};
    private Spinner spinner;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState){
        View v = layoutInflater.inflate(R.layout.activity_alert, container, false);
        spinner = v.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, items);
        spinner.setAdapter(adapter);

        Button btn1, btn2, btn3, btn4;
        btn1 = v.findViewById(R.id.btn_alert1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alert1 = new AlertDialog.Builder(getContext()).create();
                alert1.setTitle("Notifikasi Food");
                alert1.setMessage("Pesanan akan diproses");
                alert1.setIcon(R.mipmap.ic_launcher_round);
                alert1.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getContext(), "Selamat Menikmati Makanan...", Toast.LENGTH_SHORT).show();
                    }
                });
                alert1.show();

            }
        });
        btn2 = v.findViewById(R.id.btn_alert2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder alert2 = new AlertDialog.Builder(getContext());
                alert2.setTitle("Notifikasi Drink");
                alert2.setMessage("Pesanan akan diproses");
                alert2.setIcon(R.mipmap.ic_launcher_round);
                alert2.setPositiveButton("Ya", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(getContext(), "Selamat Menikmati Minumannya...", Toast.LENGTH_SHORT).show();
                    }
                });
                alert2.setNegativeButton("Tidak", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(getContext(), "Anda membatalkan pesanan", Toast.LENGTH_SHORT).show();
                        alert2.show();
                    }
                });
                alert2.show();

            }
        });

        btn3 = v.findViewById(R.id.btn_alert3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder alert3 = new AlertDialog.Builder(getContext());
                alert3.setTitle("Notifikasi Snack");
                alert3.setMessage("Pesanan akan diproses");
                alert3.setIcon(R.mipmap.ic_launcher_round);
                alert3.setPositiveButton("Ya", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(getContext(), "Selamat Menikmati Cemilan...", Toast.LENGTH_SHORT).show();
                    }
                });
                alert3.setNegativeButton("Tidak", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(getContext(), "Anda membatalkan pesanan", Toast.LENGTH_SHORT).show();
                        alert3.show();
                    }
                });
                alert3.show();

            }
        });

        btn4 = v.findViewById(R.id.btn_toast);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (spinner.getSelectedItemPosition() == 0){
                    Toast.makeText(getContext(), "Toast Short", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "Toast Long", Toast.LENGTH_LONG).show();
                }
            }
        });
        return v;
    }

    @Override
    public void onClick(View view) {

    }
}
