package com.example.dsm2017.blinkstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{


    Spinner spinner;

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner Main_spinner = (Spinner)findViewById(R.id.List);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.spinner_list,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Main_spinner.setAdapter(adapter);

        Main_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        mRecyclerView = findViewById(R.id.RecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<Row_Info> Row_InfoArrayList = new ArrayList<>();
        Row_InfoArrayList.add(new Row_Info("Item1", "notice1"));
        Row_InfoArrayList.add(new Row_Info("Item2", "notice2"));
        Row_InfoArrayList.add(new Row_Info("Item3", "notice3"));
        Row_InfoArrayList.add(new Row_Info("Item4", "notice4"));
        Row_InfoArrayList.add(new Row_Info("Item5", "notice5"));

        MyAdapter myAdapter = new MyAdapter(Row_InfoArrayList);

        mRecyclerView.setAdapter(myAdapter);
    }




}
