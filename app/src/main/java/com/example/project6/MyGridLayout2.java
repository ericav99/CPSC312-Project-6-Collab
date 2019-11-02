package com.example.project6;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MyGridLayout2 extends GridLayout{

    public MyGridLayout2(final Context context) {
        super(context);

        Button myButton = new Button(context);
        myButton.setId(4);
        myButton.setText("DONE ");

        EditText enterText = new EditText(context);
        enterText.setHint("Content");

        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.width = LayoutParams.MATCH_PARENT;
        layoutParams.height = LayoutParams.WRAP_CONTENT;

        myButton.setLayoutParams(layoutParams);

        EditText titleEditText = new EditText(context);
        titleEditText.setHint("Title");
        Spinner spinner = new Spinner(context);
        spinner.setId(3);

        //addViews
        addView(titleEditText);
        addView(spinner);
        addView(enterText);
        addView(myButton);



        //addView(myButton);


    }
}
