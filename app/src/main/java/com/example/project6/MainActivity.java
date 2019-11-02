package com.example.project6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static final int LOGIN_REQUEST_CODE = 1;
    String recieveText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyGridLayout myGridLayout = new MyGridLayout(this);
        setContentView(myGridLayout);

        Button button = (Button) findViewById(0);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NoteActivity.class);
                startActivity(intent);
            }
        });

        ListView listView = new ListView(this);
        //setContentView(listView);
        List<String> userString = new ArrayList<>();
        userString.add(recieveText);
        Toast.makeText(this, "here: " + recieveText, Toast.LENGTH_LONG).show();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                userString
        );
        listView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == LOGIN_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            recieveText = data.getStringExtra("titleEditText");
            Toast.makeText(this, "here: " + recieveText, Toast.LENGTH_LONG).show();
        }
    }

}
