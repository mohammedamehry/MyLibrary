package com.proads.customads;

import android.app.Activity;

public interface RewardListener {
    void OnReward();
    void OnClose();
    void  OnError(String error);
}
