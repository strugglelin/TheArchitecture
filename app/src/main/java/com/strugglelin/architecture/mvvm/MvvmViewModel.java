package com.strugglelin.architecture.mvvm;

import android.app.Application;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.strugglelin.architecture.BR;
import com.strugglelin.architecture.bean.Account;
import com.strugglelin.architecture.callback.ICallback;
import com.strugglelin.architecture.databinding.ActivityMvvmBinding;

/**
 * @author struggleLin
 * @date 2019/10/9
 * @description:
 */
public class MvvmViewModel extends BaseObservable {

    private Application application;
    private MvvmModel model;
    private ActivityMvvmBinding binding;
    private String result;
    private String userInput;

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    @Bindable
    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
        notifyPropertyChanged(BR.userInput);
    }

    public MvvmViewModel(Application application) {
        this.application = application;
        model = new MvvmModel();
    }

    public MvvmViewModel(Application application, ActivityMvvmBinding binding) {
        this.application = application;
        model = new MvvmModel();
        this.binding = binding;
    }

    public void getAccountData(View view) {
//        final String accountName = binding.etAccount.getText().toString();
        model.getAccountData(userInput, new ICallback() {
            @Override
            public void onSuccess(Account account) {
                String info = account.getName() + "|" + account.getLevel();
                setResult(info);
            }

            @Override
            public void onFailed() {
                setResult("获取数据失败！");
            }
        });
    }
}
