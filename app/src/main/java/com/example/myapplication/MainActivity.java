package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonAdd = findViewById(R.id.button1);
        Button buttonSubtract = findViewById(R.id.button4);
        Button buttonMultiply = findViewById(R.id.button2);
        Button buttonDivide = findViewById(R.id.button3);
        Button Back=findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Authentification.class );
                startActivity(intent);
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add(v);
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Soustraction(v);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiply(v);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Devide(v);
            }
        });
    }

    public void Add(View v){
        EditText Number1 = findViewById(R.id.Number1);
        EditText Number2 = findViewById(R.id.Number2);
        TextView Result = findViewById(R.id.Result);
        double num1 = Double.parseDouble(Number1.getText().toString());
        double num2 = Double.parseDouble(Number2.getText().toString());
        double res = num1 + num2;
        Result.setText(String.valueOf(res));
    }

    public void Soustraction(View v){
        EditText Number1 = findViewById(R.id.Number1);
        EditText Number2 = findViewById(R.id.Number2);
        TextView Result = findViewById(R.id.Result);
        double num1 = Double.parseDouble(Number1.getText().toString());
        double num2 = Double.parseDouble(Number2.getText().toString());
        double res = num1 - num2;
        Result.setText(String.valueOf(res));
    }

    public void Multiply(View v){
        EditText Number1 = findViewById(R.id.Number1);
        EditText Number2 = findViewById(R.id.Number2);
        TextView Result = findViewById(R.id.Result);
        double num1 = Double.parseDouble(Number1.getText().toString());
        double num2 = Double.parseDouble(Number2.getText().toString());
        double res = num1 * num2;
        Result.setText(String.valueOf(res));
    }

    public void Devide(View v){
        EditText Number1 = findViewById(R.id.Number1);
        EditText Number2 = findViewById(R.id.Number2);
        TextView Result = findViewById(R.id.Result);
        double num1 = Double.parseDouble(Number1.getText().toString());
        double num2 = Double.parseDouble(Number2.getText().toString());
        double res = num1 / num2;
        Result.setText(String.valueOf(res));
    }
}
