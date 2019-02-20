package com.hxzk.bj.differnertprocess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DifferentProcessActivity extends AppCompatActivity {


    TextView tv_differentProcess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_differentprocess);
        tv_differentProcess=findViewById(R.id.tv_differentProcess);
        if(getIntent().getStringExtra("data")!=null){
            tv_differentProcess.setText("接受到的数据:"+getIntent().getStringExtra("data"));
        }else{
            setTitle("发送数据为空");
        }
    }
}
