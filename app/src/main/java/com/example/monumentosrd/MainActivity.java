package com.example.monumentosrd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    ListView lista;
    Adaptador eladacter;

    //EditText buscador;
    String[][] lugar = {
            {"altarpatria", "9", "dinero"},
            {"farocolon", "8", "Malecon"},
            {"bien", "9", "malencon"},
            {"dinero", "9", "malencon"},
            {"dinero", "9", "malencon"},
            {"dinero", "9", "malencon"},
            {"dinero", "9", "malencon"},
    };
    int[] lugarimg = {R.drawable.altarpatria, R.drawable.farocolon, R.drawable.bien};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lista = findViewById(R.id.list);
        eladacter = new Adaptador(this, lugar, lugarimg);
        lista.setAdapter(eladacter);

    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem item= menu.findItem(R.id.app_bar);
        SearchView SearchView = (SearchView) MenuItemCompat.getActionView(item);
        SearchView.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }


}
