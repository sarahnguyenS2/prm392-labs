package com.example.randomnumber;

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

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edtMin;
    EditText edtMax;
    Button btnGenerate;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtMin = findViewById(R.id.edtMin);
        edtMax = findViewById(R.id.edtMax);
        btnGenerate = findViewById(R.id.btnGenerate);
        txtResult = findViewById(R.id.txtResult);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minNum = Integer.parseInt(edtMin.getText().toString());
                int maxNum = Integer.parseInt(edtMax.getText().toString());
                Random rn = new Random();
                int rs = rn.nextInt(maxNum - minNum + 1) + minNum;
                txtResult.setText(rs + "");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}