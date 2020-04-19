package com.yyy.myapplicationbu0317;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String[] biaoti = {"哈哈","vvvs","sssa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> spq =  new ArrayAdapter<String>(
                        MainActivity.this,
                android.R.layout.simple_list_item_1,
                biaoti
        );
        ListView spsp = findViewById(R.id.spsp);
        spsp.setAdapter(spq);
        spsp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"你好",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
