package com.umbrella.exer_9_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText title = findViewById(R.id.title);
                EditText price = findViewById(R.id.price);
                Product product = new Product(title.getText().toString(), Integer.parseInt(price.getText().toString()));
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("product", product);
                startActivity(intent);
            }
        });

    }
}