package com.example.PdmdMasControles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private static final String[] COUNTRIES = new String[] {
            "España", "Francia", "Italia", "Alemania", "Noruega", "Japon", "Portugal"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.paisesArray);
        textView.setAdapter(adapter);

        ToggleButton toggle = (ToggleButton) findViewById(R.id.tbGusta);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    TextView tv = findViewById(R.id.tvTexto);
                    tv.setText(R.string.vivir);
                } else {
                    // The toggle is disabled
                    TextView tv = findViewById(R.id.tvTexto);
                    tv.setText(R.string.noVivir);
                }
            }
        });

        lanzar();



    }

    private void lanzar() {

    }


}
