package com.diyas.utswidiastuti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvsepatu;
    private ArrayList<Sepatu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvsepatu = findViewById(R.id.rv_sepatu);
        rvsepatu.setHasFixedSize(true);

        list.addAll(DataSepatu.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvsepatu.setLayoutManager(new LinearLayoutManager(this));
        ListSepatuAdapter listSepatuAdapter = new ListSepatuAdapter(list);
        rvsepatu.setAdapter(listSepatuAdapter);

        listSepatuAdapter.setOnItemClickCallback(new ListSepatuAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Sepatu data) {
                showSelectedSepatu(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.activity_main:
                showRecyclerList();
                break;
            case R.id.action_about:
                Intent about = new Intent(MainActivity.this,About.class);
                startActivity(about);

        }
    }


    private void showSelectedSepatu(Sepatu sepatu) {
        Intent detail = new Intent(MainActivity.this,DetailSepatu.class);
        detail.putExtra("SepatuImages", sepatu.getPhoto());
        detail.putExtra("SepatuNames", sepatu.getName());
        detail.putExtra("SepatuDetails", sepatu.getDetail());
        detail.putExtra("SepatuHarga", sepatu.getHarga());
        detail.putExtra("SepatuUkuran", sepatu.getUkuran());
        startActivity(detail);

        }
}
