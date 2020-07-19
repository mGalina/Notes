package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.notes.R.drawable.indicator_selected;

public class SecurityActivity extends AppCompatActivity {

    private Button number1;
    private Button number2;
    private Button number3;
    private Button number4;
    private Button number5;
    private Button number6;
    private Button number7;
    private Button number8;
    private Button number9;
    private Button number0;

    private ImageView indicator1;
    private ImageView indicator2;
    private ImageView indicator3;
    private ImageView indicator4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

        init();
    }

    private void init() {
        number1 = findViewById(R.id.btn_1);
        number2 = findViewById(R.id.btn_2);
        number3 = findViewById(R.id.btn_3);
        number4 = findViewById(R.id.btn_4);
        number5 = findViewById(R.id.btn_5);
        number6 = findViewById(R.id.btn_6);
        number7 = findViewById(R.id.btn_7);
        number8 = findViewById(R.id.btn_8);
        number9 = findViewById(R.id.btn_9);
        number0 = findViewById(R.id.btn_0);

        indicator1 = findViewById(R.id.indicator_1);
        indicator2 = findViewById(R.id.indicator_2);
        indicator3 = findViewById(R.id.indicator_3);
        indicator4 = findViewById(R.id.indicator_4);

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indicator1.setBackgroundResource(R.drawable.indicator_selected);
            }
        });
    }
}