package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DrinkActivity extends AppCompatActivity {

    RadioGroup rg_drink;
    Button btnOrderDrink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_drink);

        rg_drink = findViewById(R.id.rg_drink);
        btnOrderDrink = findViewById(R.id.btnOrderDrink);

        btnOrderDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rg_drink.getCheckedRadioButtonId();
                RadioButton selectedRadioBtn = findViewById(selectedId);
                String selectedDrink = selectedRadioBtn.getText().toString();

                Intent resultIntent =  new Intent();
                resultIntent.putExtra("selected_item", selectedDrink);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.drinkLinear), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}