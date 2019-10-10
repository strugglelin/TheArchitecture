package com.strugglelin.architecture.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.strugglelin.architecture.R;
import com.strugglelin.architecture.bean.Account;

/**
 * @author struggleLin
 * @date 2019/10/10
 * @description:
 */
public class DataBindingActivity extends AppCompatActivity implements View.OnClickListener {

    private Account account;
    private ActivityBindingBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_binding);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_binding);
        account = new Account();
        account.setName("小王");
        account.setLevel(100);
        binding.setAccount(account);
        binding.setActivity(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAddLevel:
//                Toast.makeText(this,"点击了",Toast.LENGTH_LONG).show();
                int level = account.getLevel();
                account.setLevel(level+1);
//                binding.setAccount(account);
                break;
        }
    }
}
