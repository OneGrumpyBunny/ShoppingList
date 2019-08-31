package com.example.shoppinglist;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // define name of Bundle
    public static final int REQUEST_ADDITEM = 1;

    private static final String SAVED_ITEMS = "com.example.shoppinglist.SAVED_ITEMS";

    List<TextView> textViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewList = new ArrayList<TextView>();
        textViewList.add((TextView) findViewById(R.id.Item1));
        textViewList.add((TextView) findViewById(R.id.Item2));
        textViewList.add((TextView) findViewById(R.id.Item3));
        textViewList.add((TextView) findViewById(R.id.Item4));
        textViewList.add((TextView) findViewById(R.id.Item5));
        textViewList.add((TextView) findViewById(R.id.Item6));
        textViewList.add((TextView) findViewById(R.id.Item7));
        textViewList.add((TextView) findViewById(R.id.Item8));
        textViewList.add((TextView) findViewById(R.id.Item9));
        textViewList.add((TextView) findViewById(R.id.Item10));

        // Restore instance state
        if (savedInstanceState != null) {
            ArrayList<String> savedItems = savedInstanceState.getStringArrayList(SAVED_ITEMS);
            if (savedItems != null) {
                for (int i = 0; i < savedItems.size(); i++) {
                    textViewList.get(i).setText(savedItems.get(i));
                }
            }
        }

        // Find the Button
        Button buttonMainClick = findViewById(R.id.add_item);

        // Set a click listener on that View
        buttonMainClick.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the main button is clicked.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ItemsActivity.class);
                startActivityForResult(intent, REQUEST_ADDITEM);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Loop through the text views and save items
        ArrayList<String> savedItems = new ArrayList<String>();
        for (TextView view : textViewList) {
            if (!view.getText().toString().equals("")) {
                savedItems.add(view.getText().toString());
            }
        }
        outState.putStringArrayList(SAVED_ITEMS, savedItems);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_ADDITEM && resultCode == RESULT_OK) {
            String item = data.getStringExtra(ItemsActivity.EXTRA_ITEM_NAME);

            // Loop through text views and add item to first empty one
            for (TextView view : textViewList) {
                if (view.getText().toString().equals("")) {
                    view.setText(item);
                    break;
                }
            }
        }
    }
}
