package com.example.employeefirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText ecode,ename,esalary,edesignation,ecompany,edistrict,eplace,emobile,eemail;
    Button button,b1;
    String c,n,s,d,co,di,p,m,e;
    Spinner spinner;
    addviewall addview;
    DatabaseReference reference;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ecode=(EditText)findViewById(R.id.code);
        ename=(EditText)findViewById(R.id.name);
        esalary=(EditText)findViewById(R.id.salary);
        edesignation=(EditText)findViewById(R.id.designation);
        ecompany=(EditText)findViewById(R.id.company);
        eplace=(EditText)findViewById(R.id.place);
        emobile=(EditText)findViewById(R.id.mobile);
        eemail=(EditText)findViewById(R.id.email);
        spinner=(Spinner)findViewById(R.id.district);
        b1=(Button)findViewById(R.id.search);
        addview=new addviewall();
        reference= FirebaseDatabase.getInstance().getReference().child("Employee");
        pb=(ProgressBar)findViewById(R.id.pro);

        button=(Button)findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pb.setVisibility(View.VISIBLE);

                c=ecode.getText().toString();
                n=ename.getText().toString();
                s=esalary.getText().toString();
                d=edesignation.getText().toString();
                co=ecompany.getText().toString();
                p=eplace.getText().toString();
                m=emobile.getText().toString();
                e=eemail.getText().toString();
                di=spinner.getSelectedItem().toString();


                addview.setCode(c);
                addview.setName(n);
                addview.setSalary(s);
                addview.setDesignation(d);
                addview.setCompany(co);
                addview.setDistrict(di);
                addview.setPlace(p);
                addview.setMobile(m);
                addview.setEmail(e);

                reference.push().setValue(addview);
                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();
                pb.setVisibility(View.INVISIBLE);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
