package com.example.motiurrahman.learningapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends Activity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button control1 = (Button)findViewById(R.id.btn1);
    Button control2 = (Button)findViewById(R.id.btn2);
    Button control3 = (Button)findViewById(R.id.btn3);

}
