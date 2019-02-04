package com.example.heyshan.worknhire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.heyshan.worknhire.Chat.EmployersActivity;

public class Profile extends AppCompatActivity {
    public String empName,empEmail,empPhoneNo,empworkType;
    public Button chatWithEmployers;

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

        chatWithEmployers = findViewById(R.id.btnChatWithEmployer);
        chatWithEmployers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, EmployersActivity.class);
                startActivity(intent);
            }
        });
    }
}
