package com.example.recyclerexe1;

import android.content.ClipData;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FruitActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fruit);


        initUI();
        setupRecyclerView();

    }

    private void setupRecyclerView() {
        //this is the array
        ArrayList<ItemFruit> fruitList = new ArrayList<>();
        fruitList.add(new ItemFruit("Apple",R.drawable.apple,"Very Tasty"));
        fruitList.add(new ItemFruit("Banana",R.drawable.banana,"It is Yellow!"));
        fruitList.add(new ItemFruit("Cherry",R.drawable.cherry,"Wow, its expensive"));
        fruitList.add(new ItemFruit("Grapes",R.drawable.grapes,"like candy"));
        fruitList.add(new ItemFruit("Pear", R.drawable.pear,"Comes in couples"));
        fruitList.add(new ItemFruit("Watermelon",R.drawable.watermelon,"Red on the inside Green on the outside"));

        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initUI() {
        recyclerView = findViewById(R.id.fruitRecyclerView);
    }


}