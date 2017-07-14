package com.codekul.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOkayOld = (Button) findViewById(R.id.btnOkay);

        Button btnOkay = findViewById(R.id.btnOkay);
        //btnOkay.setOnClickListener(new Click());
        btnOkay.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        TextView txtVw = findViewById(R.id.txtVw);

                        EditText etName1 = findViewById(R.id.etNm1);

                        EditText etName2 = findViewById(R.id.etNm2);

                        txtVw.setText(etName1.getText().toString() +" - "+etName2.getText().toString());
                    }
                }
        );
    }

    private class Click implements View.OnClickListener {

        @Override
        public void onClick(View view) {

        }
    }

    public void onOther(View view) {

    }
}
