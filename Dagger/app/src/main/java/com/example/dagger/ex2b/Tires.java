package com.example.dagger.ex2b;

import android.util.Log;

public class Tires {
    // Third-party class - cannot be annotated it with @Inject

    private static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
