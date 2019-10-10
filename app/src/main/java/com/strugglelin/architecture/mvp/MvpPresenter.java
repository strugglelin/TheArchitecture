package com.strugglelin.architecture.mvp;

import com.strugglelin.architecture.bean.Account;
import com.strugglelin.architecture.callback.ICallback;

/**
 * @author struggleLin
 * @date 2019/10/9
 * @description:
 */
public class MvpPresenter {
    private IMvpView mView;
    private MvpModel mModel;

    public MvpPresenter(IMvpView view) {
        this.mView = view;
        mModel = new MvpModel();
    }

    public void getAccountData(String accountName) {
        mModel.getAccountData(accountName, new ICallback() {
            @Override
            public void onSuccess(Account account) {
                mView.showSuccess(account);
            }

            @Override
            public void onFailed() {
                mView.showFailed();
            }
        });
    }
}
