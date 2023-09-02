package com.example.temp_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText cel;
    private TextView fah;
    private TextView kel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        cel = findViewById(R.id.cel);
        fah = findViewById(R.id.fah);
        kel = findViewById(R.id.kel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = cel.getText().toString();
                int celci = Integer.parseInt(s);
                double fahren = (celci * 1.8) + 32;
                double kelvin = (celci +273.15);
                fah.setText(" " + fahren);
                kel.setText(" " + kelvin);
            }
        });
    }
}