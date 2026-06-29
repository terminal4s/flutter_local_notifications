package com.dexterous.flutterlocalnotifications;

import android.content.Intent;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

@Keep
public enum CustomLaunchIntentProvider {
  INSTANCE;

  @Nullable private volatile Intent intent;

  public static CustomLaunchIntentProvider getInstance() {
    return INSTANCE;
  }

  public void setIntent(@Nullable Intent intent) {
    this.intent = intent == null ? null : new Intent(intent);
  }

  @Nullable
  public Intent getIntent() {
    Intent currentIntent = intent;
    return currentIntent == null ? null : new Intent(currentIntent);
  }

  public void clearIntent() {
    intent = null;
  }
}
