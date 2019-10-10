package com.strugglelin.architecture.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.strugglelin.architecture.R;
import com.strugglelin.architecture.databinding.ActivityMvvmBinding;

/**
 * @author struggleLin
 * @date 2019/10/10
 * @description:
 */
public class MvvmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMvvmBinding binding;
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        MvvmViewModel model = new MvvmViewModel(getApplication());
        binding.setViewModel(model);
    }
}
