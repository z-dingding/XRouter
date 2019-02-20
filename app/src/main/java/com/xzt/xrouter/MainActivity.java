package com.xzt.xrouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hxzk.bj.common.DifferentProcessActionMessage;
import com.hxzk.bj.common.SameProcessActionMessage;
import com.xzt.xrouter.router.Xrouter;
import com.xzt.xrouter.router.XrouterRequest;
import com.xzt.xrouter.router.XrouterResponse;

public class MainActivity extends AppCompatActivity {

    Button btn_sameProcess;
    Button btn_differentProcess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sameProcess=findViewById(R.id.sameprocess);
        btn_differentProcess=findViewById(R.id.differnetprocess);

        btn_differentProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //封装传递的请求数据到XrouterRequest
                XrouterRequest mXrouterRequest =XrouterRequest.create().putData("data","发给不同进程的数据测试").putActionName(DifferentProcessActionMessage.DIFFERENTPROCESSACTIONNAME);
                XrouterResponse mXrouterResponse=Xrouter.getInstance().senMessage(MainActivity.this,mXrouterRequest);
                Toast.makeText(MainActivity.this,mXrouterResponse.getResponseResult()+"",Toast.LENGTH_LONG).show();

            }
        });
        btn_sameProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //封装传递的请求数据到XrouterRequest
                XrouterRequest mXrouterRequest =XrouterRequest.create().putData("data","发给同进程的数据测试").putActionName(SameProcessActionMessage.SANEPORICESSBANE);
                XrouterResponse mXrouterResponse=Xrouter.getInstance().senMessage(MainActivity.this,mXrouterRequest);
                Toast.makeText(MainActivity.this,mXrouterResponse.getResponseResult()+"",Toast.LENGTH_LONG).show();

            }
        });
    }
}
