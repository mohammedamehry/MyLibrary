package com.proads.customads;

public interface CustomInterstitialListener {
    void OnAdClosed();
    void OnShowError(String error);
    void OnInterstitialNotLoaded();
}
