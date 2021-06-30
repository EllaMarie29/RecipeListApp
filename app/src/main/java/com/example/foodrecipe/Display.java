package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodrecipe.R;

public class Display extends AppCompatActivity {
    TextView nameRec,ingText,instructText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        nameRec = findViewById(R.id.recipe_name);
        ingText = findViewById(R.id.ingredients);
        instructText = findViewById(R.id.instruct);

        Intent getNameAndIng = getIntent();
        String procedure = getNameAndIng.getStringExtra("Procedure");
        String name = getNameAndIng.getStringExtra("Name");
        String ing = getNameAndIng.getStringExtra("Ingredient");

        if(name.equals("SHEEPHERDER’S BREAKFAST")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.bf1);
        }else if(name.equals("TWICE BAKED BREAKFAST POTATOES")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.bf2);
        }else if(name.equals("Loco Moco")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.bf3);
        }else if(name.equals("PB&J Rolls")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.l1);
        }else if(name.equals("Walt’s Chili")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.l2);
        }else if(name.equals("Tonga Toast")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.l3);
        }else if(name.equals("Maple Soy Salmon")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.d1);
        }else if(name.equals("Crisp Skinned Barramundi")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.d2);
        }else if(name.equals("Clay Pot Snapper")){
            ImageView imageView = (ImageView) findViewById(R.id.recipe_img);
            imageView.setBackgroundResource(R.drawable.d3);
        }

        nameRec.setText(name);
        ingText.setText(ing);
        instructText.setText(procedure);
    }
}