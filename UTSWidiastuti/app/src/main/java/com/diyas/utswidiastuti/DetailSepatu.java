package com.diyas.utswidiastuti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetailSepatu extends AppCompatActivity {
    Toolbar back;
    ImageView imagesepatu;
    TextView namesepatu, detailsepatu, hargasepatu, ukuransepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sepatu);

        imagesepatu = findViewById(R.id.Sneakers);
        namesepatu = findViewById(R.id.item_name);
        detailsepatu = findViewById(R.id.item_detail);
        hargasepatu = findViewById(R.id.item_harga);
        ukuransepatu = findViewById(R.id.item_ukuran);


        back = findViewById(R.id.beck);
        setSupportActionBar(back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        int photo = getIntent().getIntExtra("SepatuImages", 0);
        String nama = getIntent().getStringExtra("SepatuNames");
        String deskripsi = getIntent().getStringExtra("SepatuDetails");
        String Harga = getIntent().getStringExtra("SepatuHarga");
        String Ukuran = getIntent().getStringExtra("SepatuUkuran");
        imagesepatu.setImageResource(photo);
        namesepatu.setText(nama);
        detailsepatu.setText(deskripsi);
        hargasepatu.setText(Harga);
        ukuransepatu.setText(Ukuran);
    }

    private void setSupportActionBar(Toolbar back) {
    }
}
