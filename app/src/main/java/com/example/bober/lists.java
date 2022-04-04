package com.example.bober;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ContentInfoCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class lists extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lists);
        listView = findViewById(R.id.lists);
        final String[] Sity = new String[]{
                "Ангарск", "Иркутск", "Москва", "Санкт-Петербург", "Красноярск",
                "Новосибирск", "Екатеринбург", "Сочи"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Sity);
        listView.setAdapter(adapter);
        final String[] musei1 = new String[]{
                "Музей трудовой славы AЭХК","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч",
                "ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч","ч",
        };
        ArrayAdapter<String> mus1= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, musei1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {

                String name = ((TextView)itemClicked).getText().toString();
                if (name == "Ангарск") {
                    listView.setAdapter(mus1);
                }else{
                    if (name == "Музей трудовой славы AЭХК"){
                        startActivity (new Intent(lists.this, museums.class));
                    }else{
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "В разработке", Toast.LENGTH_SHORT);
                    toast.show();}

                }
            }

        });
    }
    public void onBackPressed(){
        final String[] Sity = new String[]{
                "Ангарск", "Иркутск", "Москва", "Санкт-Петербург", "Красноярск",
                "Новосибирск", "Екатеринбург", "Сочи"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Sity);
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.mexit, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.mexit:
                finish(); //TODO завершить приложение
        }
        return true;
    }
}


