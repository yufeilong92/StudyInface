package com.example.dell.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private Button mBtn;
    private Button mButton;
    private Button mButton2;
    private D d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void data() {
        Status.swt(Status.CASUE);
        Status.swt(Status.UPDATE);
        Status.swt(Status.DOWN);
    }

    private void initView() {
        int String;
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(this);

        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                Intent intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:" +
                                "123456465"));
                startActivity(intent);
                break;
            case R.id.button:
                a(new F());
                a(new M());
                a(new E());
                break;
            case R.id.button2:
                Param param = new Param();
                param.a = 2;
                param.b = 1;
                add(param);
                Log.e(TAG, "onClick: "+add(param) );
                Param param1 = new Param();
                param1.a = 3;
                param1.b = 3;
                sub(param1);
                Log.e(TAG, "onClick: "+sub(param1) );
                break;
        }
    }

    public interface D {
        public void show();
    }

    private class M implements D {
        @Override
        public void show() {
            Log.e(TAG, "show: M");
        }
    }

    private static final String TAG = "========";

    private class E implements D {

        @Override
        public void show() {
            Log.e(TAG, "show:E ");
        }
    }

    private class F implements D {

        @Override
        public void show() {
            Log.e(TAG, "show:F ");
        }
    }

    public void a(D d) {
        d.show();
    }

    private class Param {
        int a;
        int b;
    }

    private int add(Param param) {
        return param.a + param.b;
    }

    private int sub(Param param) {
        return param.a - param.b;
    }
}
