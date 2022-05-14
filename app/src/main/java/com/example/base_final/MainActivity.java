package com.example.base_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText button = (EditText) findViewById(R.id.labelpesquisa);




        int imgArray[]={R.drawable.navegantes,R.drawable.sao_paulo,R.drawable.curtiba,R.drawable.voe_marketing};
        flipper=(ViewFlipper) findViewById(R.id.Flip);

        for(int i = 0; i<imgArray.length;i++){
            showimage(imgArray[i]);
        }

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this,pesquisar.class);
                startActivity(it);

            }
        });

    }

    public void showimage(int idImg){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(idImg);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}