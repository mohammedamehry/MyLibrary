package com.proads.customads;

import android.app.Activity;

public interface InitListener {
    void OnInitialized(Activity activity);
    void OnFailed(String Error);
}
