package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalculator;
    private Button btnIMC;
    private Button btnConverter;
    private EditText txtNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnCalculator=findViewById(R.id.btnCalculator);
        btnIMC=findViewById(R.id.btnIMC);
        btnConverter=findViewById(R.id.btnConverter);
        btnCalculator.setOnClickListener(this);
        btnIMC.setOnClickListener(this);
        btnConverter.setOnClickListener(this);
        txtNombre = findViewById(R.id.editNombre1);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.btnCalculator:
                Toast.makeText(this, "Loading Calculator",Toast.LENGTH_SHORT).show();
                intent = new Intent(this, CALC.class);
                intent.putExtra("nombreCalc", txtNombre.getText().toString());
                startActivity(intent);
                break;
            case R.id.btnIMC:
                Toast.makeText(this,"Loading IMC", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, IMC.class);
                intent.putExtra("nombreIMC", txtNombre.getText().toString());
                startActivity(intent);
                break;
            case R.id.btnConverter:
                Toast.makeText(this,"Loading Converter", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, CONVERT.class);
                intent.putExtra("nombreConver", txtNombre.getText().toString());
                startActivity(intent);
                break;
        }
    }
}