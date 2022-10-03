package com.example.layoutcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.numerouno);
        num2 = (EditText) findViewById(R.id.numerodos);
        res = (TextView) findViewById(R.id.result);
    }
    public void sumar(View view) {
        double suma1 = Double.parseDouble(num1.getText().toString());
        double suma2 = Double.parseDouble(num2.getText().toString());

        double suma3 = suma1 + suma2;
        //Resultado
        res.setText(""+suma3);
        Toast.makeText(this, "El resultado es " + suma3, Toast.LENGTH_LONG).show();
    }
    public void restar (View view)
    {
        double resta1 =Double.parseDouble(num1.getText().toString());
        double resta2 = Double.parseDouble(num2.getText().toString());
        double resta3 = resta1 - resta2;
        res.setText(""+resta3);
        Toast.makeText(this, "El resultado es " + resta3, Toast.LENGTH_LONG).show();
    }

    public void multiplicar (View view)
    {
        double multi1 = Double.parseDouble(num1.getText().toString());
        double multi2 = Double.parseDouble(num2.getText().toString());
        double multi3 = multi1 * multi2;
        res.setText(""+multi3);
        Toast.makeText(this, "El resultado es " + multi3, Toast.LENGTH_LONG).show();
    }
    public void division(View view)
    {
        double div1 = Double.parseDouble(num1.getText().toString());
        double div2 = Double.parseDouble(num2.getText().toString());
        double div3 = div1 / div2 ;
        res.setText(""+div3);
        Toast.makeText(this, "El resultado es " + div3, Toast.LENGTH_LONG).show();
    }
}