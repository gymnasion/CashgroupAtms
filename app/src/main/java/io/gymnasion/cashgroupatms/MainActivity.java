package io.gymnasion.cashgroupatms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.gymnasion.cashgroupatms.data.Atm;
import io.gymnasion.cashgroupatms.data.Bank;
import io.gymnasion.cashgroupatms.data.City;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar appToolbar;
    @BindView(R.id.list) RecyclerView recyclerViewList;

    private AtmAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(appToolbar);

        setupAdapter();
        setupRecyclerView();
        setData();
    }

    private void setupAdapter() {
        adapter = new AtmAdapter();
    }

    private void setupRecyclerView() {
        recyclerViewList.setHasFixedSize(true);
        recyclerViewList.setAdapter(adapter);
    }

    private void setData() {
        List<Atm> input = new ArrayList<Atm>();
        input.add( new Atm(1, new Bank(1, "Bankhaus Neelmeyer"), new City(1, "Bremen"), "Schwachhauser Heerstr. 189-193", "28211", 53.0851,  8.84855));
        input.add( new Atm(2, new Bank(1, "Bankhaus Neelmeyer"), new City(2, "Bremerhaven"), "Am Alten Hafen 118", "27568", 53.5449, 8.57628));
        input.add( new Atm(3, new Bank(1, "Bankhaus Neelmeyer"), new City(1, "Bremen"), "Am Markt 14-16", "28195", 53.0756, 8.80692));
        input.add( new Atm(4, new Bank(2, "Berliner Bank"), new City(3, "Berlin"), "Takustraße 39", "14195", 52.457252, 13.293898));
        input.add( new Atm(5, new Bank(2, "Berliner Bank"), new City(3, "Berlin"), "Alt-Moabit 98", "10559", 52.524584, 13.346339));
        input.add( new Atm(6, new Bank(2, "Berliner Bank"), new City(3, "Berlin"), "Stadtrandstraße 555", "13589", 52.562522, 13.157638));
        input.add( new Atm(2, new Bank(1, "Bankhaus Neelmeyer"), new City(2, "Bremerhaven"), "Am Alten Hafen 118", "27568", 53.5449, 8.57628));
        input.add( new Atm(3, new Bank(1, "Bankhaus Neelmeyer"), new City(1, "Bremen"), "Am Markt 14-16", "28195", 53.0756, 8.80692));
        input.add( new Atm(5, new Bank(2, "Berliner Bank"), new City(3, "Berlin"), "Alt-Moabit 98", "10559", 52.524584, 13.346339));
        input.add( new Atm(6, new Bank(2, "Berliner Bank"), new City(3, "Berlin"), "Stadtrandstraße 555", "13589", 52.562522, 13.157638));
        adapter.setItemsList(input);
    }

}
