package com.aditya.multiplicationtables_1_to_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    SeekBar seekBar;
    ListView listView;


    /*//mycode
    static int i;
    int result,j;
    String textList;*/






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.textView);
        seekBar= findViewById(R.id.seekBar);
        listView= findViewById(R.id.listView);

        seekBar.setMax(10);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Toast.makeText(MainActivity.this, "Table of  "+ progress, Toast.LENGTH_SHORT).show();
                populate(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

        public void populate(int table) {

        ArrayList<String> mulTable= new ArrayList<>();
        for (int i=1;i<=10;i++)  {
            mulTable.add(table + " X " + i + " = " + table*i);
        }
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mulTable);
        listView.setAdapter(arrayAdapter);
        textView.setText("Multiplication Table of "+table);





        }

      /* //MyCode
        ArrayList<String> table= new ArrayList<>();
        final SeekBar seekTable= findViewById(R.id.seekBar);
        ListView myList=findViewById(R.id.List_Table);



       *//* i= seekTable.getProgress();
        ArrayList<String> table= new ArrayList<>();

        for( j=1;j<=10;j++)  {
             result= i*j;
             textList = i +" * " + j + " = " + result;
             table.add(textList);
        }*//*

        seekTable.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {

              //  ListView myList=findViewById(R.id.List_Table);



                for( j=1;j<=10;j++) {
                    result = i * j;
                    textList = i + " * " + j + " = " + result;
                    table.add(textList);
                }

              //  ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, table);
             //   myList.setAdapter(arrayAdapter);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        *//* ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, table);
        myList.setAdapter(arrayAdapter); *//*



    }

    public void mul()   {

     }*/

}