package com.example.kuttyselva.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void topclick(View v)
    {

        Toast.makeText(this,"topbutton clicked",Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this,Main2Activity.class);

        startActivity(i);
    }
}
