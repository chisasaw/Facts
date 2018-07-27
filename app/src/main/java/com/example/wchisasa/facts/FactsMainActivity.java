package com.example.wchisasa.facts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.LENGTH_LONG;

public class FactsMainActivity extends AppCompatActivity {

    //Declare the view variables
    private FactBook factBook = new FactBook();
    private TextView factTextView;
    private Button showButton;
    private RelativeLayout relativeLayout;
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts_main);

        //set the fact view
        factTextView = findViewById(R.id.factTextView);
        showButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //The button was clicked, show the next fact
                int colorNumber = colorWheel.getColor();
                String fact = factBook.getFact();
                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(colorNumber);
                showButton.setTextColor(colorNumber);
                //Toast.makeText(FactsMainActivity.this,"An activity was created", Toast.LENGTH_LONG).show();

            }
        };
        showButton.setOnClickListener(listener);

    }
}
