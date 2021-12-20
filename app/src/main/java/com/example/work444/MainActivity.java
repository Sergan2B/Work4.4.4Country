package com.example.work444;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements onClickItem{

    private ArrayList<Matheric> dataMatheric;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load();
        initRecycleView();
    }

    private void initRecycleView() {
        recyclerView = findViewById(R.id.recycleViewFirst);
        Adapter adapter = new Adapter(dataMatheric, this, this);
        recyclerView.setAdapter(adapter);
    }

    private void load() {
        dataMatheric = new ArrayList<>();
        dataMatheric.add(new Matheric("https://pbs.twimg.com/media/ETYE5oqXgAIt9p1.jpg", "Африканский материк"));
        dataMatheric.add(new Matheric("https://pbs.twimg.com/media/ENYcu66WsAABflp.jpg", "Евразийский материк"));
        dataMatheric.add(new Matheric("https://phonoteka.org/uploads/posts/2021-05/1620871833_19-phonoteka_org-p-severnaya-amerika-fon-23.jpg", "Северо-Американский материк"));
        dataMatheric.add(new Matheric("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/South_America_%28orthographic_projection%29.svg/570px-South_America_%28orthographic_projection%29.svg.png", "Южно-Американский материк"));
        dataMatheric.add(new Matheric("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Australia_%28orthographic_projection%29.svg/1024px-Australia_%28orthographic_projection%29.svg.png", "Австралийский материк"));
        dataMatheric.add(new Matheric("https://avatars.mds.yandex.net/i?id=65fa5eb016833e47973018fbd0ffd912-4623308-images-thumbs&n=13", "Антарктический материк"));
    }

    @Override
    public void onClick(int pos) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Africa14", pos);
        startActivity(intent);
        Toast.makeText(this, "Click" + pos, Toast.LENGTH_SHORT).show();
    }
}