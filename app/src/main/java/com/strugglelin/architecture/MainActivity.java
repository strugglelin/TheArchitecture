package com.strugglelin.architecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.strugglelin.architecture.databinding.DataBindingActivity;
import com.strugglelin.architecture.mvc.MvcActivity;
import com.strugglelin.architecture.mvp.MvpActivity;
import com.strugglelin.architecture.mvvm.MvvmActivity;
import com.strugglelin.architecture.normal.NormalActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnNormal).setOnClickListener(this);
        findViewById(R.id.btnMvc).setOnClickListener(this);
        findViewById(R.id.btnMvp).setOnClickListener(this);
        findViewById(R.id.btnMvvm).setOnClickListener(this);
        findViewById(R.id.btnBinding).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNormal:
                startActivity(new Intent(MainActivity.this, NormalActivity.class));
                break;
            case R.id.btnMvc:
                startActivity(new Intent(MainActivity.this, MvcActivity.class));
                break;
            case R.id.btnMvp:
                startActivity(new Intent(MainActivity.this, MvpActivity.class));
                break;
            case R.id.btnMvvm:
                startActivity(new Intent(MainActivity.this, MvvmActivity.class));
                break;
            case R.id.btnBinding:
                startActivity(new Intent(MainActivity.this, DataBindingActivity.class));
                break;
            default:
                break;
        }
    }
}
