package com.pion.pionmxh.Manhinhchao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.pion.pionmxh.ManHinhDangNhap.ManHinhDangNhapActivity;
import com.pion.pionmxh.R;

public class ManHinhChaoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                }
                catch(Exception e){

                }
                finally{
                    Intent intent=new Intent(ManHinhChaoActivity.this, ManHinhDangNhapActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        thread.start();
    }

}
