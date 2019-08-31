package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.shoppinglist.MainActivity.REQUEST_ADDITEM;

public class ItemsActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_NAME = "com.example.shoppinglist.EXTRA_ITEM_NAME";

    public String itemName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        // Find the Buttons
        Button buttonAppleClick = findViewById(R.id.button_apple);
        Button buttonBananaClick = findViewById(R.id.button_banana);
        Button buttonCucumberClick = findViewById(R.id.button_cucumber);
        Button buttonDoritosClick = findViewById(R.id.button_doritos);
        Button buttonEggplantClick = findViewById(R.id.button_eggplant);
        Button buttonFritosClick = findViewById(R.id.button_fritos);
        Button buttonGrapesClick = findViewById(R.id.button_grapes);
        Button buttonMayoClick = findViewById(R.id.button_mayo);
        Button buttonIceCreamClick = findViewById(R.id.button_icecream);
        Button buttonJuiceClick = findViewById(R.id.button_juice);

        // Set a click listener on Apple Button
        buttonAppleClick.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main button is clicked.

            @Override
            public void onClick(View view) {
                itemName = "Apple";
                doOnClick(itemName);
            }

        });

        // Set a click listener on Banana Button
        buttonBananaClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Banana";
                doOnClick(itemName);
            }
        });

        // Set a click listener on Cucumber Button
        buttonCucumberClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Cucumber";
                doOnClick(itemName);
            }
        });
        // Set a click listener on Doritos Button
        buttonDoritosClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Doritos";
                doOnClick(itemName);
            }
        });
        // Set a click listener on Eggplant Button
        buttonEggplantClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Eggplant";
                doOnClick(itemName);
            }
        });
        // Set a click listener on Fritos Button
        buttonFritosClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Fritos";
                doOnClick(itemName);
            }
        });
        // Set a click listener on Grapes Button
        buttonGrapesClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Grapes";
                doOnClick(itemName);
            }
        });
        // Set a click listener on Mayo Button
        buttonMayoClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Mayo";
                doOnClick(itemName);
            }
        });
        // Set a click listener on Ice Cream Button
        buttonIceCreamClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Ice Cream";
                doOnClick(itemName);
            }
        });
        // Set a click listener on Juice Button
        buttonJuiceClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                itemName = "Juice";
                doOnClick(itemName);
            }
        });
    }

    // call this method to save the value and return to MainActivity
    private void doOnClick(String itemName) {
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_ITEM_NAME, itemName);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}
