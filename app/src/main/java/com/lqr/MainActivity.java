package com.lqr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.lqr.optionitemview.OptionItemView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OptionItemView oiv = (OptionItemView) findViewById(R.id.oiv);
        oiv.setOnOptionItemClickListener(new OptionItemView.OnOptionItemClickListener() {
            @Override
            public void leftOnClick() {
                Toast.makeText(getApplicationContext(), "左图标被点击", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightOnClick() {
                Toast.makeText(getApplicationContext(), "右图标被点击", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
