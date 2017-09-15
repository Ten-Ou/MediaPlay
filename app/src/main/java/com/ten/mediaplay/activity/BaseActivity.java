package com.ten.mediaplay.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ten on 2017/9/15.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected BaseActivity activity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.activity = this;
//        this.app = (AhApp) getApplication();
        this.setContentView(getContentView());
        this.onExecute(savedInstanceState);
    }

    protected abstract int getContentView();

    protected abstract void onExecute(Bundle savedInstanceState);

}
