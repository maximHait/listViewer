package com.example.animalguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivFruit;
    ImageButton ibNum1;
    ImageButton ibNum2;
    ImageButton ibNum3;
    ImageButton ibNum4;
    ImageButton ibNum5;
    Button btnSwitch;
    Random rnd= new Random();
    int picNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivFruit = (ImageView)findViewById(R.id.ivFruit);
        ibNum1 = (ImageButton) findViewById(R.id.ibNum1);
        ibNum2 = (ImageButton)findViewById(R.id.ibNum2);
        ibNum3 = (ImageButton)findViewById(R.id.ibNum3);
        ibNum4 = (ImageButton)findViewById(R.id.ibNum4);
        ibNum5 = (ImageButton)findViewById(R.id.ibNum5);
        btnSwitch = (Button)findViewById(R.id.btnSwitch);

        ibNum1.setOnClickListener(this);
        ibNum2.setOnClickListener(this);
        ibNum3.setOnClickListener(this);
        ibNum4.setOnClickListener(this);
        ibNum5.setOnClickListener(this);

        picNum = rnd.nextInt(5) + 1;
        ivFruit.setImageResource(getResources().getIdentifier("pic" + picNum, "drawable", getPackageName()));
    }


    @Override
    public void onClick(View v) {
        if(v == ibNum1 && picNum == 1 || v == ibNum2 && picNum == 2 || v == ibNum3 && picNum == 3 ||  v == ibNum4 &&
                picNum == 4 || v == ibNum5 && picNum == 5)
        {
            Toast.makeText(this, "Good for you!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Try again!", Toast.LENGTH_LONG).show();
        }
    }

    public void Switch_Click(View view) {
        picNum = rnd.nextInt(5) + 1;
        ivFruit.setImageResource(getResources().getIdentifier("pic" + picNum, "drawable", getPackageName()));
    }

}
