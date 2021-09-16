package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IMC extends AppCompatActivity {

    ImageView imagenEstado;
    EditText txtAltura;
    EditText txtPeso;
    Button btnCalcularIMC;
    TextView txtResultado;
    private String nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imc);
        imagenEstado= findViewById(R.id.imageView);
        txtAltura=findViewById(R.id.editTextEstatura);
        txtPeso=findViewById(R.id.editTextPeso);
        btnCalcularIMC=findViewById(R.id.btnCalcular);
        txtResultado= findViewById(R.id.resultado);
        btnCalcularIMC.setOnClickListener(this::onclick);
        txtPeso.setOnClickListener(this::onclick);
        Intent intent = getIntent();
        nombreUsuario = intent.getStringExtra("nombreIMC");
        Toast.makeText(this, " "+nombreUsuario+" bienvenid@ a IMC ",Toast.LENGTH_SHORT).show();



        //ImageView simpleImageView=(ImageView) findViewById(R.id.imageView);
        //simpleImageView.setImageResource(R.drawable.bodyMass);//set the source in java class
    }


    public Double CalcularIMC(double peso, double altura)
    {
        double imc =0;
        imc = peso / (altura*altura);
        return imc;
    }


    public  void onclick(View v){
        switch (v.getId()){
            case R.id.btnCalcular:{
                Double peso = Double.parseDouble(txtPeso.getText().toString());
                Double altura = Double.parseDouble(txtAltura.getText().toString());
                Double imc = CalcularIMC(peso, altura);
                Toast.makeText(this, "su IMC es: "+imc, Toast.LENGTH_LONG).show();
                txtResultado.setText("Su IMC es "+imc);
            }
        }
    }
}