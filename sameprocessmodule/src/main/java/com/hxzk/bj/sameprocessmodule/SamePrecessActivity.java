package com.hxzk.bj.sameprocessmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SamePrecessActivity extends AppCompatActivity {


    TextView tv_sameProcess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sameprocess);
        tv_sameProcess=findViewById(R.id.tv_sameprocess);
        if(getIntent().getStringExtra("data")!=null){
            tv_sameProcess.setText("接受到的数据:"+getIntent().getStringExtra("data"));
        }else{
            setTitle("发送数据为空");
        }
    }
}
