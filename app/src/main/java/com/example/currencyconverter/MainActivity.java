package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText u_sDollar,egyptianPound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewCompat.setLayoutDirection(getWindow().getDecorView(), ViewCompat.LAYOUT_DIRECTION_LTR);
        u_sDollar=findViewById(R.id.editU_S);
        egyptianPound=findViewById(R.id.editEgypt);

    }

    public void convert(View view) {


        String usString,egyptString;

        usString=u_sDollar.getText().toString();
        egyptString=egyptianPound.getText().toString();


        if (usString.equals("")&&egyptString.equals(""))
        {
            Toast.makeText(MainActivity.this,"Invalid data – try again",Toast.LENGTH_LONG).show();

        }

        else if (!(usString.equals(""))&&egyptString.equals(""))
        {

            egyptianPound.setText(String.valueOf((Float.parseFloat(usString))*((Float.parseFloat("19.53")))));


        }
        else if ((usString.equals(""))&&!(egyptString.equals("")))
        {

            u_sDollar.setText(String.valueOf((Float.parseFloat(egyptString))/((Float.parseFloat("19.53")))));

        }

    }

    public void clear(View view) {
        u_sDollar.setText(String.valueOf(""));
        egyptianPound.setText(String.valueOf(""));

    }
}