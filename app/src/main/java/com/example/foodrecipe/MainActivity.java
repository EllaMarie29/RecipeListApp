package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.foodrecipe.R;

public class MainActivity extends AppCompatActivity {
    TextView bfastBtn,lunchBtn,dinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bfastBtn=findViewById(R.id.bfast);
        lunchBtn=findViewById(R.id.lunch);
        dinBtn=findViewById(R.id.dinner);

        bfastBtn.setOnClickListener((View v)->{
            Intent toMenu= new Intent(MainActivity.this, Menu.class);
            toMenu.putExtra("Title", getText(R.string.breakfast));
            toMenu.putExtra("R1", getText(R.string.breakfast1));
            toMenu.putExtra("R2", getText(R.string.breakfast2));
            toMenu.putExtra("R3", getText(R.string.breakfast3));

            toMenu.putExtra("Ing1", getText(R.string.bf1_ing));
            toMenu.putExtra("Ing2", getText(R.string.bf2_ing));
            toMenu.putExtra("Ing3", getText(R.string.bf3_ing));

            toMenu.putExtra("Pro1", getText(R.string.pro1_bf));
            toMenu.putExtra("Pro2", getText(R.string.pro2_bf));
            toMenu.putExtra("Pro3", getText(R.string.pro3_bf));

            startActivity(toMenu);

        });

        lunchBtn.setOnClickListener((View v)->{
            Intent toMenu= new Intent(MainActivity.this, Menu.class);
            toMenu.putExtra("Title", getText(R.string.lunch));
            toMenu.putExtra("R1", getText(R.string.lunch1));
            toMenu.putExtra("R2", getText(R.string.lunch2));
            toMenu.putExtra("R3", getText(R.string.lunch3));

            toMenu.putExtra("Ing1", getText(R.string.l1_ing));
            toMenu.putExtra("Ing2", getText(R.string.l2_ing));
            toMenu.putExtra("Ing3", getText(R.string.l3_ing));


            toMenu.putExtra("Pro1", getText(R.string.pro1_l));
            toMenu.putExtra("Pro2", getText(R.string.pro2_l));
            toMenu.putExtra("Pro3", getText(R.string.pro3_l));

            startActivity(toMenu);

        });

        dinBtn.setOnClickListener((View v)->{
            Intent toMenu= new Intent(MainActivity.this, Menu.class);
            toMenu.putExtra("Title", getText(R.string.dinner));
            toMenu.putExtra("R1", getText(R.string.dinner1));
            toMenu.putExtra("R2", getText(R.string.dinner2));
            toMenu.putExtra("R3", getText(R.string.dinner3));

            toMenu.putExtra("Ing1", getText(R.string.d1_ing));
            toMenu.putExtra("Ing2", getText(R.string.d2_ing));
            toMenu.putExtra("Ing3", getText(R.string.d3_ing));

            toMenu.putExtra("Pro1", getText(R.string.pro1_d));
            toMenu.putExtra("Pro2", getText(R.string.pro2_d));
            toMenu.putExtra("Pro3", getText(R.string.pro3_d));

            startActivity(toMenu);
        });


    }
}