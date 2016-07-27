package com.chapark.sampledesignsupportt;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class CollapsingActivity extends AppCompatActivity {

    AppBarLayout appBar;
    RecyclerView listView;
    MyAdapter myAdapter;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));

        listView =(RecyclerView)findViewById(R.id.rv_list);

    }
}
