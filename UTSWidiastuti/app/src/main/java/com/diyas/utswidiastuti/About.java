package com.diyas.utswidiastuti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class About extends AppCompatActivity {
    Toolbar back;
    ImageView aku;
    TextView name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        back = findViewById(R.id.beck);
        setSupportActionBar(back);


        aku = findViewById(R.id.aku);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void setSupportActionBar(Toolbar back) {
    }
}
