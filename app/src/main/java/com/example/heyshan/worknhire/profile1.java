package com.example.heyshan.worknhire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class profile1 extends AppCompatActivity {
    public String empName,empEmail,empPhoneNo,empworkType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);
        empName=getIntent().getStringExtra("firstname")+" "+getIntent().getStringExtra("lastname");
        empEmail=getIntent().getStringExtra("email");
        empPhoneNo=getIntent().getStringExtra("phoneno");
        empworkType=getIntent().getStringExtra("worktype");

        TextView displayName=findViewById(R.id.fullnametxt1);
        displayName.setText(empName);
        TextView displayEmail=findViewById(R.id.emailtxt1);
        displayEmail.setText(empEmail);
        TextView displayContact=findViewById(R.id.telephonetxt1);
        displayContact.setText(empPhoneNo);
        TextView displayWorktype=findViewById(R.id.worktypetxt1);
        displayWorktype.setText(empworkType);
    }
}
