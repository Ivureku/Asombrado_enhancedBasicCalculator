package com.example.enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddition = findViewById(R.id.btnAddition);
        Button btnSubtraction = findViewById(R.id.btnSubtraction);
        Button btnDivision = findViewById(R.id.btnDivision);
        Button btnMultiplication = findViewById(R.id.btnMultiplication);
        Button btnMod = findViewById(R.id.btnModulo);

        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnMod.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
            double operand1=0;
            double operand2=1;

            EditText oprnd1 = findViewById(R.id.txtOperand1);
            EditText oprnd2 = findViewById(R.id.txtOperand2);
            TextView ans = findViewById(R.id.txtAnswer);

            operand1 = Double.parseDouble(oprnd1.getText().toString());
            operand2 = Double.parseDouble(oprnd2.getText().toString());

            switch (view.getId()) {
                case R.id.btnAddition:
                    ans.setText(Double.toString(doAddition(operand1,operand2)));
                    break;
                case R.id.btnDivision:
                    ans.setText(Double.toString(doDivision(operand1,operand2)));
                    break;
                case R.id.btnSubtraction:
                    ans.setText(Double.toString(doSubtraction(operand1,operand2)));
                    break;
                case R.id.btnMultiplication:
                    ans.setText(Double.toString(doMultiplication(operand1,operand2)));
                    break;
                case R.id.btnModulo:
                    ans.setText(Double.toString(doModulo(operand1,operand2)));


    }
}

    public static double doAddition(double x, double y){
        return x + y;
    }

    public static double doDivision(double operand1, double operand2){
        return operand1 / operand2;
    }
    public static double doMultiplication(double operand1, double operand2){
        return operand1 * operand2;
    }

    public static double doSubtraction(double operand1, double operand2){
        return operand1 - operand2;
    }

    public static double doModulo(double operand1, double operand2){
        return operand1 % operand2;
    }




}