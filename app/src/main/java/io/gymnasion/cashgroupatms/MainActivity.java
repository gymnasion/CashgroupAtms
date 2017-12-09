package io.gymnasion.cashgroupatms;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar appToolbar;

    @BindView(R.id.list) RecyclerView recyclerViewList;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(appToolbar);

        recyclerViewList.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerViewList.setLayoutManager(layoutManager);

        // Dummy data for adapter
        List<String> input = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            input.add(String.valueOf(i));
        }

        adapter = new AtmAdapter(input);
        recyclerViewList.setAdapter(adapter);
    }
}
