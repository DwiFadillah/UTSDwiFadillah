package com.example.uts_dwifadillah;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_listview extends Fragment {

    public activity_listview(){

    }

    public static ArrayList<Shape> shappeList = new ArrayList<Shape>();
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.activity_listview, container, false);
        setupData();

        listView = v.findViewById(R.id.shapeListview);
        shape_cell adapter = new shape_cell(getContext(), 0, shappeList);
        listView.setAdapter(adapter);

        setupOnClickListener();
        return v;
    }

    public void setupData(){
        Shape ayamgeprek = new Shape("0", "Ayam Geprek       15K", R.drawable.ayamgeprek);
        shappeList.add(ayamgeprek);

        Shape buburayam = new Shape("1", "Bubur Ayam         10K", R.drawable.buburayam);
        shappeList.add(buburayam);

        Shape kacangijo = new Shape("2", "Bubur K.Ijo        10K", R.drawable.kacangijo);
        shappeList.add(kacangijo);

        Shape miegoreng = new Shape("3", "Mie Goreng       10K", R.drawable.miegoreng);
        shappeList.add(miegoreng);

        Shape miekuah = new Shape("4", "Mie Kuah           8K", R.drawable.miekuah);
        shappeList.add(miekuah);

        Shape nasigoreng = new Shape("5", "Nasi Goreng        12K", R.drawable.nasigoreng);
        shappeList.add(nasigoreng);

        Shape rotibakar = new Shape("6", "Roti Bakar          7K", R.drawable.rotibakar);
        shappeList.add(rotibakar);

        Shape escokelat = new Shape("7", "Es Cokelat          6K", R.drawable.escokelat);
        shappeList.add(escokelat);

        Shape esjeruk = new Shape("8", "Es Jeruk         5K", R.drawable.esjeruk);
        shappeList.add(esjeruk);

        Shape kopi = new Shape("9", "Kopi               5K", R.drawable.kopi);
        shappeList.add(kopi);

        Shape sate = new Shape("10", "Sate             10K", R.drawable.sate);
        shappeList.add(sate);
    }

    private void setupOnClickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shape selectShape = (Shape) listView.getItemAtPosition(i);
                Intent showDetail = new Intent(getContext(), activity_list_detail.class);
                showDetail.putExtra("id", selectShape.getId());
                startActivity(showDetail);
            }
        });
    }
}
