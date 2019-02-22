package com.example.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2, t3;
    Button b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b3=findViewById(R.id.button5);
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final String tt1 = t1.getText().toString();
                final String tt2 = t2.getText().toString();
                final String tt3 = t3.getText().toString();


                double kg,g,m;

                if (tt2.equals("") && tt3.equals(""))
                {
                    kg = Double.parseDouble(tt1);
                    g = 1000 * kg;
                    m = 10000 * kg;
                    String gg = Double.toString(g);
                    String mm = Double.toString(m);
                    t2.setText(gg);
                    t3.setText(mm);
                }
                else if (tt1.equals("") && tt3.equals(""))
                {
                    g = Double.parseDouble(tt2);
                    kg = g / 1000;
                    m = 1000 * kg;
                    String kgg = Double.toString(kg);
                    String mm = Double.toString(m);
                    t1.setText(kgg);
                    t3.setText(mm);
                }
                else if (tt1.equals("") && tt2.equals(""))
                {
                    m = Double.parseDouble(tt3);
                    kg = m / 10000;
                    g = m / 1000;
                    String gg = Double.toString(g);
                    String kgg = String.format("%.4f",kg);
                    t2.setText(gg);
                    t1.setText(kgg);
                }
                Toast.makeText(getApplicationContext(),"Convert", Toast.LENGTH_SHORT).show();
            }
        });

        b4=findViewById(R.id.button6);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");

                Toast.makeText(getApplicationContext(),"Reset", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
