package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity implements Main3Activityxc {

    public static final int INT = 20;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int a= INT;
        String name= "2222";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {

        }
    }
    @Override
    public  void  addup(){

    }
}
