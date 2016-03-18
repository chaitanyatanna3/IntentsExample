package com.example.chaitanya.intentsexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textViewSecond;
    EditText editTextSecond;
    Button buttonToFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);

        textViewSecond = (TextView) findViewById(R.id.textSecond);
        editTextSecond = (EditText) findViewById(R.id.editSend);
        buttonToFirst = (Button) findViewById(R.id.btn_toFirst);

        String string = getIntent().getStringExtra("username");
        textViewSecond.setText("Welcome, " + string);

        buttonToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("databack", editTextSecond.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
