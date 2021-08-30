package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    ImageView imagenPrincipal;
    Spinner spinnerDe;
    Spinner spinnerPara;
    Button btnConvertir;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Add Money spinnerA
        Spinner spnMoneda0 = (Spinner) findViewById(R.id.spinnerA);
        ArrayList<SpinnerMoney> monedaList0 = new ArrayList<SpinnerMoney>();
        monedaList0.add(new SpinnerMoney("1", "Peso Colombiano"));

        //Fill Data spinnerA
        ArrayAdapter<SpinnerMoney> monedaAdapter0 = new ArrayAdapter<SpinnerMoney>(MainActivity3.this,
                android.R.layout.simple_spinner_dropdown_item, monedaList0);
        spnMoneda0.setAdapter(monedaAdapter0);


        //Add Money spinnerDe
        Spinner spnMoneda = (Spinner) findViewById(R.id.spinnerDe);
        ArrayList<SpinnerMoney> monedaList = new ArrayList<SpinnerMoney>();
        monedaList.add(new SpinnerMoney("1", "Dolar"));
        monedaList.add(new SpinnerMoney("2", "Euro"));
        monedaList.add(new SpinnerMoney("3", "Peso Chileno"));
        monedaList.add(new SpinnerMoney("4", "Yen"));
        monedaList.add(new SpinnerMoney("5", "Franco"));
        monedaList.add(new SpinnerMoney("6", "Dirham"));

        //Fill Data spinnerDe
        ArrayAdapter<SpinnerMoney> monedaAdapter = new ArrayAdapter<SpinnerMoney>(MainActivity3.this,
                android.R.layout.simple_spinner_dropdown_item, monedaList);
        spnMoneda.setAdapter(monedaAdapter);




        imagenPrincipal= findViewById(R.id.imageView);
        spinnerDe=findViewById(R.id.spinnerDe);
        spinnerPara=findViewById(R.id.spinnerA);
        btnConvertir=findViewById(R.id.btnConvertir);
        txtResultado= findViewById(R.id.txtR);
        btnConvertir.setOnClickListener(this::onclick);
        txtResultado.setOnClickListener(this::onclick);

    }

    public Double Operacion(String origen)
    {
        //Origen cambia moneda
        //Destino peso colombiano
        double tasa = 0;
        double operacion=0;
        double  monedaDestino=1;
        if(origen == "Dolar")
        {
            tasa = 3828.99;
        }
        else if(origen == "Euro")
        {
            tasa = 4517.2;
        }
        else if(origen == "Peso Chileno")
        {
            tasa = 4.89;
        }
        else if(origen == "Yen")
        {
            tasa = 34.86;
        }
        else if(origen == "Franco")
        {
            tasa = 37.58;
        }
        else if(origen == "Dirham")
        {
            tasa = 1042.47;
        }
        operacion = monedaDestino*tasa;
        return operacion;
    }

    public  void onclick(View v){
        switch (v.getId()){
            case R.id.btnConvertir:{
                String origen = spinnerDe.getSelectedItem().toString();
                String destino = spinnerPara.getSelectedItem().toString();
                Double cambio = Operacion(origen);
                Toast.makeText(this, "De "+origen+" a "+destino+" el cambio es "+cambio, Toast.LENGTH_LONG).show();
                txtResultado.setText("De "+origen+" a "+destino+" el cambio es "+cambio);
            }
        }
    }

}