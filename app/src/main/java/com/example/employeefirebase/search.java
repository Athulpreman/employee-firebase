package com.example.employeefirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class search extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        e1=(EditText)findViewById(R.id.entercode);
        e2=(EditText)findViewById(R.id.name1);
        e3=(EditText)findViewById(R.id.salary1);
        e4=(EditText)findViewById(R.id.designation1);
        e5=(EditText)findViewById(R.id.company1);
        e6=(EditText)findViewById(R.id.district1);
        e7=(EditText)findViewById(R.id.place1);
        e8=(EditText)findViewById(R.id.mobile1);
        e9=(EditText)findViewById(R.id.email1);
        b=(Button)findViewById(R.id.search1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
    }
}
