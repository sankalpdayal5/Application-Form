package com.example.sankalpdayal.applicationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


import com.example.sankalpdayal.applicationform.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] yoj={"2014","2015","2016","2017"};
    String[] course={"B. Tech","M. Tech","PhD"};
    String[] school={"SCOPE","SITE","SENSE","SELECT","SMEC"};
    String[] homes={"Bihar","Assam","Andhra Pradesh","Tamil Nadu","Kerela","West Bengal","Uttar Pradesh",""};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin1=(Spinner)findViewById(R.id.spinner3);
        spin1.setOnItemSelectedListener(this);
        ArrayAdapter a1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,course);
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(a1);

        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,yoj);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        Spinner spin2=(Spinner)findViewById(R.id.spinner5);
        spin2.setOnItemSelectedListener(this);
        ArrayAdapter a2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,school);
        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(a2);

        Spinner spin3=(Spinner)findViewById(R.id.spinner4);
        spin3.setOnItemSelectedListener(this);
        ArrayAdapter a3 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,homes);
        a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(a3);
    }
    public void radio(){


    }



    public void submit (View v){
        Toast.makeText(this, "Submitted Successfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}