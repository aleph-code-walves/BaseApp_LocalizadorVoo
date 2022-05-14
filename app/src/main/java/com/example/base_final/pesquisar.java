package com.example.base_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        EditText button = (EditText) findViewById(R.id.labelpesquisa);

        setContentView(R.layout.activity_pesquisar);
        initData();
        initRecycle();

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(pesquisar.this, Voolayout.class);
                startActivity(it);

            }
        });


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
































