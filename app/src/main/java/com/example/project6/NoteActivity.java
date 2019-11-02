package com.example.project6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class NoteActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] choice = {"Personal", "School", "Work", "Other"};
    String titleInput = "hello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get the intent
        Intent intent = getIntent();

        //Declare GridLayout and spinner
        MyGridLayout2 myGridLayout2 = new MyGridLayout2(this);
        setContentView(myGridLayout2);
        Spinner spin = (Spinner) findViewById(3);

        //Spinner creation with ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, choice);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);

        Button button = (Button) findViewById(4);
        button.setText("Done");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("titleEditText", titleInput);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }

    //Functions to declare ArrayAdapter.onItemSelectedListener
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), "Selected: " + choice[position],Toast.LENGTH_LONG).show();;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
