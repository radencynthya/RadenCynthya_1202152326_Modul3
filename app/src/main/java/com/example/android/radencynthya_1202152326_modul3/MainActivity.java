package com.example.android.radencynthya_1202152326_modul3;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecylerView;
    private ArrayList<Air> mAirData;
    private AirAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecylerView = (RecyclerView) findViewById(R.id.viewRecycle);

        mRecylerView.setLayoutManager(new LinearLayoutManager(this));

        mAirData = new ArrayList<>();

        mAdapter = new AirAdapter(this, mAirData);
        mRecylerView.setAdapter(mAdapter);

        initializeData();
    }

    private void initializeData() {
        String[] airList = getResources().getStringArray(R.array.air_namaAir);
        String[] airInfo = getResources().getStringArray(R.array.air_info);
        TypedArray sportsImageResources =
                getResources().obtainTypedArray(R.array.sports_images);


        mAirData.clear();

        for (int i = 0; i < airList.length; i++) {
            mAirData.add(new Air(airList[i], airInfo[i],
                    sportsImageResources.getResourceId(i, 0)));
        }

        sportsImageResources.recycle();


        mAdapter.notifyDataSetChanged();
}
    public void resetSports(View view) {
        initializeData();
    }
}
