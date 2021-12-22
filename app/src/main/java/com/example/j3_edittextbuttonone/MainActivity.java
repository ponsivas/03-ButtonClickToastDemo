package com.example.j3_edittextbuttonone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText IN;
    Button PR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IN = (EditText) findViewById(R.id.TEXT);
        PR = (Button) findViewById(R.id.PRESS);

        PR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (IN.getText().length()==0){
                    Toast toast = Toast.makeText(getApplicationContext(), "Enter text in the EditText and Click the Button", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), IN.getText().toString(), Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });

    }
}