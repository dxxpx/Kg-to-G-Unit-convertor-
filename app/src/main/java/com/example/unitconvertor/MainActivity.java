package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView,textView4,textView3,value_Grams;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        textView4=findViewById(R.id.textView4);
        textView3=findViewById(R.id.textView3);
        value_Grams=findViewById(R.id.Value_grams);
        editText=findViewById(R.id.editText);

        button=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertkgtog();
            }
        });

    }

    private void convertkgtog() {
        String enteredkgvalue=editText.getText().toString();
        double kilo=Double.parseDouble(enteredkgvalue);
        double grams=kilo/1000;
        value_Grams.setText(""+grams);
    }
}