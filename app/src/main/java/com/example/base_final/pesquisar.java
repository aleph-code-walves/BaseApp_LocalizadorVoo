package com.example.base_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class pesquisar extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    Adpater adpater;
    List<Modelclass> userlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisar);
        initData();
        initRecycle();


    }

    private void initData() {
        userlist = new ArrayList<>();

        userlist.add(new Modelclass(R.drawable.ic_local,"Florianópolis"));
    }


    private void initRecycle () {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adpater = new Adpater(userlist);
        recyclerView.setAdapter(adpater);
        adpater.notifyDataSetChanged();

    }





}
































