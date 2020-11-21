package com.example.englishparagraphclone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.englishparagraphclone.Adapters.MyAdapter;
import com.example.englishparagraphclone.Adapters.Paragraph;
import com.example.englishparagraphclone.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private List<Paragraph> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerviewId);
        setSupportActionBar(toolbar);
        list = new ArrayList<>();

        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));
        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));
        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));
        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));
        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));
        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));
        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));
        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));
        list.add(new Paragraph("A Book Fair I Visited","A Book faklhskljfhskfjsgbshkfs"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter listAdapter = new MyAdapter(this);
        listAdapter.setListQuotes((ArrayList<Paragraph>) list);
        recyclerView.setAdapter(listAdapter);
    }
}