 //fuente: https://crunchify.com/how-to-create-simple-calculator-android-app-using-android-studio/


package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, mas, menos, multi, divi, igual, punto, C;
    EditText pantalla;
    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cero = findViewById(R.id.btn0);
        uno = findViewById(R.id.btn1);
        dos = findViewById(R.id.btn2);
        tres = findViewById(R.id.btn3);
        cuatro = findViewById(R.id.btn4);
        cinco = findViewById(R.id.btn5);
        seis = findViewById(R.id.btn6);
        siete = findViewById(R.id.btn7);
        ocho = findViewById(R.id.btn8);
        nueve = findViewById(R.id.btn9);
        mas = findViewById(R.id.btnSuma);
        menos = findViewById(R.id.btnResta);
        multi = findViewById(R.id.btnMulti);
        divi = findViewById(R.id.btnDivi);
        igual= findViewById(R.id.btnIgual);
        punto = findViewById(R.id.btnPunto);
        C = findViewById(R.id.btnC);
        pantalla = findViewById(R.id.edtPantalla);


        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + ".");
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText("");
            }
        });

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "1");
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "2");
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "3");
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "4");
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "5");
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "6");
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "7");
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "8");
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "9");
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (pantalla == null) {
                    pantalla.setText("");
                } else {
                    mValueOne = Float.parseFloat(pantalla.getText() + "");
                    crunchifyAddition = true;
                    pantalla.setText(null);
                }
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(pantalla.getText() + "");
                mSubtract = true;
                pantalla.setText(null);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(pantalla.getText() + "");
                crunchifyMultiplication = true;
                pantalla.setText(null);
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(pantalla.getText() + "");
                crunchifyDivision = true;
                pantalla.setText(null);
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(pantalla.getText() + "");

                if (crunchifyAddition == true) {
                    pantalla.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    pantalla.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    pantalla.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    pantalla.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });
    }
}