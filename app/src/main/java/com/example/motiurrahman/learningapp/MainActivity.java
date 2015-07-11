package com.example.motiurrahman.learningapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{

    Button btn1, btn2, btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button control1 = (Button) findViewById(R.id.btn1);
        Button control2 = (Button) findViewById(R.id.btn2);
        Button control3 = (Button) findViewById(R.id.btn3);
      //  Button control4 = (Button) findViewById(R.id.btn4);

        // control1.setOnClick
        control1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "control1", Toast.LENGTH_LONG).show();
            }
        });
        control2.setOnClickListener(this);
        control3.setOnClickListener(listner);


    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplication(), "Control2", Toast.LENGTH_LONG).show();
    }

    View.OnClickListener listner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplication(), "control3", Toast.LENGTH_LONG).show();
        }
    };

    public  void btn4(View v){
        Toast.makeText(getApplication(), "control4", Toast.LENGTH_LONG).show();
    }


}




