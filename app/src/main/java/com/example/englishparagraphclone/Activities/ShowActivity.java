package com.example.englishparagraphclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.englishparagraphclone.Adapters.Paragraph;
import com.example.englishparagraphclone.R;

public class ShowActivity extends AppCompatActivity {
    private TextView titleTv;
    private TextView detailsTv;
    public static final String EXTRA_SHOW_PAGE = "extra_page";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        titleTv= findViewById(R.id.titleTv);
        detailsTv = findViewById(R.id.detailsTv);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            final Paragraph paragraph = (Paragraph) intent.getSerializableExtra(EXTRA_SHOW_PAGE);
            titleTv.setText(paragraph.getTitle());
            detailsTv.setText(paragraph.getDescription());
        }
    }
    public void back(View view) {
        onBackPressed();
    }
}