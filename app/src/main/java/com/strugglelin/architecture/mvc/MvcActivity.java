package com.strugglelin.architecture.mvc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.strugglelin.architecture.R;
import com.strugglelin.architecture.bean.Account;
import com.strugglelin.architecture.callback.ICallback;

/**
 * @author struggleLin
 * @date 2019/10/9
 * @description:
 */
public class MvcActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 输入查询信息
     */
    private AppCompatEditText etAccount;
    /**
     * 展示查询结果
     */
    private AppCompatTextView tvResult;

    private MvcModel mMvcModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);
        initView();
    }

    /**
     * 初始化数据
     */
    private void initView() {
        etAccount = findViewById(R.id.etAccount);
        tvResult = findViewById(R.id.tvResult);
        findViewById(R.id.btnGetAccount).setOnClickListener(this);
        mMvcModel = new MvcModel();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGetAccount:
                mMvcModel.getAccountData(getAccount(), new ICallback() {
                    @Override
                    public void onSuccess(Account account) {
                        showSuccess(account);
                    }

                    @Override
                    public void onFailed() {
                        showFailed();
                    }
                });
                break;
        }
    }

    /**
     * 获取用户输入信息
     *
     * @return
     */
    private String getAccount() {
        return etAccount.getText().toString();
    }

    /**
     * 获取用户信息成功
     *
     * @param account
     */
    private void showSuccess(Account account) {
        tvResult.setText("账户名：" + account.getName() + ",账户等级：" + account.getLevel());
    }

    /**
     * 获取用户信息失败
     */
    private void showFailed() {
        tvResult.setText("获取数据失败！");
    }
}
