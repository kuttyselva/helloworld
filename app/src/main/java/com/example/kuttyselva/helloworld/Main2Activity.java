package com.example.kuttyselva.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    EditText et1;
    Button btn;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       et1=(EditText)findViewById(R.id.et1);
       btn=(Button)findViewById(R.id.button2);

    }
    public void back(View v)
    {
        Intent i= new Intent(this,Main3Activity.class);
        value=et1.getText().toString();
        i.putExtra("value",value);
        startActivity(i);
        finish();
    }
}
