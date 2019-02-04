package com.example.heyshan.worknhire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.heyshan.worknhire.Chat.ChatActivity;

public class profile1 extends AppCompatActivity {
    public String empName,empEmail,empPhoneNo,empworkType,workerId;
    public Button btnChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);
        empName=getIntent().getStringExtra("firstname")+" "+getIntent().getStringExtra("lastname");
        empEmail=getIntent().getStringExtra("email");
        empPhoneNo=getIntent().getStringExtra("phoneno");
        empworkType=getIntent().getStringExtra("worktype");
        workerId = getIntent().getStringExtra("workerId");

        TextView displayName=findViewById(R.id.fullnametxt1);
        displayName.setText(empName);
        TextView displayEmail=findViewById(R.id.emailtxt1);
        displayEmail.setText(empEmail);
        TextView displayContact=findViewById(R.id.telephonetxt1);
        displayContact.setText(empPhoneNo);
        TextView displayWorktype=findViewById(R.id.worktypetxt1);
        displayWorktype.setText(empworkType);

        btnChat = findViewById(R.id.btnCreateChat);
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile1.this, ChatActivity.class);
                intent.putExtra("receiverId", workerId);
                intent.putExtra("receiverName", empName);
                startActivity(intent);
            }
        });
    }
}
