package com.strugglelin.architecture.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.strugglelin.architecture.BR;

/**
 * @author struggleLin
 * @date 2019/10/9
 * @description:
 */
public class Account extends BaseObservable {
    // 账户名称
    private String name;
    // 账户等级
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        notifyPropertyChanged(BR.level);
    }
}
