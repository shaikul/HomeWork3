package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> list;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();
        initRecycler();
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recyclerRV);
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        list = new ArrayList<>();
        list.add(new Model(R.drawable.foto1,"Бразилия","Бразилия"));
        list.add(new Model(R.drawable.img,"Кыргызстан","Бишкек"));
        list.add(new Model(R.drawable.imgd,"Казахстан","Астана"));
        list.add(new Model(R.drawable.imgk,"ОАЭ","Абу-Даби"));
        list.add(new Model(R.drawable.imgt,"Россия","Москва"));
        list.add(new Model(R.drawable.foto1,"Бразилия","Бразилия"));
        list.add(new Model(R.drawable.img,"Кыргызстан","Бишкек"));
        list.add(new Model(R.drawable.imgd,"Казахстан","Астана"));
        list.add(new Model(R.drawable.imgk,"ОАЭ","Абу-Даби"));
        list.add(new Model(R.drawable.imgt,"Россия","Москва"));
    }

}