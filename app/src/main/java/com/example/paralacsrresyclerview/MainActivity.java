package com.example.paralacsrresyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.listItem);
        recyclerView.setAdapter(new Adaptar(getSample()));
    }

    private List<SampelEntiti> getSample() {
        List<SampelEntiti> list = new ArrayList<>();
        list.add(new SampelEntiti("Mala", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ41W5socj2wmF3BwR0jLOCQuK2n2nwr-bq5EsnlPkEOCaAZesP8Q"));
        list.add(new SampelEntiti("AG", "https://pp.userapi.com/c628425/v628425327/1397a/WMGEWMVLUqw.jpg?ava=1"));
        list.add(new SampelEntiti("JHJ", "https://i1.sndcdn.com/artworks-000319023324-n8b2zr-t500x500.jpg"));
        list.add(new SampelEntiti("Mala", "https://russian7.ru/wp-content/uploads/2017/10/1-37-3.jpg"));
        list.add(new SampelEntiti("LHI", "https://images-na.ssl-images-amazon.com/images/I/718I5%2B2%2BjIL._SX466_.jpg"));
        list.add(new SampelEntiti("ETRWT", "http://krhl.ru/preview/images/logos/team/x300_09092016022012_sparta-hk-dr.png"));
        list.add(new SampelEntiti("Mala", "https://hockey39.ru/uploads/championships/x300085444-57f21cd4c0411-93abe56e14.png"));
        return list;
    }
}
