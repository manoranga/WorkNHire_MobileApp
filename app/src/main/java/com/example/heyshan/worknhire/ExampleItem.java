package com.example.heyshan.worknhire;

public class ExampleItem {
    private String mEmpname;
    private String mEmpEmail;

    public ExampleItem(String empName, String empEmail ){
        mEmpEmail=empEmail;
        mEmpname=empName;
    }
    public String getName(){
        return mEmpname;
    }

    public String getEmail() {
        return mEmpEmail;
    }
}
