package com.example.heyshan.worknhire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    public String empName,empEmail,empPhoneNo,empworkType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        empName=getIntent().getStringExtra("firstname")+" "+getIntent().getStringExtra("lastname");
        empEmail=getIntent().getStringExtra("email");
        empPhoneNo=getIntent().getStringExtra("phoneno");
        empworkType=getIntent().getStringExtra("worktype");

        TextView displayName=findViewById(R.id.fullnametxt);
        displayName.setText(empName);
        TextView displayEmail=findViewById(R.id.emailtxt);
        displayEmail.setText(empEmail);
        TextView displayContact=findViewById(R.id.telephonetxt);
        displayContact.setText(empPhoneNo);
        TextView displayWorktype=findViewById(R.id.worktypetxt);
        displayWorktype.setText(empworkType);

    }
}
