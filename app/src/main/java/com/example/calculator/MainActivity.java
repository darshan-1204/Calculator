package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b00,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,minus,ans,cBtn,multiply,divide;
    TextView txts;
    int fnum,snum;
    char Q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b00 = findViewById(R.id.b00);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        txts = findViewById(R.id.txts);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        ans = findViewById(R.id.ans);
        cBtn = findViewById(R.id.cBtn);


        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"00");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txts.getText().toString();
                txts.setText(old+"9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum = Integer.parseInt(txts.getText().toString());
                txts.setText("");
                txts.setHint("");
                Q='+';
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum = Integer.parseInt(txts.getText().toString());
                txts.setText("");
                txts.setHint("");
                Q='-';
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum = Integer.parseInt(txts.getText().toString());
                txts.setText("");
                txts.setHint("");
                Q='*';
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum = Integer.parseInt(txts.getText().toString());
                txts.setText("");
                txts.setHint("");
                Q='/';
            }
        });


        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String old = txts.getText().toString();
                snum = Integer.parseInt(old);

                switch (Q)
                {
                    case '+':
                        txts.setText(""+(fnum+snum));
                        break;

                    case '-':
                        txts.setText(""+(fnum-snum));
                        break;

                    case '*':
                        txts.setText(""+(fnum*snum));
                        break;

                    case '/':
                        txts.setText(""+(fnum/snum));
                        break;
                }
            }
        });

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txts.setText("");
            }
        });
    }
}