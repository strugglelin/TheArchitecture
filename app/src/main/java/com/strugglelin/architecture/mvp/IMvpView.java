package com.strugglelin.architecture.mvp;

import com.strugglelin.architecture.bean.Account;

/**
 * @author struggleLin
 * @date 2019/10/9
 * @description:
 */
public interface IMvpView {
    /**
     * 获取用户输入信息
     * @return
     */
    String getAccount();

    /**
     * 获取用户信息成功
     * @param account
     */
    void showSuccess(Account account);

    /**
     * 获取用户信息失败
     */
    void showFailed();
}
