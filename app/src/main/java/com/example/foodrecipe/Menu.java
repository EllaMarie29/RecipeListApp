package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodrecipe.R;

public class Menu extends AppCompatActivity {
    ImageView r1Img,r2Img,r3Img;
    TextView r1Text,r2Text,r3Text,titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        r1Img = findViewById(R.id.r1_img);
        r2Img = findViewById(R.id.r2_img);
        r3Img = findViewById(R.id.r3_img);

        r1Text = findViewById(R.id.r1);
        r2Text = findViewById(R.id.r2);
        r3Text = findViewById(R.id.r3);
        titleText = findViewById(R.id.title);

        Intent getTitleAndRecipe = getIntent();
        String title = getTitleAndRecipe.getStringExtra("Title");
        String r_1 = getTitleAndRecipe.getStringExtra("R1");
        String r_2 = getTitleAndRecipe.getStringExtra("R2");
        String r_3 = getTitleAndRecipe.getStringExtra("R3");

        Intent getIng = getIntent();
        String ing1 = getIng.getStringExtra("Ing1");
        String ing2 = getIng.getStringExtra("Ing2");
        String ing3 = getIng.getStringExtra("Ing3");

        Intent getPro= getIntent();
        String pro1 = getPro.getStringExtra("Pro1");
        String pro2 = getPro.getStringExtra("Pro2");
        String pro3 = getPro.getStringExtra("Pro3");


        titleText.setText(title);
        r1Text.setText(r_1);
        r2Text.setText(r_2);
        r3Text.setText(r_3);


        r1Text.setOnClickListener((View v)-> {
            Intent toDisplay = new Intent(Menu.this,Display.class);
            toDisplay.putExtra("Ingredient",ing1);
            toDisplay.putExtra("Procedure",pro1);
            toDisplay.putExtra("Name",r_1);

            startActivity(toDisplay);
        });

        r2Text.setOnClickListener((View v)-> {

            Intent toDisplay = new Intent(Menu.this,Display.class);
            toDisplay.putExtra("Ingredient",ing2);
            toDisplay.putExtra("Procedure",pro2);
            toDisplay.putExtra("Name",r_2);

            startActivity(toDisplay);


        });

        r3Text.setOnClickListener((View v)-> {

            Intent toDisplay = new Intent(Menu.this,Display.class);
            toDisplay.putExtra("Ingredient",ing3);
            toDisplay.putExtra("Procedure",pro3);
            toDisplay.putExtra("Name",r_3);

            startActivity(toDisplay);

        });







    }
}