package com.strugglelin.architecture.mvc;

import com.strugglelin.architecture.bean.Account;
import com.strugglelin.architecture.callback.ICallback;
import java.util.Random;

/**
 * @author struggleLin
 * @date 2019/10/9
 * @description:
 */
public class MvcModel {

    /**
     * 查询获取用户数据
     *
     * @param accountName
     * @param callback
     */
    public void getAccountData(String accountName, ICallback callback) {
        Random random = new Random();
        boolean isSuccess = random.nextBoolean();
        if (isSuccess) {
            Account account = new Account();
            account.setName(accountName);
            account.setLevel(100);
            callback.onSuccess(account);
        } else {
            callback.onFailed();
        }
    }
}
