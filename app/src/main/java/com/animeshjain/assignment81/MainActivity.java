package com.animeshjain.assignment81;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Collections;

import static java.util.Arrays.sort;

public class MainActivity extends AppCompatActivity implements OnClickListener{


    Button descendingBtn, ascendingBtn;
    ListView listView;
//    Initializing the ARRAY with the lsitView Contents
    String[] monthsName = new String[]{"January","February","March","April","May","June","July","August","September",
            "October","November","December"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Initializing the Objects of the Components
        listView= (ListView)findViewById(R.id.listView);

        ascendingBtn = (Button)findViewById(R.id.ascendingBtn);
        descendingBtn= (Button)findViewById(R.id.descendingBtn);

        descendingBtn.setOnClickListener(this);
        ascendingBtn.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
//        Preforming a check on which button User Pressed
        if(view.getId()==R.id.ascendingBtn){

            Toast.makeText(this, "You Just Pressed The Ascending Button", Toast.LENGTH_SHORT).show();
//            Sorting the Content of Array in the Ascending Order using Sort() of Array

            sort(monthsName);
//            Setting Array Adapter and Passing the Array to the Adapter

            final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,
                    android.R.layout.simple_list_item_1,monthsName);
//            Passing the Adapter to the ListView to Populate the Contents
            listView.setAdapter(adapter);

        }
            else{
            Toast.makeText(MainActivity.this, "You Just Pressed The Descending Button", Toast.LENGTH_SHORT).show();

//            Sorting the Content of Array in the Descending Order using Sort(), Collections.reverseOrder of Array

            sort(monthsName, Collections.reverseOrder());
//            Setting Array Adapter and Passing the Array to the Adapter

            final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,
                    android.R.layout.simple_list_item_1,monthsName);
//            Passing the Adapter to the ListView to Populate the Contents

            listView.setAdapter(adapter);
        }
    }
}



