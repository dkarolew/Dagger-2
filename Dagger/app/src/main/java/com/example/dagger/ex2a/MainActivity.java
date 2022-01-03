package com.example.dagger.ex2a;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger.R;

import javax.inject.Inject;

// Exercise 2a - Inject external class (ex. some third-part library)

public class MainActivity extends AppCompatActivity {
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

        car.drive();
    }
}