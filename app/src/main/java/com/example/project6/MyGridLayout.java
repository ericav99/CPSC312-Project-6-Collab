package com.example.project6;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MyGridLayout extends GridLayout{
    public MyGridLayout(final Context context) {
        super(context);

        Button myButton = new Button(context);
        myButton.setText("ADD NEW NOTE ");
        myButton.setId(0);

        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.width = LayoutParams.MATCH_PARENT;
        layoutParams.height = LayoutParams.WRAP_CONTENT;
        myButton.setLayoutParams(layoutParams);
        addView(myButton);

    }
}
