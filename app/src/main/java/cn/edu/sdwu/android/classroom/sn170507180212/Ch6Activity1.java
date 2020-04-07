package cn.edu.sdwu.android.classroom.sn170507180212;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Ch6Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch6_1);
        //在Java中获取
        String content=getString(R.string.hello);

        Log.i(Ch6Activity1.this.toString(),content);

        String sms=getString(R.string.sms);
        String s=String.format(sms,100,"张三");
        Log.i(Ch6Activity1.this.toString(),s);

    }
}
