package com.strugglelin.architecture.callback;

import com.strugglelin.architecture.bean.Account;

/**
 * @author struggleLin
 * @date 2019/10/9
 * @description:
 */
public interface ICallback {
    /**
     * 查询账户成功
     * @param account
     */
    void onSuccess(Account account);

    /**
     * 查询账户失败
     */
    void onFailed();
}
