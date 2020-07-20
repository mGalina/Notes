package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.notes.R.drawable.indicator_selected;

public class SecurityActivity extends AppCompatActivity implements View.OnClickListener {

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

    private ImageView backspace;

    private StringBuilder keyBuilder = new StringBuilder();
    private List<ImageView> keyViews = new ArrayList();

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

        backspace = findViewById(R.id.backspace);

        indicator1 = findViewById(R.id.indicator_1);
        indicator2 = findViewById(R.id.indicator_2);
        indicator3 = findViewById(R.id.indicator_3);
        indicator4 = findViewById(R.id.indicator_4);

        keyViews.add(indicator1);
        keyViews.add(indicator2);
        keyViews.add(indicator3);
        keyViews.add(indicator4);

        number0.setOnClickListener(this);
        number1.setOnClickListener(this);
        number2.setOnClickListener(this);
        number3.setOnClickListener(this);
        number4.setOnClickListener(this);
        number5.setOnClickListener(this);
        number6.setOnClickListener(this);
        number7.setOnClickListener(this);
        number8.setOnClickListener(this);
        number9.setOnClickListener(this);
        number0.setOnClickListener(this);

        backspace.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
            case R.id.btn_0:
                addKey(((TextView) v).getText().toString());
                break;
            case R.id.backspace:
                backspace();
                break;
        }
    }

    private void addKey(String key) {
        if (keyBuilder.length() < keyViews.size()) {
            keyBuilder.append(key);
            invalidateKeyView();
        } else {
            //code write success
        }
    }

    private void backspace() {
        keyBuilder.setLength(keyBuilder.length() - 1);
        invalidateKeyView();
    }

    private void invalidateKeyView() {
        for (ImageView v: keyViews) {
            v.setImageResource(R.drawable.indicator_select);
        }

        for (int i = 0; i < keyBuilder.length(); i++){
            keyViews.get(i).setImageResource(R.drawable.indicator_selected);
        }
    }
}