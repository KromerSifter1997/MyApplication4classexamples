package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnClick);
        //button.setOnClickListener(new HandleTheClick());
//        button.setOnClickListener(new View.OnClickListener() {
//
//            //this section shortcuts the below class
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        button.setOnClickListener(e->{

        });
    }


    //this section has been shortcutted by the above
    class HandleTheClick implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "I am a Toast Message", Toast.LENGTH_LONG).show();
        }

    }


}