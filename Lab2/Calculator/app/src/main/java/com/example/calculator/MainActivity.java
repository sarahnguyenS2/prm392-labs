package com.example.calculator;

import static java.lang.String.*;

import android.annotation.SuppressLint;
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
    EditText edtFirstNum;
    EditText edtSecondNum;
    Button btnSum;
    Button btnSubtract;
    Button btnMultiple;
    Button btnDivide;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtFirstNum = findViewById(R.id.edtFirstNum);
        edtSecondNum = findViewById(R.id.edtSecondNum);
        btnSum = findViewById(R.id.btnSum);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiple = findViewById(R.id.btnMultiple);
        btnDivide = findViewById(R.id.btnDivide);
        txtResult = findViewById(R.id.txtResult);

//        int firstNum = Integer.parseInt(edtFirstNum.getText().toString());
//        int secondNum = Integer.parseInt(edtSecondNum.getText().toString());

        btnSum.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                int firstNum = Integer.parseInt(edtFirstNum.getText().toString());
                int secondNum = Integer.parseInt(edtSecondNum.getText().toString());
                int rs = firstNum + secondNum;
                txtResult.setText(format("%d", rs));
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                int firstNum = Integer.parseInt(edtFirstNum.getText().toString());
                int secondNum = Integer.parseInt(edtSecondNum.getText().toString());
                int rs = firstNum - secondNum;
                txtResult.setText(format("%d", rs));
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                int firstNum = Integer.parseInt(edtFirstNum.getText().toString());
                int secondNum = Integer.parseInt(edtSecondNum.getText().toString());
                int rs = firstNum * secondNum;
                txtResult.setText(format("%d", rs));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                int firstNum = Integer.parseInt(edtFirstNum.getText().toString());
                int secondNum = Integer.parseInt(edtSecondNum.getText().toString());
                int rs = firstNum / secondNum;
                txtResult.setText(String.format("%s", rs));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}