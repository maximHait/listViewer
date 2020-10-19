package com.example.listviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Toy> toyList;
    ToyAdapter toyAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);

        Bitmap home0 = BitmapFactory.decodeResource(getResources(), R.drawable.car0);
        Bitmap home1 = BitmapFactory.decodeResource(getResources(), R.drawable.car1);
        Bitmap home2 = BitmapFactory.decodeResource(getResources(), R.drawable.car2);
        Bitmap light0 = BitmapFactory.decodeResource(getResources(), R.drawable.an0);
        Bitmap light1 = BitmapFactory.decodeResource(getResources(), R.drawable.an1);
        Bitmap light2 = BitmapFactory.decodeResource(getResources(), R.drawable.an2);
        Bitmap phone0 = BitmapFactory.decodeResource(getResources(), R.drawable.ice0);
        Bitmap phone1 = BitmapFactory.decodeResource(getResources(), R.drawable.ice1);
        Bitmap phone2 = BitmapFactory.decodeResource(getResources(), R.drawable.ice2);


        Toy t1 = new Toy(50,"car","very good toy",home0);
        Toy t2 = new Toy(70,"car","average  toy",home1);
        Toy t3 = new Toy(90,"car","nice toy",home2);
        Toy t4 = new Toy(29,"animal","very good toy",light0);
        Toy t5 = new Toy(37,"animal","average  toy",light1);
        Toy t6 = new Toy(50,"animal","nice toy",light2);
        Toy t7 = new Toy(29,"ice-cream","very good toy",phone0);
        Toy t8 = new Toy(37,"ice-cream","average  toy",phone1);
        Toy t9 = new Toy(50,"ice-cream","nice toy",phone2);


        //phase 2 - add to array list
        toyList = new ArrayList<Toy>();
        toyList.add(t1);toyList.add(t2);toyList.add(t3);
        toyList.add(t4);toyList.add(t5);toyList.add(t6);
        toyList.add(t7);toyList.add(t8);toyList.add(t9);

        //phase 3 - create adapter
        toyAdapter=new ToyAdapter(this,0,0,toyList);
        //phase 4 reference to listview
        lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(toyAdapter);

    }
}
